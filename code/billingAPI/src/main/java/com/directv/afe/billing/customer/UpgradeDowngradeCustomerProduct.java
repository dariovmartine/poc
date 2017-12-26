
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpgradeDowngradeCustomerProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeDowngradeCustomerProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OldProduct" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product"/>
 *         &lt;element name="NewProduct" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product"/>
 *         &lt;element name="ReasonOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonNew" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeDowngradeCustomerProduct", propOrder = {
    "customerKey",
    "agreementKey",
    "oldProduct",
    "newProduct",
    "reasonOld",
    "reasonNew",
    "scheduleDate"
})
public class UpgradeDowngradeCustomerProduct {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "AgreementKey")
    protected int agreementKey;
    @XmlElement(name = "OldProduct", required = true)
    protected Product oldProduct;
    @XmlElement(name = "NewProduct", required = true)
    protected Product newProduct;
    @XmlElement(name = "ReasonOld")
    protected int reasonOld;
    @XmlElement(name = "ReasonNew")
    protected int reasonNew;
    @XmlElement(name = "ScheduleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleDate;

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
     * Gets the value of the oldProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getOldProduct() {
        return oldProduct;
    }

    /**
     * Sets the value of the oldProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setOldProduct(Product value) {
        this.oldProduct = value;
    }

    /**
     * Gets the value of the newProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getNewProduct() {
        return newProduct;
    }

    /**
     * Sets the value of the newProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setNewProduct(Product value) {
        this.newProduct = value;
    }

    /**
     * Gets the value of the reasonOld property.
     * 
     */
    public int getReasonOld() {
        return reasonOld;
    }

    /**
     * Sets the value of the reasonOld property.
     * 
     */
    public void setReasonOld(int value) {
        this.reasonOld = value;
    }

    /**
     * Gets the value of the reasonNew property.
     * 
     */
    public int getReasonNew() {
        return reasonNew;
    }

    /**
     * Sets the value of the reasonNew property.
     * 
     */
    public void setReasonNew(int value) {
        this.reasonNew = value;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

}
