
package com.directvla.contract.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AddCustomerAgreementException", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0")
public class AddCustomerAgreementException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AddCustomerAgreementException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AddCustomerAgreementException(String message, com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementException
     */
    public com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementException getFaultInfo() {
        return faultInfo;
    }

}