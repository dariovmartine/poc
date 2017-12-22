
package com.directvla.schema.businessdomain.customer.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.Category;
import com.directvla.schema.businessdomain.common.v1_0.Money;
import com.directvla.schema.businessdomain.common.v1_0.TimePeriod;
import com.directvla.schema.businessdomain.product.v1_0.Product;


/**
 * <p>Java class for FinancialTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountExcludingTax" type="{http://directvla.com/schema/businessdomain/common/v1-0}Money" minOccurs="0"/>
 *         &lt;element name="AmountIncludingTax" type="{http://directvla.com/schema/businessdomain/common/v1-0}Money" minOccurs="0"/>
 *         &lt;element name="AppearedOnInvoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://directvla.com/schema/businessdomain/common/v1-0}Money" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByEventId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Entity" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Entity" minOccurs="0"/>
 *         &lt;element name="FinancialAccountID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FinancialBatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialBatchID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HistoryNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceLineText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerAccount" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category"/>
 *         &lt;element name="MarketSegmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OriginalAmount" type="{http://directvla.com/schema/businessdomain/common/v1-0}Money" minOccurs="0"/>
 *         &lt;element name="PaidForInvoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReversedTransactionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://directvla.com/schema/businessdomain/customer/v1-0}FinancialTransactionTaxesCollection" minOccurs="0"/>
 *         &lt;element name="TransactionSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociatedProduct" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialTransaction", propOrder = {
    "amountExcludingTax",
    "amountIncludingTax",
    "appearedOnInvoice",
    "bankDate",
    "baseAmount",
    "comments",
    "createDate",
    "createdByEventId",
    "createdByUserId",
    "customerKey",
    "entity",
    "financialAccountID",
    "financialBatchCode",
    "financialBatchID",
    "historyNumber",
    "id",
    "invoiceLineText",
    "ledgerAccount",
    "marketSegmentId",
    "originalAmount",
    "paidForInvoice",
    "period",
    "productId",
    "receiptNumber",
    "reference",
    "reversedTransactionId",
    "taxes",
    "transactionSubType",
    "transactionType",
    "associatedProduct"
})
@XmlSeeAlso({
    ChargeTransaction.class,
    PaymentTransaction.class
})
public class FinancialTransaction {

    @XmlElement(name = "AmountExcludingTax")
    protected Money amountExcludingTax;
    @XmlElement(name = "AmountIncludingTax")
    protected Money amountIncludingTax;
    @XmlElement(name = "AppearedOnInvoice")
    protected Integer appearedOnInvoice;
    @XmlElement(name = "BankDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankDate;
    @XmlElement(name = "BaseAmount")
    protected Money baseAmount;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CreatedByEventId")
    protected Integer createdByEventId;
    @XmlElement(name = "CreatedByUserId")
    protected Integer createdByUserId;
    @XmlElement(name = "CustomerKey")
    protected int customerKey;
    @XmlElement(name = "Entity")
    protected Entity entity;
    @XmlElement(name = "FinancialAccountID")
    protected int financialAccountID;
    @XmlElement(name = "FinancialBatchCode")
    protected String financialBatchCode;
    @XmlElement(name = "FinancialBatchID")
    protected Integer financialBatchID;
    @XmlElement(name = "HistoryNumber")
    protected Integer historyNumber;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "InvoiceLineText")
    protected String invoiceLineText;
    @XmlElement(name = "LedgerAccount", required = true)
    protected Category ledgerAccount;
    @XmlElement(name = "MarketSegmentId")
    protected Integer marketSegmentId;
    @XmlElement(name = "OriginalAmount")
    protected Money originalAmount;
    @XmlElement(name = "PaidForInvoice")
    protected Integer paidForInvoice;
    @XmlElement(name = "Period")
    protected TimePeriod period;
    @XmlElement(name = "ProductId")
    protected Integer productId;
    @XmlElement(name = "ReceiptNumber")
    protected Integer receiptNumber;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "ReversedTransactionId")
    protected Integer reversedTransactionId;
    @XmlElement(name = "Taxes")
    protected FinancialTransactionTaxesCollection taxes;
    @XmlElement(name = "TransactionSubType")
    protected String transactionSubType;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "AssociatedProduct")
    protected Product associatedProduct;

    /**
     * Gets the value of the amountExcludingTax property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountExcludingTax() {
        return amountExcludingTax;
    }

    /**
     * Sets the value of the amountExcludingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountExcludingTax(Money value) {
        this.amountExcludingTax = value;
    }

    /**
     * Gets the value of the amountIncludingTax property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountIncludingTax() {
        return amountIncludingTax;
    }

    /**
     * Sets the value of the amountIncludingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountIncludingTax(Money value) {
        this.amountIncludingTax = value;
    }

    /**
     * Gets the value of the appearedOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppearedOnInvoice() {
        return appearedOnInvoice;
    }

    /**
     * Sets the value of the appearedOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppearedOnInvoice(Integer value) {
        this.appearedOnInvoice = value;
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
     *     {@link Money }
     *     
     */
    public Money getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBaseAmount(Money value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the createdByEventId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedByEventId() {
        return createdByEventId;
    }

    /**
     * Sets the value of the createdByEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedByEventId(Integer value) {
        this.createdByEventId = value;
    }

    /**
     * Gets the value of the createdByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Sets the value of the createdByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedByUserId(Integer value) {
        this.createdByUserId = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     */
    public int getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     */
    public void setCustomerKey(int value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setEntity(Entity value) {
        this.entity = value;
    }

    /**
     * Gets the value of the financialAccountID property.
     * 
     */
    public int getFinancialAccountID() {
        return financialAccountID;
    }

    /**
     * Sets the value of the financialAccountID property.
     * 
     */
    public void setFinancialAccountID(int value) {
        this.financialAccountID = value;
    }

    /**
     * Gets the value of the financialBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialBatchCode() {
        return financialBatchCode;
    }

    /**
     * Sets the value of the financialBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialBatchCode(String value) {
        this.financialBatchCode = value;
    }

    /**
     * Gets the value of the financialBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialBatchID() {
        return financialBatchID;
    }

    /**
     * Sets the value of the financialBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialBatchID(Integer value) {
        this.financialBatchID = value;
    }

    /**
     * Gets the value of the historyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoryNumber() {
        return historyNumber;
    }

    /**
     * Sets the value of the historyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoryNumber(Integer value) {
        this.historyNumber = value;
    }

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
     * Gets the value of the invoiceLineText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceLineText() {
        return invoiceLineText;
    }

    /**
     * Sets the value of the invoiceLineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceLineText(String value) {
        this.invoiceLineText = value;
    }

    /**
     * Gets the value of the ledgerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getLedgerAccount() {
        return ledgerAccount;
    }

    /**
     * Sets the value of the ledgerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setLedgerAccount(Category value) {
        this.ledgerAccount = value;
    }

    /**
     * Gets the value of the marketSegmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Sets the value of the marketSegmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketSegmentId(Integer value) {
        this.marketSegmentId = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOriginalAmount(Money value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the paidForInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidForInvoice() {
        return paidForInvoice;
    }

    /**
     * Sets the value of the paidForInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidForInvoice(Integer value) {
        this.paidForInvoice = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setPeriod(TimePeriod value) {
        this.period = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiptNumber(Integer value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionTaxesCollection }
     *     
     */
    public FinancialTransactionTaxesCollection getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionTaxesCollection }
     *     
     */
    public void setTaxes(FinancialTransactionTaxesCollection value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the transactionSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSubType() {
        return transactionSubType;
    }

    /**
     * Sets the value of the transactionSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSubType(String value) {
        this.transactionSubType = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the associatedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getAssociatedProduct() {
        return associatedProduct;
    }

    /**
     * Sets the value of the associatedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setAssociatedProduct(Product value) {
        this.associatedProduct = value;
    }

}
