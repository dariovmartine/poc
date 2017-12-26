package com.directv.afe.billing.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.directv.afe.billing.config.Config;
import com.directv.afe.billing.domain.BillFlow;
import com.directv.afe.billing.domain.BillRequest;
import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.domain.Country;
import com.directv.afe.billing.service.BillFlowService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="billController")
public class BillController {
	
	@RequestMapping("/")
    public Config config() {
        return new Config("billing API");
    }
	
	@Autowired
	private BillFlowService service;
    
	/**
	 * @flow 
	 *  get customer data
     *	PREPAID should close the flow, they doesn't have billing
     *	if it's POSTPAID
     *	if it has email on request, we should update it
     *	if not we should get the mail of the get customer data
     *	Search for invoice to get the billing, get customer invoice
     *	on request we have a billing ID, search for that bill otherwise get the lates
	 * @param request
	 * @return
	 */
	@ApiOperation(value = "Get a bill",response = BillResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = BillResponse.OK_CODE, message = BillResponse.OK_MESSAGE),
            @ApiResponse(code = BillResponse.UNAUTHORIZED_CODE, message = BillResponse.UNAUTHORIZED_MESSAGE),
            @ApiResponse(code = BillResponse.FORBIDDEN_CODE, message = BillResponse.FORBIDDEN_MESSAGE),
            @ApiResponse(code = BillResponse.NOT_FOUND_CODE, message = BillResponse.NOT_FOUND_MESSAGE)
    }
    )
    @RequestMapping(value="/getBill", method= RequestMethod.POST, consumes = "application/json",  produces = "application/json")
    public DeferredResult<BillResponse> sendEmail(@RequestBody(required = true) BillRequest request) {
    	

		// TODO: Validate if it has customerKey
		// TODO: Validate that request has a valid email if it has
		if (request.getCountry() == null)
    		throw new IllegalArgumentException("country is null");
    	
    	String country = request.getCountry().toUpperCase();
    	if (! Country.contains(country)) {
    		throw new IllegalArgumentException("country " + country +  " isn't in " +  Country.values());
    	}

    	BillFlow userBill = getUserBill(request);
    	service.getBill(userBill);
    	
    	// and more
    	return userBill.getResponse();
    }

	private BillFlow getUserBill(BillRequest request) {
		BillFlow userBill = new BillFlow();
		userBill.setCountry(Country.parseString(request.getCountry().trim().toUpperCase()));
		userBill.setCustomerKey(request.getCustomerKey().trim());
		if(request.getBillID() != null && !request.getBillID().isEmpty()) {
			userBill.setBillID(request.getBillID().trim());
		}
		if(request.getEmail() != null && !request.getEmail().isEmpty()) {
			userBill.setEmail(request.getEmail().trim());
		}
		return userBill;
	}
}
