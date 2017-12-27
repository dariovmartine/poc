
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GetCustomerProductsByProductIdException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class GetCustomerProductsByProductIdException_Exception
    extends Exception
{
	private static final long serialVersionUID = 1L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetCustomerProductsByProductIdException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetCustomerProductsByProductIdException_Exception(String message, GetCustomerProductsByProductIdException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetCustomerProductsByProductIdException_Exception(String message, GetCustomerProductsByProductIdException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.GetCustomerProductsByProductIdException
     */
    public GetCustomerProductsByProductIdException getFaultInfo() {
        return faultInfo;
    }

}