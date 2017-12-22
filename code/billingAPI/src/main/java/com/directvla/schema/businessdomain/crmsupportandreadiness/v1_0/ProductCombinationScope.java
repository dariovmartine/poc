
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCombinationScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCombinationScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAgreementLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomerLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDevicesLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFinancialAccountLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductCombinationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCombinationScope", propOrder = {
    "extended",
    "id",
    "isAgreementLevel",
    "isCustomerLevel",
    "isDevicesLevel",
    "isFinancialAccountLevel",
    "productCombinationId"
})
public class ProductCombinationScope {

    @XmlElementRef(name = "Extended", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extended;
    @XmlElementRef(name = "Id", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "IsAgreementLevel", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAgreementLevel;
    @XmlElementRef(name = "IsCustomerLevel", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCustomerLevel;
    @XmlElementRef(name = "IsDevicesLevel", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDevicesLevel;
    @XmlElementRef(name = "IsFinancialAccountLevel", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isFinancialAccountLevel;
    @XmlElementRef(name = "ProductCombinationId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> productCombinationId;

    /**
     * Gets the value of the extended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtended(JAXBElement<String> value) {
        this.extended = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = value;
    }

    /**
     * Gets the value of the isAgreementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAgreementLevel() {
        return isAgreementLevel;
    }

    /**
     * Sets the value of the isAgreementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAgreementLevel(JAXBElement<Boolean> value) {
        this.isAgreementLevel = value;
    }

    /**
     * Gets the value of the isCustomerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCustomerLevel() {
        return isCustomerLevel;
    }

    /**
     * Sets the value of the isCustomerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCustomerLevel(JAXBElement<Boolean> value) {
        this.isCustomerLevel = value;
    }

    /**
     * Gets the value of the isDevicesLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDevicesLevel() {
        return isDevicesLevel;
    }

    /**
     * Sets the value of the isDevicesLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDevicesLevel(JAXBElement<Boolean> value) {
        this.isDevicesLevel = value;
    }

    /**
     * Gets the value of the isFinancialAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsFinancialAccountLevel() {
        return isFinancialAccountLevel;
    }

    /**
     * Sets the value of the isFinancialAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsFinancialAccountLevel(JAXBElement<Boolean> value) {
        this.isFinancialAccountLevel = value;
    }

    /**
     * Gets the value of the productCombinationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProductCombinationId() {
        return productCombinationId;
    }

    /**
     * Sets the value of the productCombinationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProductCombinationId(JAXBElement<Integer> value) {
        this.productCombinationId = value;
    }

}
