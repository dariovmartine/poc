
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intermediary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Intermediary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="CommisionType" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "commisionType",
    "isActive"
})
public class Intermediary
    extends PartyRole
{

    @XmlElement(name = "CommisionType")
    protected Category commisionType;
    @XmlElement(name = "IsActive", defaultValue = "false")
    protected Boolean isActive;

    /**
     * Gets the value of the commisionType property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCommisionType() {
        return commisionType;
    }

    /**
     * Sets the value of the commisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCommisionType(Category value) {
        this.commisionType = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

}
