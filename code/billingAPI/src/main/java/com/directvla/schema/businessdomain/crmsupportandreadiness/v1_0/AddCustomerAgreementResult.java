
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerAgreementResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerAgreementResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAgreementID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerAgreementResult", propOrder = {
    "customerAgreementID"
})
public class AddCustomerAgreementResult {

    @XmlElement(name = "CustomerAgreementID")
    protected int customerAgreementID;

    /**
     * Gets the value of the customerAgreementID property.
     * 
     */
    public int getCustomerAgreementID() {
        return customerAgreementID;
    }

    /**
     * Sets the value of the customerAgreementID property.
     * 
     */
    public void setCustomerAgreementID(int value) {
        this.customerAgreementID = value;
    }

}
