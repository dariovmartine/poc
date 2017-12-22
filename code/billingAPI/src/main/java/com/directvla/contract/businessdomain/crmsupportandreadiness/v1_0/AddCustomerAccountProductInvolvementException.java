
package com.directvla.contract.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AddCustomerAccountProductInvolvementException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class AddCustomerAccountProductInvolvementException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AddCustomerAccountProductInvolvementException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AddCustomerAccountProductInvolvementException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementException
     */
    public com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementException getFaultInfo() {
        return faultInfo;
    }

}
