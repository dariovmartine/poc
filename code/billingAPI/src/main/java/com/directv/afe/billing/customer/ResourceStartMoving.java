
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResourceStartMoving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceStartMoving">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonIdDisconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentStatusIdDisconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdReconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CurrentStatusIdReconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StockhandlerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkOrderReasonId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceStartMoving", propOrder = {
    "customerKey",
    "reasonIdDisconnect",
    "currentStatusIdDisconnect",
    "reasonIdReconnect",
    "reconnectDate",
    "currentStatusIdReconnect",
    "serviceTypeId",
    "stockhandlerId",
    "serviceProviderId",
    "addressId",
    "workOrderDescription",
    "serviceId",
    "workOrderReasonId"
})
public class ResourceStartMoving {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "ReasonIdDisconnect")
    protected int reasonIdDisconnect;
    @XmlElement(name = "CurrentStatusIdDisconnect")
    protected int currentStatusIdDisconnect;
    @XmlElement(name = "ReasonIdReconnect")
    protected int reasonIdReconnect;
    @XmlElement(name = "ReconnectDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reconnectDate;
    @XmlElement(name = "CurrentStatusIdReconnect")
    protected int currentStatusIdReconnect;
    @XmlElement(name = "ServiceTypeId", required = true)
    protected String serviceTypeId;
    @XmlElement(name = "StockhandlerId")
    protected int stockhandlerId;
    @XmlElement(name = "ServiceProviderId")
    protected int serviceProviderId;
    @XmlElement(name = "AddressId")
    protected int addressId;
    @XmlElement(name = "WorkOrderDescription", required = true)
    protected String workOrderDescription;
    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "WorkOrderReasonId")
    protected int workOrderReasonId;

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
     * Gets the value of the reasonIdDisconnect property.
     * 
     */
    public int getReasonIdDisconnect() {
        return reasonIdDisconnect;
    }

    /**
     * Sets the value of the reasonIdDisconnect property.
     * 
     */
    public void setReasonIdDisconnect(int value) {
        this.reasonIdDisconnect = value;
    }

    /**
     * Gets the value of the currentStatusIdDisconnect property.
     * 
     */
    public int getCurrentStatusIdDisconnect() {
        return currentStatusIdDisconnect;
    }

    /**
     * Sets the value of the currentStatusIdDisconnect property.
     * 
     */
    public void setCurrentStatusIdDisconnect(int value) {
        this.currentStatusIdDisconnect = value;
    }

    /**
     * Gets the value of the reasonIdReconnect property.
     * 
     */
    public int getReasonIdReconnect() {
        return reasonIdReconnect;
    }

    /**
     * Sets the value of the reasonIdReconnect property.
     * 
     */
    public void setReasonIdReconnect(int value) {
        this.reasonIdReconnect = value;
    }

    /**
     * Gets the value of the reconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReconnectDate() {
        return reconnectDate;
    }

    /**
     * Sets the value of the reconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReconnectDate(XMLGregorianCalendar value) {
        this.reconnectDate = value;
    }

    /**
     * Gets the value of the currentStatusIdReconnect property.
     * 
     */
    public int getCurrentStatusIdReconnect() {
        return currentStatusIdReconnect;
    }

    /**
     * Sets the value of the currentStatusIdReconnect property.
     * 
     */
    public void setCurrentStatusIdReconnect(int value) {
        this.currentStatusIdReconnect = value;
    }

    /**
     * Gets the value of the serviceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the value of the serviceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeId(String value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the value of the stockhandlerId property.
     * 
     */
    public int getStockhandlerId() {
        return stockhandlerId;
    }

    /**
     * Sets the value of the stockhandlerId property.
     * 
     */
    public void setStockhandlerId(int value) {
        this.stockhandlerId = value;
    }

    /**
     * Gets the value of the serviceProviderId property.
     * 
     */
    public int getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * Sets the value of the serviceProviderId property.
     * 
     */
    public void setServiceProviderId(int value) {
        this.serviceProviderId = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     */
    public void setAddressId(int value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the workOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderDescription() {
        return workOrderDescription;
    }

    /**
     * Sets the value of the workOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderDescription(String value) {
        this.workOrderDescription = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the workOrderReasonId property.
     * 
     */
    public int getWorkOrderReasonId() {
        return workOrderReasonId;
    }

    /**
     * Sets the value of the workOrderReasonId property.
     * 
     */
    public void setWorkOrderReasonId(int value) {
        this.workOrderReasonId = value;
    }

}
