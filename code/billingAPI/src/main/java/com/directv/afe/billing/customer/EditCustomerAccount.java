
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditCustomerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditCustomerAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccount" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerAccount"/>
 *         &lt;element name="ReasonId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdDunningChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdStatusChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdCreditCardChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditCustomerAccount", propOrder = {
    "customerAccount",
    "reasonId",
    "reasonIdDunningChange",
    "reasonIdStatusChange",
    "reasonIdCreditCardChange"
})
public class EditCustomerAccount {

    @XmlElement(name = "CustomerAccount", required = true)
    protected CustomerAccount customerAccount;
    @XmlElement(name = "ReasonId")
    protected int reasonId;
    @XmlElement(name = "ReasonIdDunningChange")
    protected int reasonIdDunningChange;
    @XmlElement(name = "ReasonIdStatusChange")
    protected int reasonIdStatusChange;
    @XmlElement(name = "ReasonIdCreditCardChange")
    protected int reasonIdCreditCardChange;

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomerAccount(CustomerAccount value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     */
    public int getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     */
    public void setReasonId(int value) {
        this.reasonId = value;
    }

    /**
     * Gets the value of the reasonIdDunningChange property.
     * 
     */
    public int getReasonIdDunningChange() {
        return reasonIdDunningChange;
    }

    /**
     * Sets the value of the reasonIdDunningChange property.
     * 
     */
    public void setReasonIdDunningChange(int value) {
        this.reasonIdDunningChange = value;
    }

    /**
     * Gets the value of the reasonIdStatusChange property.
     * 
     */
    public int getReasonIdStatusChange() {
        return reasonIdStatusChange;
    }

    /**
     * Sets the value of the reasonIdStatusChange property.
     * 
     */
    public void setReasonIdStatusChange(int value) {
        this.reasonIdStatusChange = value;
    }

    /**
     * Gets the value of the reasonIdCreditCardChange property.
     * 
     */
    public int getReasonIdCreditCardChange() {
        return reasonIdCreditCardChange;
    }

    /**
     * Sets the value of the reasonIdCreditCardChange property.
     * 
     */
    public void setReasonIdCreditCardChange(int value) {
        this.reasonIdCreditCardChange = value;
    }

}
