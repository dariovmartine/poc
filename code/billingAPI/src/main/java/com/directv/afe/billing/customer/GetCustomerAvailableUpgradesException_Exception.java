
package com.directv.afe.billing.customer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GetCustomerAvailableUpgradesException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class GetCustomerAvailableUpgradesException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetCustomerAvailableUpgradesException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetCustomerAvailableUpgradesException_Exception(String message, GetCustomerAvailableUpgradesException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetCustomerAvailableUpgradesException_Exception(String message, GetCustomerAvailableUpgradesException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directv.afe.billing.customer.GetCustomerAvailableUpgradesException
     */
    public GetCustomerAvailableUpgradesException getFaultInfo() {
        return faultInfo;
    }

}
