
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerRelationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerRelationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelationKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerRelationResult", propOrder = {
    "customerRelationKey"
})
public class AddCustomerRelationResult {

    @XmlElement(name = "CustomerRelationKey")
    protected int customerRelationKey;

    /**
     * Gets the value of the customerRelationKey property.
     * 
     */
    public int getCustomerRelationKey() {
        return customerRelationKey;
    }

    /**
     * Sets the value of the customerRelationKey property.
     * 
     */
    public void setCustomerRelationKey(int value) {
        this.customerRelationKey = value;
    }

}
