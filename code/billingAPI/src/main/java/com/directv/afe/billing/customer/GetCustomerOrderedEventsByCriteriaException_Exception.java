
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GetCustomerOrderedEventsByCriteriaException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class GetCustomerOrderedEventsByCriteriaException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetCustomerOrderedEventsByCriteriaException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetCustomerOrderedEventsByCriteriaException_Exception(String message, GetCustomerOrderedEventsByCriteriaException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetCustomerOrderedEventsByCriteriaException_Exception(String message, GetCustomerOrderedEventsByCriteriaException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.GetCustomerOrderedEventsByCriteriaException
     */
    public GetCustomerOrderedEventsByCriteriaException getFaultInfo() {
        return faultInfo;
    }

}
