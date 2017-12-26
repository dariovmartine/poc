
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerDepotCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerCode", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "dealerKey",
    "dealerCode",
    "dealerDepotCode",
    "dealerName",
    "status"
})
public class DealerCode {

    @XmlElement(required = true)
    protected String dealerKey;
    @XmlElement(required = true)
    protected String dealerCode;
    @XmlElement(required = true)
    protected String dealerDepotCode;
    @XmlElement(required = true)
    protected String dealerName;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the dealerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerKey() {
        return dealerKey;
    }

    /**
     * Sets the value of the dealerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerKey(String value) {
        this.dealerKey = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the dealerDepotCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerDepotCode() {
        return dealerDepotCode;
    }

    /**
     * Sets the value of the dealerDepotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerDepotCode(String value) {
        this.dealerDepotCode = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
