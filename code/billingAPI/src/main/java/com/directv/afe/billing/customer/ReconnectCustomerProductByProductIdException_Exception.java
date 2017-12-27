
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ReconnectCustomerProductByProductIdException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class ReconnectCustomerProductByProductIdException_Exception
    extends Exception
{
	private static final long serialVersionUID = 1L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ReconnectCustomerProductByProductIdException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ReconnectCustomerProductByProductIdException_Exception(String message, ReconnectCustomerProductByProductIdException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ReconnectCustomerProductByProductIdException_Exception(String message, ReconnectCustomerProductByProductIdException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.ReconnectCustomerProductByProductIdException
     */
    public ReconnectCustomerProductByProductIdException getFaultInfo() {
        return faultInfo;
    }

}
