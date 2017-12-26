
package com.directv.afe.billing.invoice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="type" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="CustomerExemptedFromTaxesVia" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerAccountTaxExemptionCollection" minOccurs="0"/>
 *         &lt;element name="CustomerAccountChargeSumBalanceCollection" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerAccountChargeSumBalanceCollection" minOccurs="0"/>
 *         &lt;element name="BillSpecifiedBy" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerBillingCycleSpecificationCollection" minOccurs="0"/>
 *         &lt;element name="MethodOfPayment" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="InvoiceDeliveryMethod" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="DunningLevel" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="InvoicingProfile" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="DueIn" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="CreditCardCollection" type="{http://directvla.com/schema/businessdomain/common/v1-0}CreditCardCollection" minOccurs="0"/>
 *         &lt;element name="FirstNextBillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBranch" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="ProxyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisconnectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DaysToDisconnectionDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentCustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasBeenApplied" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="CalculatedBillingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccount", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "id",
    "customerKey",
    "name",
    "status",
    "type",
    "customerExemptedFromTaxesVia",
    "customerAccountChargeSumBalanceCollection",
    "billSpecifiedBy",
    "methodOfPayment",
    "invoiceDeliveryMethod",
    "dunningLevel",
    "invoicingProfile",
    "dueIn",
    "creditCardCollection",
    "firstNextBillDate",
    "bankCode",
    "bankAccountNumber",
    "bankBranch",
    "proxyCode",
    "referenceNumber",
    "lastPaymentDate",
    "totalDue",
    "disconnectionDate",
    "daysToDisconnectionDate",
    "parentCustomerAccountId",
    "hasBeenApplied",
    "validFor",
    "calculatedBillingDate"
})
public class CustomerAccount {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "CustomerKey")
    protected String customerKey;
    protected String name;
    protected Category status;
    protected Category type;
    @XmlElement(name = "CustomerExemptedFromTaxesVia")
    protected CustomerAccountTaxExemptionCollection customerExemptedFromTaxesVia;
    @XmlElement(name = "CustomerAccountChargeSumBalanceCollection")
    protected CustomerAccountChargeSumBalanceCollection customerAccountChargeSumBalanceCollection;
    @XmlElement(name = "BillSpecifiedBy")
    protected CustomerBillingCycleSpecificationCollection billSpecifiedBy;
    @XmlElement(name = "MethodOfPayment")
    protected Category methodOfPayment;
    @XmlElement(name = "InvoiceDeliveryMethod")
    protected Category invoiceDeliveryMethod;
    @XmlElement(name = "DunningLevel")
    protected Category dunningLevel;
    @XmlElement(name = "InvoicingProfile")
    protected Category invoicingProfile;
    @XmlElement(name = "DueIn")
    protected Category dueIn;
    @XmlElement(name = "CreditCardCollection")
    protected CreditCardCollection creditCardCollection;
    @XmlElement(name = "FirstNextBillDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstNextBillDate;
    @XmlElement(name = "BankCode")
    protected Category bankCode;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankBranch")
    protected Category bankBranch;
    @XmlElement(name = "ProxyCode")
    protected String proxyCode;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "LastPaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    @XmlElement(name = "TotalDue")
    protected BigDecimal totalDue;
    @XmlElement(name = "DisconnectionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectionDate;
    @XmlElement(name = "DaysToDisconnectionDate")
    protected Integer daysToDisconnectionDate;
    @XmlElement(name = "ParentCustomerAccountId")
    protected Integer parentCustomerAccountId;
    @XmlElement(name = "HasBeenApplied")
    protected BigDecimal hasBeenApplied;
    protected TimePeriod validFor;
    @XmlElement(name = "CalculatedBillingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedBillingDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setType(Category value) {
        this.type = value;
    }

    /**
     * Gets the value of the customerExemptedFromTaxesVia property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountTaxExemptionCollection }
     *     
     */
    public CustomerAccountTaxExemptionCollection getCustomerExemptedFromTaxesVia() {
        return customerExemptedFromTaxesVia;
    }

    /**
     * Sets the value of the customerExemptedFromTaxesVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountTaxExemptionCollection }
     *     
     */
    public void setCustomerExemptedFromTaxesVia(CustomerAccountTaxExemptionCollection value) {
        this.customerExemptedFromTaxesVia = value;
    }

    /**
     * Gets the value of the customerAccountChargeSumBalanceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountChargeSumBalanceCollection }
     *     
     */
    public CustomerAccountChargeSumBalanceCollection getCustomerAccountChargeSumBalanceCollection() {
        return customerAccountChargeSumBalanceCollection;
    }

    /**
     * Sets the value of the customerAccountChargeSumBalanceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountChargeSumBalanceCollection }
     *     
     */
    public void setCustomerAccountChargeSumBalanceCollection(CustomerAccountChargeSumBalanceCollection value) {
        this.customerAccountChargeSumBalanceCollection = value;
    }

    /**
     * Gets the value of the billSpecifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleSpecificationCollection }
     *     
     */
    public CustomerBillingCycleSpecificationCollection getBillSpecifiedBy() {
        return billSpecifiedBy;
    }

    /**
     * Sets the value of the billSpecifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleSpecificationCollection }
     *     
     */
    public void setBillSpecifiedBy(CustomerBillingCycleSpecificationCollection value) {
        this.billSpecifiedBy = value;
    }

    /**
     * Gets the value of the methodOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getMethodOfPayment() {
        return methodOfPayment;
    }

    /**
     * Sets the value of the methodOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setMethodOfPayment(Category value) {
        this.methodOfPayment = value;
    }

    /**
     * Gets the value of the invoiceDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getInvoiceDeliveryMethod() {
        return invoiceDeliveryMethod;
    }

    /**
     * Sets the value of the invoiceDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setInvoiceDeliveryMethod(Category value) {
        this.invoiceDeliveryMethod = value;
    }

    /**
     * Gets the value of the dunningLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getDunningLevel() {
        return dunningLevel;
    }

    /**
     * Sets the value of the dunningLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setDunningLevel(Category value) {
        this.dunningLevel = value;
    }

    /**
     * Gets the value of the invoicingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getInvoicingProfile() {
        return invoicingProfile;
    }

    /**
     * Sets the value of the invoicingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setInvoicingProfile(Category value) {
        this.invoicingProfile = value;
    }

    /**
     * Gets the value of the dueIn property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getDueIn() {
        return dueIn;
    }

    /**
     * Sets the value of the dueIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setDueIn(Category value) {
        this.dueIn = value;
    }

    /**
     * Gets the value of the creditCardCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardCollection }
     *     
     */
    public CreditCardCollection getCreditCardCollection() {
        return creditCardCollection;
    }

    /**
     * Sets the value of the creditCardCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardCollection }
     *     
     */
    public void setCreditCardCollection(CreditCardCollection value) {
        this.creditCardCollection = value;
    }

    /**
     * Gets the value of the firstNextBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstNextBillDate() {
        return firstNextBillDate;
    }

    /**
     * Sets the value of the firstNextBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstNextBillDate(XMLGregorianCalendar value) {
        this.firstNextBillDate = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setBankCode(Category value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setBankBranch(Category value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the proxyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyCode() {
        return proxyCode;
    }

    /**
     * Sets the value of the proxyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyCode(String value) {
        this.proxyCode = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the totalDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDue() {
        return totalDue;
    }

    /**
     * Sets the value of the totalDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDue(BigDecimal value) {
        this.totalDue = value;
    }

    /**
     * Gets the value of the disconnectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectionDate() {
        return disconnectionDate;
    }

    /**
     * Sets the value of the disconnectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectionDate(XMLGregorianCalendar value) {
        this.disconnectionDate = value;
    }

    /**
     * Gets the value of the daysToDisconnectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToDisconnectionDate() {
        return daysToDisconnectionDate;
    }

    /**
     * Sets the value of the daysToDisconnectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToDisconnectionDate(Integer value) {
        this.daysToDisconnectionDate = value;
    }

    /**
     * Gets the value of the parentCustomerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentCustomerAccountId() {
        return parentCustomerAccountId;
    }

    /**
     * Sets the value of the parentCustomerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentCustomerAccountId(Integer value) {
        this.parentCustomerAccountId = value;
    }

    /**
     * Gets the value of the hasBeenApplied property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHasBeenApplied() {
        return hasBeenApplied;
    }

    /**
     * Sets the value of the hasBeenApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHasBeenApplied(BigDecimal value) {
        this.hasBeenApplied = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the calculatedBillingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedBillingDate() {
        return calculatedBillingDate;
    }

    /**
     * Sets the value of the calculatedBillingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedBillingDate(XMLGregorianCalendar value) {
        this.calculatedBillingDate = value;
    }

}
