
package com.directvla.schema.businessdomain.customer.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.Category;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AmountApplied" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountPaidFromOtherInvoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceBroughtForward" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FinancialTransactionsCollection" type="{http://directvla.com/schema/businessdomain/customer/v1-0}FinancialTransactionCollection" minOccurs="0"/>
 *         &lt;element name="MethodOfPayment" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="DunningLevel" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="InvoiceDeliveryMethod" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="InvoicingProfile" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="DueIn" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="ExternalInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialStatus" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="Pending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "id",
    "amountApplied",
    "amountPaid",
    "amountPaidFromOtherInvoice",
    "balance",
    "balanceBroughtForward",
    "createDate",
    "dueDate",
    "invoiceDate",
    "totalAmount",
    "invoiceNumber",
    "invoiceText",
    "newCharges",
    "status",
    "financialAccountID",
    "financialTransactionsCollection",
    "methodOfPayment",
    "dunningLevel",
    "invoiceDeliveryMethod",
    "invoicingProfile",
    "dueIn",
    "externalInvoiceNumber",
    "externalReferenceNumber",
    "financialStatus",
    "pending"
})
public class Invoice {

    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "AmountApplied")
    protected BigDecimal amountApplied;
    @XmlElement(name = "AmountPaid")
    protected BigDecimal amountPaid;
    @XmlElement(name = "AmountPaidFromOtherInvoice")
    protected BigDecimal amountPaidFromOtherInvoice;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "BalanceBroughtForward")
    protected BigDecimal balanceBroughtForward;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "InvoiceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "TotalAmount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "InvoiceNumber")
    protected Integer invoiceNumber;
    @XmlElement(name = "InvoiceText")
    protected String invoiceText;
    @XmlElement(name = "NewCharges")
    protected BigDecimal newCharges;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "FinancialAccountID")
    protected Integer financialAccountID;
    @XmlElement(name = "FinancialTransactionsCollection")
    protected FinancialTransactionCollection financialTransactionsCollection;
    @XmlElement(name = "MethodOfPayment")
    protected Category methodOfPayment;
    @XmlElement(name = "DunningLevel")
    protected Category dunningLevel;
    @XmlElement(name = "InvoiceDeliveryMethod")
    protected Category invoiceDeliveryMethod;
    @XmlElement(name = "InvoicingProfile")
    protected Category invoicingProfile;
    @XmlElement(name = "DueIn")
    protected Category dueIn;
    @XmlElement(name = "ExternalInvoiceNumber")
    protected String externalInvoiceNumber;
    @XmlElement(name = "ExternalReferenceNumber")
    protected String externalReferenceNumber;
    @XmlElement(name = "FinancialStatus")
    protected Category financialStatus;
    @XmlElement(name = "Pending")
    protected Boolean pending;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the amountApplied property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountApplied() {
        return amountApplied;
    }

    /**
     * Sets the value of the amountApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountApplied(BigDecimal value) {
        this.amountApplied = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountPaid(BigDecimal value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountPaidFromOtherInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountPaidFromOtherInvoice() {
        return amountPaidFromOtherInvoice;
    }

    /**
     * Sets the value of the amountPaidFromOtherInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountPaidFromOtherInvoice(BigDecimal value) {
        this.amountPaidFromOtherInvoice = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the balanceBroughtForward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceBroughtForward() {
        return balanceBroughtForward;
    }

    /**
     * Sets the value of the balanceBroughtForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceBroughtForward(BigDecimal value) {
        this.balanceBroughtForward = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceNumber(Integer value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceText() {
        return invoiceText;
    }

    /**
     * Sets the value of the invoiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceText(String value) {
        this.invoiceText = value;
    }

    /**
     * Gets the value of the newCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCharges() {
        return newCharges;
    }

    /**
     * Sets the value of the newCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCharges(BigDecimal value) {
        this.newCharges = value;
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

    /**
     * Gets the value of the financialAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialAccountID() {
        return financialAccountID;
    }

    /**
     * Sets the value of the financialAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialAccountID(Integer value) {
        this.financialAccountID = value;
    }

    /**
     * Gets the value of the financialTransactionsCollection property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionCollection }
     *     
     */
    public FinancialTransactionCollection getFinancialTransactionsCollection() {
        return financialTransactionsCollection;
    }

    /**
     * Sets the value of the financialTransactionsCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionCollection }
     *     
     */
    public void setFinancialTransactionsCollection(FinancialTransactionCollection value) {
        this.financialTransactionsCollection = value;
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
     * Gets the value of the externalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalInvoiceNumber() {
        return externalInvoiceNumber;
    }

    /**
     * Sets the value of the externalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalInvoiceNumber(String value) {
        this.externalInvoiceNumber = value;
    }

    /**
     * Gets the value of the externalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    /**
     * Sets the value of the externalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceNumber(String value) {
        this.externalReferenceNumber = value;
    }

    /**
     * Gets the value of the financialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getFinancialStatus() {
        return financialStatus;
    }

    /**
     * Sets the value of the financialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setFinancialStatus(Category value) {
        this.financialStatus = value;
    }

    /**
     * Gets the value of the pending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPending(Boolean value) {
        this.pending = value;
    }

}
