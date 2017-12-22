
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromCustomerKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToCustomerKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AddCustomerRelation", propOrder = {
    "fromCustomerKey",
    "toCustomerKey",
    "relationType",
    "reason"
})
public class AddCustomerRelation {

    @XmlElement(name = "FromCustomerKey")
    protected int fromCustomerKey;
    @XmlElement(name = "ToCustomerKey")
    protected int toCustomerKey;
    @XmlElement(name = "RelationType", required = true)
    protected String relationType;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the fromCustomerKey property.
     * 
     */
    public int getFromCustomerKey() {
        return fromCustomerKey;
    }

    /**
     * Sets the value of the fromCustomerKey property.
     * 
     */
    public void setFromCustomerKey(int value) {
        this.fromCustomerKey = value;
    }

    /**
     * Gets the value of the toCustomerKey property.
     * 
     */
    public int getToCustomerKey() {
        return toCustomerKey;
    }

    /**
     * Sets the value of the toCustomerKey property.
     * 
     */
    public void setToCustomerKey(int value) {
        this.toCustomerKey = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
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
