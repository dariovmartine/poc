
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cust" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Customer"/>
 *         &lt;element name="CustAccount" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerAccount"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditCustomer", propOrder = {
    "cust",
    "custAccount",
    "reason",
    "reasonStatus",
    "reasonType",
    "reasonAddress"
})
public class EditCustomer {

    @XmlElement(name = "Cust", required = true)
    protected Customer cust;
    @XmlElement(name = "CustAccount", required = true)
    protected CustomerAccount custAccount;
    @XmlElement(name = "Reason")
    protected int reason;
    @XmlElement(name = "ReasonStatus")
    protected int reasonStatus;
    @XmlElement(name = "ReasonType")
    protected int reasonType;
    @XmlElement(name = "ReasonAddress")
    protected int reasonAddress;

    /**
     * Gets the value of the cust property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCust() {
        return cust;
    }

    /**
     * Sets the value of the cust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCust(Customer value) {
        this.cust = value;
    }

    /**
     * Gets the value of the custAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustAccount() {
        return custAccount;
    }

    /**
     * Sets the value of the custAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustAccount(CustomerAccount value) {
        this.custAccount = value;
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
     * Gets the value of the reasonStatus property.
     * 
     */
    public int getReasonStatus() {
        return reasonStatus;
    }

    /**
     * Sets the value of the reasonStatus property.
     * 
     */
    public void setReasonStatus(int value) {
        this.reasonStatus = value;
    }

    /**
     * Gets the value of the reasonType property.
     * 
     */
    public int getReasonType() {
        return reasonType;
    }

    /**
     * Sets the value of the reasonType property.
     * 
     */
    public void setReasonType(int value) {
        this.reasonType = value;
    }

    /**
     * Gets the value of the reasonAddress property.
     * 
     */
    public int getReasonAddress() {
        return reasonAddress;
    }

    /**
     * Sets the value of the reasonAddress property.
     * 
     */
    public void setReasonAddress(int value) {
        this.reasonAddress = value;
    }

}
