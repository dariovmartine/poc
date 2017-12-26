
package com.directv.afe.billing.invoice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetCustomerFinancialTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerFinancialTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LedgerAccountCollection" type="{http://directvla.com/schema/businessdomain/customer/v1-0}LedgerAccountCollection" minOccurs="0"/>
 *         &lt;element name="ReversedTransactionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerFinancialTransactions", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "customerKey",
    "customerAccountID",
    "bankDate",
    "baseAmount",
    "ledgerAccountCollection",
    "reversedTransactionId"
})
public class GetCustomerFinancialTransactions {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "CustomerAccountID")
    protected Integer customerAccountID;
    @XmlElement(name = "BankDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankDate;
    @XmlElement(name = "BaseAmount")
    protected BigDecimal baseAmount;
    @XmlElement(name = "LedgerAccountCollection")
    protected LedgerAccountCollection ledgerAccountCollection;
    @XmlElement(name = "ReversedTransactionId")
    protected Integer reversedTransactionId;

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
     * Gets the value of the customerAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerAccountID() {
        return customerAccountID;
    }

    /**
     * Sets the value of the customerAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerAccountID(Integer value) {
        this.customerAccountID = value;
    }

    /**
     * Gets the value of the bankDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBankDate() {
        return bankDate;
    }

    /**
     * Sets the value of the bankDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBankDate(XMLGregorianCalendar value) {
        this.bankDate = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the ledgerAccountCollection property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerAccountCollection }
     *     
     */
    public LedgerAccountCollection getLedgerAccountCollection() {
        return ledgerAccountCollection;
    }

    /**
     * Sets the value of the ledgerAccountCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerAccountCollection }
     *     
     */
    public void setLedgerAccountCollection(LedgerAccountCollection value) {
        this.ledgerAccountCollection = value;
    }

    /**
     * Gets the value of the reversedTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReversedTransactionId() {
        return reversedTransactionId;
    }

    /**
     * Sets the value of the reversedTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReversedTransactionId(Integer value) {
        this.reversedTransactionId = value;
    }

}
