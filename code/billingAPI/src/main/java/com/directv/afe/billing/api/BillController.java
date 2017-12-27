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
	 *  Obtain from ISB the customer data
     *	If user is type PREPAID should close the flow, they doesn't have billing
     *	if send an email on request, we should update it if its different from the other mails
     *	if doesn't send the email use the one on customer data
     *		User has 2 mail address (BILLING and ?) allways update both
     *	Search for invoice to get the billing, getCustomerInvoice
     *	On request we have a billing ID, search for that bill otherwise get the latest
     *	Validate billing with an external service based on country
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

		IllegalArgumentException hasError = validatePa1rams(request);
		if(hasError != null) {
			throw hasError;
		}
		
    	BillFlow billFlow = getBillFlow(request);
    	service.getBill(billFlow);
    	
    	return billFlow.getResponse();
    }

	/**
	 * Here we check for all parameters that are needed for the flow
	 * @param request to be validated if it has all the mandatory parameters
	 * @return an exception if it has an invalid mandatory parameter
	 */
	private IllegalArgumentException validatePa1rams(BillRequest request) {
		if (request.getCustomerKey() == null) {
			return new IllegalArgumentException("CustomerKey is null");
		}
		if (request.getCountry() == null) {
			return new IllegalArgumentException("Country is null");
		}
		String country = request.getCountry().toUpperCase();
    	if (! Country.contains(country)) {
    		throw new IllegalArgumentException("Country " + country +  " isn't in " +  Country.values());
    	}
		return null;
	}

	private BillFlow getBillFlow(BillRequest request) {
		BillFlow userBill = new BillFlow();
		userBill.setCountry(Country.parseString(request.getCountry().trim().toUpperCase()));
		userBill.setCustomerKey(request.getCustomerKey().trim());
		if(request.getBillID() != null && !request.getBillID().isEmpty()) {
			userBill.setBillID(request.getBillID().trim());
		}
		if(request.getEmail() != null && !request.getEmail().isEmpty()) {
			userBill.setEmail(request.getEmail().trim());
		}
		if(request.getRequestId() != null) {
			userBill.setRequestId(request.getRequestId());
		}
		return userBill;
	}
}
