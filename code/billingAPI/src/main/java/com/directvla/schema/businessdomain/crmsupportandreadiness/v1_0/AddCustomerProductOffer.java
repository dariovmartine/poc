
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.product.v1_0.CustomerProductOffer;


/**
 * <p>Java class for AddCustomerProductOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerProductOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProductOffer" type="{http://directvla.com/schema/businessdomain/product/v1-0}CustomerProductOffer"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerProductOffer", propOrder = {
    "customerProductOffer",
    "reason"
})
public class AddCustomerProductOffer {

    @XmlElement(name = "CustomerProductOffer", required = true)
    protected CustomerProductOffer customerProductOffer;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the customerProductOffer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProductOffer }
     *     
     */
    public CustomerProductOffer getCustomerProductOffer() {
        return customerProductOffer;
    }

    /**
     * Sets the value of the customerProductOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProductOffer }
     *     
     */
    public void setCustomerProductOffer(CustomerProductOffer value) {
        this.customerProductOffer = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     */
    public int getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     */
    public void setReason(int value) {
        this.reason = value;
    }

}
