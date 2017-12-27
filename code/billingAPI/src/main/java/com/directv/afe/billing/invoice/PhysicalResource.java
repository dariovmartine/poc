
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="deviceModel" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="TechnicalProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockHandler" type="{http://directvla.com/schema/businessdomain/common/v1-0}FunctionOrProcessProvider" minOccurs="0"/>
 *         &lt;element name="CallBackMethod" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResource", propOrder = {
    "commonName",
    "description",
    "objectID",
    "otherIdentifier",
    "serialNumber",
    "status",
    "deviceModel",
    "technicalProductID",
    "productID",
    "stockHandler",
    "callBackMethod"
})
public class PhysicalResource {

    protected String commonName;
    protected String description;
    protected String objectID;
    protected String otherIdentifier;
    protected String serialNumber;
    protected Category status;
    protected Category deviceModel;
    @XmlElement(name = "TechnicalProductID")
    protected Integer technicalProductID;
    protected String productID;
    protected FunctionOrProcessProvider stockHandler;
    @XmlElement(name = "CallBackMethod")
    protected Category callBackMethod;

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
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
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the otherIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIdentifier() {
        return otherIdentifier;
    }

    /**
     * Sets the value of the otherIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIdentifier(String value) {
        this.otherIdentifier = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setStatus(Category value) {
        this.status = value;
    }

    /**
     * Gets the value of the deviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setDeviceModel(Category value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the technicalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTechnicalProductID() {
        return technicalProductID;
    }

    /**
     * Sets the value of the technicalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTechnicalProductID(Integer value) {
        this.technicalProductID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the stockHandler property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionOrProcessProvider }
     *     
     */
    public FunctionOrProcessProvider getStockHandler() {
        return stockHandler;
    }

    /**
     * Sets the value of the stockHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionOrProcessProvider }
     *     
     */
    public void setStockHandler(FunctionOrProcessProvider value) {
        this.stockHandler = value;
    }

    /**
     * Gets the value of the callBackMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCallBackMethod() {
        return callBackMethod;
    }

    /**
     * Sets the value of the callBackMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCallBackMethod(Category value) {
        this.callBackMethod = value;
    }

}