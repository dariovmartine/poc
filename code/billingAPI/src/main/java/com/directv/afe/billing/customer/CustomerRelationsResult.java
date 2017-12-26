
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRelationsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelationsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerFrom" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Customer"/>
 *         &lt;element name="CustomerTo" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Customer"/>
 *         &lt;element name="RelationType" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelationsResult", propOrder = {
    "customerFrom",
    "customerTo",
    "relationType"
})
public class CustomerRelationsResult {

    @XmlElement(name = "CustomerFrom", required = true)
    protected Customer customerFrom;
    @XmlElement(name = "CustomerTo", required = true)
    protected Customer customerTo;
    @XmlElement(name = "RelationType", required = true)
    protected Category relationType;

    /**
     * Gets the value of the customerFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomerFrom() {
        return customerFrom;
    }

    /**
     * Sets the value of the customerFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomerFrom(Customer value) {
        this.customerFrom = value;
    }

    /**
     * Gets the value of the customerTo property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomerTo() {
        return customerTo;
    }

    /**
     * Sets the value of the customerTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomerTo(Customer value) {
        this.customerTo = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setRelationType(Category value) {
        this.relationType = value;
    }

}
