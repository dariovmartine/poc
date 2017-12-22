
package com.directvla.schema.businessdomain.customer.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerBillingCycleSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDateShift" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chargeDateOffSet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditDateOffSet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailingDateOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentDueDateOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleSpecification", propOrder = {
    "billingDateShift",
    "chargeDateOffSet",
    "creditDateOffSet",
    "description",
    "mailingDateOffset",
    "name",
    "paymentDueDateOffset"
})
public class CustomerBillingCycleSpecification {

    protected int billingDateShift;
    protected int chargeDateOffSet;
    protected int creditDateOffSet;
    @XmlElement(required = true)
    protected String description;
    protected int mailingDateOffset;
    @XmlElement(required = true)
    protected String name;
    protected int paymentDueDateOffset;

    /**
     * Gets the value of the billingDateShift property.
     * 
     */
    public int getBillingDateShift() {
        return billingDateShift;
    }

    /**
     * Sets the value of the billingDateShift property.
     * 
     */
    public void setBillingDateShift(int value) {
        this.billingDateShift = value;
    }

    /**
     * Gets the value of the chargeDateOffSet property.
     * 
     */
    public int getChargeDateOffSet() {
        return chargeDateOffSet;
    }

    /**
     * Sets the value of the chargeDateOffSet property.
     * 
     */
    public void setChargeDateOffSet(int value) {
        this.chargeDateOffSet = value;
    }

    /**
     * Gets the value of the creditDateOffSet property.
     * 
     */
    public int getCreditDateOffSet() {
        return creditDateOffSet;
    }

    /**
     * Sets the value of the creditDateOffSet property.
     * 
     */
    public void setCreditDateOffSet(int value) {
        this.creditDateOffSet = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mailingDateOffset property.
     * 
     */
    public int getMailingDateOffset() {
        return mailingDateOffset;
    }

    /**
     * Sets the value of the mailingDateOffset property.
     * 
     */
    public void setMailingDateOffset(int value) {
        this.mailingDateOffset = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the paymentDueDateOffset property.
     * 
     */
    public int getPaymentDueDateOffset() {
        return paymentDueDateOffset;
    }

    /**
     * Sets the value of the paymentDueDateOffset property.
     * 
     */
    public void setPaymentDueDateOffset(int value) {
        this.paymentDueDateOffset = value;
    }

}