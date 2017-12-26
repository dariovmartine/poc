
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GetCustomersByIdentificationException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class GetCustomersByIdentificationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetCustomersByIdentificationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetCustomersByIdentificationException_Exception(String message, GetCustomersByIdentificationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetCustomersByIdentificationException_Exception(String message, GetCustomersByIdentificationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.GetCustomersByIdentificationException
     */
    public GetCustomersByIdentificationException getFaultInfo() {
        return faultInfo;
    }

}
