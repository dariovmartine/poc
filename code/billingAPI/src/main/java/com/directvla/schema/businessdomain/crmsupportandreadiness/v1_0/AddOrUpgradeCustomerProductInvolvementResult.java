
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpgradeCustomerProductInvolvementResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpgradeCustomerProductInvolvementResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerAccountProductInvolvementKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpgradeCustomerProductInvolvementResult", propOrder = {
    "customerAccountProductInvolvementKey"
})
public class AddOrUpgradeCustomerProductInvolvementResult {

    protected String customerAccountProductInvolvementKey;

    /**
     * Gets the value of the customerAccountProductInvolvementKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountProductInvolvementKey() {
        return customerAccountProductInvolvementKey;
    }

    /**
     * Sets the value of the customerAccountProductInvolvementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountProductInvolvementKey(String value) {
        this.customerAccountProductInvolvementKey = value;
    }

}
