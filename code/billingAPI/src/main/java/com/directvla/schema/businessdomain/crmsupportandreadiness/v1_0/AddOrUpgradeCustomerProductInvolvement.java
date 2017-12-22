
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpgradeCustomerProductInvolvement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpgradeCustomerProductInvolvement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FinanceOptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonAddProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonUpgradeOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonUpgradeNew" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonReconnectCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReasonReconnectDisconnected" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReasonReconnectSuspended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReasonActivation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpgradeCustomerProductInvolvement", propOrder = {
    "customerKey",
    "agreementKey",
    "productCode",
    "financeOptionId",
    "reasonAddProduct",
    "reasonUpgradeOld",
    "reasonUpgradeNew",
    "reasonReconnectCancelled",
    "reasonReconnectDisconnected",
    "reasonReconnectSuspended",
    "reasonActivation",
    "resourceSerialNumber"
})
public class AddOrUpgradeCustomerProductInvolvement {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "AgreementKey")
    protected int agreementKey;
    @XmlElement(name = "ProductCode")
    protected int productCode;
    @XmlElement(name = "FinanceOptionId")
    protected String financeOptionId;
    @XmlElement(name = "ReasonAddProduct")
    protected int reasonAddProduct;
    @XmlElement(name = "ReasonUpgradeOld")
    protected int reasonUpgradeOld;
    @XmlElement(name = "ReasonUpgradeNew")
    protected int reasonUpgradeNew;
    @XmlElement(name = "ReasonReconnectCancelled")
    protected Integer reasonReconnectCancelled;
    @XmlElement(name = "ReasonReconnectDisconnected")
    protected Integer reasonReconnectDisconnected;
    @XmlElement(name = "ReasonReconnectSuspended")
    protected Integer reasonReconnectSuspended;
    @XmlElement(name = "ReasonActivation")
    protected Integer reasonActivation;
    @XmlElement(name = "ResourceSerialNumber")
    protected String resourceSerialNumber;

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
     * Gets the value of the productCode property.
     * 
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     */
    public void setProductCode(int value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the financeOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceOptionId() {
        return financeOptionId;
    }

    /**
     * Sets the value of the financeOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceOptionId(String value) {
        this.financeOptionId = value;
    }

    /**
     * Gets the value of the reasonAddProduct property.
     * 
     */
    public int getReasonAddProduct() {
        return reasonAddProduct;
    }

    /**
     * Sets the value of the reasonAddProduct property.
     * 
     */
    public void setReasonAddProduct(int value) {
        this.reasonAddProduct = value;
    }

    /**
     * Gets the value of the reasonUpgradeOld property.
     * 
     */
    public int getReasonUpgradeOld() {
        return reasonUpgradeOld;
    }

    /**
     * Sets the value of the reasonUpgradeOld property.
     * 
     */
    public void setReasonUpgradeOld(int value) {
        this.reasonUpgradeOld = value;
    }

    /**
     * Gets the value of the reasonUpgradeNew property.
     * 
     */
    public int getReasonUpgradeNew() {
        return reasonUpgradeNew;
    }

    /**
     * Sets the value of the reasonUpgradeNew property.
     * 
     */
    public void setReasonUpgradeNew(int value) {
        this.reasonUpgradeNew = value;
    }

    /**
     * Gets the value of the reasonReconnectCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonReconnectCancelled() {
        return reasonReconnectCancelled;
    }

    /**
     * Sets the value of the reasonReconnectCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonReconnectCancelled(Integer value) {
        this.reasonReconnectCancelled = value;
    }

    /**
     * Gets the value of the reasonReconnectDisconnected property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonReconnectDisconnected() {
        return reasonReconnectDisconnected;
    }

    /**
     * Sets the value of the reasonReconnectDisconnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonReconnectDisconnected(Integer value) {
        this.reasonReconnectDisconnected = value;
    }

    /**
     * Gets the value of the reasonReconnectSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonReconnectSuspended() {
        return reasonReconnectSuspended;
    }

    /**
     * Sets the value of the reasonReconnectSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonReconnectSuspended(Integer value) {
        this.reasonReconnectSuspended = value;
    }

    /**
     * Gets the value of the reasonActivation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonActivation() {
        return reasonActivation;
    }

    /**
     * Sets the value of the reasonActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonActivation(Integer value) {
        this.reasonActivation = value;
    }

    /**
     * Gets the value of the resourceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceSerialNumber() {
        return resourceSerialNumber;
    }

    /**
     * Sets the value of the resourceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceSerialNumber(String value) {
        this.resourceSerialNumber = value;
    }

}
