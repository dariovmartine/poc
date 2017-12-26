
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconnectCustomerProducts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconnectCustomerProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BasicProductCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectCustomerProducts", propOrder = {
    "customerKey",
    "currentStatusID",
    "reason",
    "productCode",
    "basicProductCode",
    "resourceSerialNumber"
})
public class ReconnectCustomerProducts {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "CurrentStatusID")
    protected int currentStatusID;
    @XmlElement(name = "Reason")
    protected int reason;
    @XmlElement(name = "ProductCode")
    protected Integer productCode;
    @XmlElement(name = "BasicProductCode")
    protected Integer basicProductCode;
    @XmlElement(name = "ResourceSerialNumber")
    protected String resourceSerialNumber;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the currentStatusID property.
     * 
     */
    public int getCurrentStatusID() {
        return currentStatusID;
    }

    /**
     * Sets the value of the currentStatusID property.
     * 
     */
    public void setCurrentStatusID(int value) {
        this.currentStatusID = value;
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

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductCode(Integer value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the basicProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBasicProductCode() {
        return basicProductCode;
    }

    /**
     * Sets the value of the basicProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBasicProductCode(Integer value) {
        this.basicProductCode = value;
    }

    /**
     * Gets the value of the resourceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceSerialNumber() {
        return resourceSerialNumber;
    }

    /**
     * Sets the value of the resourceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceSerialNumber(String value) {
        this.resourceSerialNumber = value;
    }

}
