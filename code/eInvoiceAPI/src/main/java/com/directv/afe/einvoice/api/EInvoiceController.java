package com.directv.afe.einvoice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.directv.afe.einvoice.api.feign.client.Client;
import com.directv.afe.einvoice.api.feign.client.ClientService;
import com.directv.afe.einvoice.api.feign.email.EmailService;
import com.directv.afe.einvoice.api.feign.email.Response;
import com.directv.afe.einvoice.api.feign.invoice.Invoice;
import com.directv.afe.einvoice.api.feign.invoice.InvoiceService;

@RestController
public class EInvoiceController {
	
	@Value("${property}")
	String property = null;
	
	@RequestMapping("/")
    public Config config() {
        return new Config(property);
    }
	
	@Autowired
    private ClientService clientService;
	
	@Autowired
    private EmailService emailService;
	
	@Autowired
    private InvoiceService 	invoiceService;
   
    @RequestMapping("/invoices")
    public EInvoice einvoice(@RequestParam(value="clientId") Long clientId) {
    	Client client = clientService.client(clientId);
    	Invoice invoice = invoiceService.invoice(clientId);
    	Response sendEmailResponse = emailService.sendEmail(null, null, null, null);
    	
        return new EInvoice("Ok, " + "client: " + client + ", invoice: " + invoice + ", emailResponse: " + sendEmailResponse);
    }
}
