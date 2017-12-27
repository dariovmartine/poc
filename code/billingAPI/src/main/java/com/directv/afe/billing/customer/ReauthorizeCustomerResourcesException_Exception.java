
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ReauthorizeCustomerResourcesException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class ReauthorizeCustomerResourcesException_Exception
    extends Exception
{
	private static final long serialVersionUID = 1L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ReauthorizeCustomerResourcesException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ReauthorizeCustomerResourcesException_Exception(String message, ReauthorizeCustomerResourcesException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ReauthorizeCustomerResourcesException_Exception(String message, ReauthorizeCustomerResourcesException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.ReauthorizeCustomerResourcesException
     */
    public ReauthorizeCustomerResourcesException getFaultInfo() {
        return faultInfo;
    }

}