
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerProductOfferResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerProductOfferResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProductOfferID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerProductOfferResult", propOrder = {
    "customerProductOfferID"
})
public class AddCustomerProductOfferResult {

    @XmlElement(name = "CustomerProductOfferID")
    protected int customerProductOfferID;

    /**
     * Gets the value of the customerProductOfferID property.
     * 
     */
    public int getCustomerProductOfferID() {
        return customerProductOfferID;
    }

    /**
     * Sets the value of the customerProductOfferID property.
     * 
     */
    public void setCustomerProductOfferID(int value) {
        this.customerProductOfferID = value;
    }

}
