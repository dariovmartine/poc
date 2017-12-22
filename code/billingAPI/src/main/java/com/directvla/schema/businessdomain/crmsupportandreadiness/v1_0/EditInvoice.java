
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.Invoice;


/**
 * <p>Java class for EditInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Invoice" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Invoice"/>
 *         &lt;element name="ReasonIdEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdDueDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdDunningLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdFinancialStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditInvoice", propOrder = {
    "invoice",
    "reasonIdEdit",
    "reasonIdDueDate",
    "reasonIdDunningLevel",
    "reasonIdFinancialStatus"
})
public class EditInvoice {

    @XmlElement(name = "Invoice", required = true)
    protected Invoice invoice;
    @XmlElement(name = "ReasonIdEdit")
    protected int reasonIdEdit;
    @XmlElement(name = "ReasonIdDueDate")
    protected int reasonIdDueDate;
    @XmlElement(name = "ReasonIdDunningLevel")
    protected int reasonIdDunningLevel;
    @XmlElement(name = "ReasonIdFinancialStatus")
    protected int reasonIdFinancialStatus;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the reasonIdEdit property.
     * 
     */
    public int getReasonIdEdit() {
        return reasonIdEdit;
    }

    /**
     * Sets the value of the reasonIdEdit property.
     * 
     */
    public void setReasonIdEdit(int value) {
        this.reasonIdEdit = value;
    }

    /**
     * Gets the value of the reasonIdDueDate property.
     * 
     */
    public int getReasonIdDueDate() {
        return reasonIdDueDate;
    }

    /**
     * Sets the value of the reasonIdDueDate property.
     * 
     */
    public void setReasonIdDueDate(int value) {
        this.reasonIdDueDate = value;
    }

    /**
     * Gets the value of the reasonIdDunningLevel property.
     * 
     */
    public int getReasonIdDunningLevel() {
        return reasonIdDunningLevel;
    }

    /**
     * Sets the value of the reasonIdDunningLevel property.
     * 
     */
    public void setReasonIdDunningLevel(int value) {
        this.reasonIdDunningLevel = value;
    }

    /**
     * Gets the value of the reasonIdFinancialStatus property.
     * 
     */
    public int getReasonIdFinancialStatus() {
        return reasonIdFinancialStatus;
    }

    /**
     * Sets the value of the reasonIdFinancialStatus property.
     * 
     */
    public void setReasonIdFinancialStatus(int value) {
        this.reasonIdFinancialStatus = value;
    }

}
