package com.directv.afe.billing.ws.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.annotation.PostConstruct;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.directv.afe.billing.customer.CRMSupportAndReadinessPt;
import com.directv.afe.billing.customer.ContactMedium;
import com.directv.afe.billing.customer.ContactMediumCollection;
import com.directv.afe.billing.customer.Customer;
import com.directv.afe.billing.customer.CustomerAccount;
import com.directv.afe.billing.customer.EditCustomer;
import com.directv.afe.billing.customer.EditCustomerRequest;
import com.directv.afe.billing.customer.EditCustomerResponse;
import com.directv.afe.billing.customer.EmailContact;
import com.directv.afe.billing.customer.GetCustomer;
import com.directv.afe.billing.customer.GetCustomerRequest;
import com.directv.afe.billing.customer.GetCustomerResponse;
import com.directv.afe.billing.customer.RequestMetadataType;
import com.directv.afe.billing.domain.BillFlow;
import com.directv.afe.billing.domain.BillResponse;
import com.directv.afe.billing.domain.Country;
import com.directv.afe.billing.domain.CustomerType;

@Component
public class CustomerClient {

	private static final Long PREPAID_ACCOUNT_IDENTIFIER = 1l;
	private static final Long PREPAID_ACCOUNT_IDENTIFIER_TT = 27l;

	private static final int RANDOM_INT = 100000000;

	private static final Logger logger = LoggerFactory.getLogger(CustomerClient.class);

	private CRMSupportAndReadinessPt soapService;
	
	@Autowired
	@Qualifier("errorChannel")
	private AbstractMessageChannel errorChannel;

	@Value("${service.customer.url}")
	private String url;

	@PostConstruct
	public void postConstruct() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CRMSupportAndReadinessPt.class);
		factory.setAddress(url);
		soapService = (CRMSupportAndReadinessPt) factory.create();
	}

	private String getRequestId() {
		Random rn = new Random();
		int rnNumber = rn.nextInt(RANDOM_INT) + 1;
		return String.valueOf(rnNumber);
	}

	private RequestMetadataType getRequestMetadataType(String country) {
		RequestMetadataType requestMetadataType = new RequestMetadataType();
		requestMetadataType.setRequestID(getRequestId());
		requestMetadataType.setSourceID(country);
		return requestMetadataType;
	}

	/**
	 * 
	 * Returns a customer account by Customer ID or null
	 * CRMSupportAndReadiness.GetCustomer Web Service Client.
	 * 
	 * @param deferredResult
	 * 
	 * @param customerKey
	 * @param countryCode
	 * @return {@link Customer}
	 */
	public void getCustomerData(BillFlow userBill, AbstractMessageChannel outputChannel) {

		GetCustomer customer = new GetCustomer();
		customer.setCustomerKey(userBill.getCustomerKey());
		GetCustomerRequest getCustomerRequest = new GetCustomerRequest();
		getCustomerRequest.setGetCustomer(customer);
		getCustomerRequest.setRequestMetadata(getRequestMetadataType(userBill.getCountry().toString()));

		soapService.getCustomerAsync((GetCustomerRequest) getCustomerRequest, new AsyncHandler<GetCustomerResponse>() {

			@Override
			public void handleResponse(Response<GetCustomerResponse> res) {
				try {
					if (res.get() instanceof GetCustomerResponse) {
						CustomerType customerType = getCustomerType(res.get().getGetCustomerResult().getCustomer());
						List<String> registeredMails = getCustomerEmails(
								res.get().getGetCustomerResult().getCustomer());
						userBill.setCustomerType(customerType);
						userBill.setRegisteredMails(registeredMails);
						Message<BillFlow> message = MessageBuilder.withPayload(userBill).build();
						outputChannel.send(message);
					}
				} catch (InterruptedException | ExecutionException execution) {
					logger.error("Couldn't get customer information.");
					BillResponse response = new BillResponse(BillResponse.RESOURCE_ERROR_CODE, BillResponse.RESOURCE_ERROR_MESSAGE);
					Message<BillResponse> message = MessageBuilder.withPayload(response).build();
					errorChannel.send(message);
				}

			}

			private CustomerType getCustomerType(Customer customer) {
				if (!isPrepaidAccount(customer, userBill.getCountry())) {
					return CustomerType.POSTPAID;
				}
				return CustomerType.PREPAID;
			}

			/**
			 * It validates account type based on the account rank
			 * 
			 * @param customer
			 * @param countryCode
			 * @return
			 */
			private boolean isPrepaidAccount(Customer customer, Country country) {
				if (Country.TT == country) {
					return PREPAID_ACCOUNT_IDENTIFIER_TT.equals(customer.getCustomerRank());
				}
				return PREPAID_ACCOUNT_IDENTIFIER.equals(customer.getCustomerRank());
			}

			public List<String> getCustomerEmails(Customer customer) {
				List<String> mails = new ArrayList<>();
				List<ContactMedium> listContactMedium = customer.getContactableVia().getContactMedium();
				Iterator<ContactMedium> it = listContactMedium.iterator();
				while (it.hasNext()) {
					ContactMedium contactMedium = (ContactMedium) it.next();
					if (contactMedium instanceof EmailContact) {
						mails.add(((EmailContact) contactMedium).getEMailAddress().trim().toLowerCase());
					}
				}

				return mails;
			}
		});
	}

	public void addMail(BillFlow userBill) {

		logger.debug("Adding customer emails");

		String newEmail = userBill.getEmail();
		String identification = userBill.getCustomerKey();
		String country = userBill.getCountry().toString();

		EmailContact emailContact = new EmailContact();
		emailContact.setAddressId(0);
		emailContact.setEMailAddress(newEmail);

		EditCustomerRequest request = new EditCustomerRequest();
		request.setRequestMetadata(getRequestMetadataType(country));
		EditCustomer editCustomer = new EditCustomer();
		Customer customer = new Customer();
		customer.setID(identification);
		ContactMediumCollection cont = new ContactMediumCollection();
		customer.setContactableVia(cont);
		CustomerAccount custAccount = new CustomerAccount();
		custAccount.setID("0");
		editCustomer.setCustAccount(custAccount);
		editCustomer.setCust(customer);

		Integer reason = 1;
		editCustomer.setReason(reason);
		editCustomer.getCust().getContactableVia().getContactMedium().add(emailContact);
		request.setEditCustomer(editCustomer);

		soapService.editCustomerAsync((EditCustomerRequest) request, new AsyncHandler<EditCustomerResponse>() {
			@Override
			public void handleResponse(Response<EditCustomerResponse> res) {
				try {
					if (res.get() instanceof EditCustomerResponse) {
						// TODO: NOTIFY?
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}

}
