
package com.directvla.contract.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AddCustomerAccountException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class AddCustomerAccountException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AddCustomerAccountException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AddCustomerAccountException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountException
     */
    public com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountException getFaultInfo() {
        return faultInfo;
    }

}