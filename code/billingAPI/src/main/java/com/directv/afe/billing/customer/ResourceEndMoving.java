
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceEndMoving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceEndMoving">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonIdReconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentStatusIdReconnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkorderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActionTaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonIdComplete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceEndMoving", propOrder = {
    "customerKey",
    "reasonIdReconnect",
    "currentStatusIdReconnect",
    "workorderId",
    "actionTaken",
    "reasonIdComplete"
})
public class ResourceEndMoving {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "ReasonIdReconnect")
    protected int reasonIdReconnect;
    @XmlElement(name = "CurrentStatusIdReconnect")
    protected int currentStatusIdReconnect;
    @XmlElement(name = "WorkorderId")
    protected int workorderId;
    @XmlElement(name = "ActionTaken", required = true)
    protected String actionTaken;
    @XmlElement(name = "ReasonIdComplete")
    protected int reasonIdComplete;

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
     * Gets the value of the workorderId property.
     * 
     */
    public int getWorkorderId() {
        return workorderId;
    }

    /**
     * Sets the value of the workorderId property.
     * 
     */
    public void setWorkorderId(int value) {
        this.workorderId = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTaken(String value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the reasonIdComplete property.
     * 
     */
    public int getReasonIdComplete() {
        return reasonIdComplete;
    }

    /**
     * Sets the value of the reasonIdComplete property.
     * 
     */
    public void setReasonIdComplete(int value) {
        this.reasonIdComplete = value;
    }

}
