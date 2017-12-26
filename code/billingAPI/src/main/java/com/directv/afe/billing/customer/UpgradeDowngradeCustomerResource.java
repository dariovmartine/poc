
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeDowngradeCustomerResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeDowngradeCustomerResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OldIRDSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewIRDSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OldSmartcardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewSmartcardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Product" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product"/>
 *         &lt;element name="ReasonIdMigration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeDowngradeCustomerResource", propOrder = {
    "customerKey",
    "agreementKey",
    "oldIRDSerialNumber",
    "newIRDSerialNumber",
    "oldSmartcardSerialNumber",
    "newSmartcardSerialNumber",
    "product",
    "reasonIdMigration",
    "workOrderId"
})
public class UpgradeDowngradeCustomerResource {

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
    @XmlElement(name = "Product", required = true)
    protected Product product;
    @XmlElement(name = "ReasonIdMigration")
    protected int reasonIdMigration;
    @XmlElement(name = "WorkOrderId")
    protected int workOrderId;

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
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

}
