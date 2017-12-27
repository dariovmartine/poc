
package com.directv.afe.billing.invoice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ManageBillingEvents_pt", targetNamespace = "http://directvla.com/contract/businessdomain/ManageBillingEvents/v1-0", wsdlLocation = "file:/home/marco/Code/Java/dtv/poc/code/billingAPI/src/test/resources/ManageBillingEventsService.wsdl")
public class ManageBillingEventsPt_Service
    extends Service
{

    private final static URL MANAGEBILLINGEVENTSPT_WSDL_LOCATION;
    private final static WebServiceException MANAGEBILLINGEVENTSPT_EXCEPTION;
    private final static QName MANAGEBILLINGEVENTSPT_QNAME = new QName("http://directvla.com/contract/businessdomain/ManageBillingEvents/v1-0", "ManageBillingEvents_pt");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/marco/Code/Java/dtv/poc/code/billingAPI/src/test/resources/ManageBillingEventsService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANAGEBILLINGEVENTSPT_WSDL_LOCATION = url;
        MANAGEBILLINGEVENTSPT_EXCEPTION = e;
    }

    public ManageBillingEventsPt_Service() {
        super(__getWsdlLocation(), MANAGEBILLINGEVENTSPT_QNAME);
    }

    public ManageBillingEventsPt_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANAGEBILLINGEVENTSPT_QNAME, features);
    }

    public ManageBillingEventsPt_Service(URL wsdlLocation) {
        super(wsdlLocation, MANAGEBILLINGEVENTSPT_QNAME);
    }

    public ManageBillingEventsPt_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANAGEBILLINGEVENTSPT_QNAME, features);
    }

    public ManageBillingEventsPt_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManageBillingEventsPt_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ManageBillingEventsPt
     */
    @WebEndpoint(name = "ManageBillingEvents_ptPort")
    public ManageBillingEventsPt getManageBillingEventsPtPort() {
        return super.getPort(new QName("http://directvla.com/contract/businessdomain/ManageBillingEvents/v1-0", "ManageBillingEvents_ptPort"), ManageBillingEventsPt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManageBillingEventsPt
     */
    @WebEndpoint(name = "ManageBillingEvents_ptPort")
    public ManageBillingEventsPt getManageBillingEventsPtPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://directvla.com/contract/businessdomain/ManageBillingEvents/v1-0", "ManageBillingEvents_ptPort"), ManageBillingEventsPt.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANAGEBILLINGEVENTSPT_EXCEPTION!= null) {
            throw MANAGEBILLINGEVENTSPT_EXCEPTION;
        }
        return MANAGEBILLINGEVENTSPT_WSDL_LOCATION;
    }

}