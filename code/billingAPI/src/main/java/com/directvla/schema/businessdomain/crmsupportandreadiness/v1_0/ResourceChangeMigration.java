
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceChangeMigration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceChangeMigration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OldIRDSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewIRDSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OldSmartcardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewSmartcardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonIdMigration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductIdOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductIdNew" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdOldProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdNewProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StockhandlerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdOldSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdNewSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrderServiceReasonId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdComplete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonIdEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oldProductIdResource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newProductIdResource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceChangeMigration", propOrder = {
    "customerKey",
    "agreementKey",
    "oldIRDSerialNumber",
    "newIRDSerialNumber",
    "oldSmartcardSerialNumber",
    "newSmartcardSerialNumber",
    "reasonIdMigration",
    "productIdOld",
    "productIdNew",
    "reasonIdOldProduct",
    "reasonIdNewProduct",
    "stockhandlerId",
    "reasonIdOldSerial",
    "reasonIdNewSerial",
    "workOrderServiceReasonId",
    "workOrderId",
    "reasonIdComplete",
    "reasonIdEdit",
    "oldProductIdResource",
    "newProductIdResource"
})
public class ResourceChangeMigration {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "AgreementKey")
    protected int agreementKey;
    @XmlElement(name = "OldIRDSerialNumber", required = true)
    protected String oldIRDSerialNumber;
    @XmlElement(name = "NewIRDSerialNumber", required = true)
    protected String newIRDSerialNumber;
    @XmlElement(name = "OldSmartcardSerialNumber", required = true)
    protected String oldSmartcardSerialNumber;
    @XmlElement(name = "NewSmartcardSerialNumber", required = true)
    protected String newSmartcardSerialNumber;
    @XmlElement(name = "ReasonIdMigration")
    protected int reasonIdMigration;
    @XmlElement(name = "ProductIdOld")
    protected int productIdOld;
    @XmlElement(name = "ProductIdNew")
    protected int productIdNew;
    @XmlElement(name = "ReasonIdOldProduct")
    protected int reasonIdOldProduct;
    @XmlElement(name = "ReasonIdNewProduct")
    protected int reasonIdNewProduct;
    @XmlElement(name = "StockhandlerId")
    protected int stockhandlerId;
    @XmlElement(name = "ReasonIdOldSerial")
    protected int reasonIdOldSerial;
    @XmlElement(name = "ReasonIdNewSerial")
    protected int reasonIdNewSerial;
    @XmlElement(name = "WorkOrderServiceReasonId")
    protected int workOrderServiceReasonId;
    @XmlElement(name = "WorkOrderId")
    protected int workOrderId;
    @XmlElement(name = "ReasonIdComplete")
    protected int reasonIdComplete;
    @XmlElement(name = "ReasonIdEdit")
    protected int reasonIdEdit;
    protected int oldProductIdResource;
    protected int newProductIdResource;

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
     * Gets the value of the agreementKey property.
     * 
     */
    public int getAgreementKey() {
        return agreementKey;
    }

    /**
     * Sets the value of the agreementKey property.
     * 
     */
    public void setAgreementKey(int value) {
        this.agreementKey = value;
    }

    /**
     * Gets the value of the oldIRDSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIRDSerialNumber() {
        return oldIRDSerialNumber;
    }

    /**
     * Sets the value of the oldIRDSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIRDSerialNumber(String value) {
        this.oldIRDSerialNumber = value;
    }

    /**
     * Gets the value of the newIRDSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIRDSerialNumber() {
        return newIRDSerialNumber;
    }

    /**
     * Sets the value of the newIRDSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIRDSerialNumber(String value) {
        this.newIRDSerialNumber = value;
    }

    /**
     * Gets the value of the oldSmartcardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSmartcardSerialNumber() {
        return oldSmartcardSerialNumber;
    }

    /**
     * Sets the value of the oldSmartcardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSmartcardSerialNumber(String value) {
        this.oldSmartcardSerialNumber = value;
    }

    /**
     * Gets the value of the newSmartcardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSmartcardSerialNumber() {
        return newSmartcardSerialNumber;
    }

    /**
     * Sets the value of the newSmartcardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSmartcardSerialNumber(String value) {
        this.newSmartcardSerialNumber = value;
    }

    /**
     * Gets the value of the reasonIdMigration property.
     * 
     */
    public int getReasonIdMigration() {
        return reasonIdMigration;
    }

    /**
     * Sets the value of the reasonIdMigration property.
     * 
     */
    public void setReasonIdMigration(int value) {
        this.reasonIdMigration = value;
    }

    /**
     * Gets the value of the productIdOld property.
     * 
     */
    public int getProductIdOld() {
        return productIdOld;
    }

    /**
     * Sets the value of the productIdOld property.
     * 
     */
    public void setProductIdOld(int value) {
        this.productIdOld = value;
    }

    /**
     * Gets the value of the productIdNew property.
     * 
     */
    public int getProductIdNew() {
        return productIdNew;
    }

    /**
     * Sets the value of the productIdNew property.
     * 
     */
    public void setProductIdNew(int value) {
        this.productIdNew = value;
    }

    /**
     * Gets the value of the reasonIdOldProduct property.
     * 
     */
    public int getReasonIdOldProduct() {
        return reasonIdOldProduct;
    }

    /**
     * Sets the value of the reasonIdOldProduct property.
     * 
     */
    public void setReasonIdOldProduct(int value) {
        this.reasonIdOldProduct = value;
    }

    /**
     * Gets the value of the reasonIdNewProduct property.
     * 
     */
    public int getReasonIdNewProduct() {
        return reasonIdNewProduct;
    }

    /**
     * Sets the value of the reasonIdNewProduct property.
     * 
     */
    public void setReasonIdNewProduct(int value) {
        this.reasonIdNewProduct = value;
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
     * Gets the value of the reasonIdOldSerial property.
     * 
     */
    public int getReasonIdOldSerial() {
        return reasonIdOldSerial;
    }

    /**
     * Sets the value of the reasonIdOldSerial property.
     * 
     */
    public void setReasonIdOldSerial(int value) {
        this.reasonIdOldSerial = value;
    }

    /**
     * Gets the value of the reasonIdNewSerial property.
     * 
     */
    public int getReasonIdNewSerial() {
        return reasonIdNewSerial;
    }

    /**
     * Sets the value of the reasonIdNewSerial property.
     * 
     */
    public void setReasonIdNewSerial(int value) {
        this.reasonIdNewSerial = value;
    }

    /**
     * Gets the value of the workOrderServiceReasonId property.
     * 
     */
    public int getWorkOrderServiceReasonId() {
        return workOrderServiceReasonId;
    }

    /**
     * Sets the value of the workOrderServiceReasonId property.
     * 
     */
    public void setWorkOrderServiceReasonId(int value) {
        this.workOrderServiceReasonId = value;
    }

    /**
     * Gets the value of the workOrderId property.
     * 
     */
    public int getWorkOrderId() {
        return workOrderId;
    }

    /**
     * Sets the value of the workOrderId property.
     * 
     */
    public void setWorkOrderId(int value) {
        this.workOrderId = value;
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
     * Gets the value of the oldProductIdResource property.
     * 
     */
    public int getOldProductIdResource() {
        return oldProductIdResource;
    }

    /**
     * Sets the value of the oldProductIdResource property.
     * 
     */
    public void setOldProductIdResource(int value) {
        this.oldProductIdResource = value;
    }

    /**
     * Gets the value of the newProductIdResource property.
     * 
     */
    public int getNewProductIdResource() {
        return newProductIdResource;
    }

    /**
     * Sets the value of the newProductIdResource property.
     * 
     */
    public void setNewProductIdResource(int value) {
        this.newProductIdResource = value;
    }

}
