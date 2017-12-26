
package com.directv.afe.billing.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalProductCommercialProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalProductCommercialProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TechnicalProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalProductCommercialProduct", propOrder = {
    "businessUnitId",
    "extended",
    "externalProductId",
    "id",
    "technicalProductId"
})
public class TechnicalProductCommercialProduct {

    @XmlElementRef(name = "BusinessUnitId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> businessUnitId;
    @XmlElementRef(name = "Extended", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extended;
    @XmlElementRef(name = "ExternalProductId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> externalProductId;
    @XmlElementRef(name = "Id", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "TechnicalProductId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> technicalProductId;

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBusinessUnitId(JAXBElement<Integer> value) {
        this.businessUnitId = value;
    }

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
     * Gets the value of the externalProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExternalProductId() {
        return externalProductId;
    }

    /**
     * Sets the value of the externalProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExternalProductId(JAXBElement<Integer> value) {
        this.externalProductId = value;
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
     * Gets the value of the technicalProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTechnicalProductId() {
        return technicalProductId;
    }

    /**
     * Sets the value of the technicalProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTechnicalProductId(JAXBElement<Integer> value) {
        this.technicalProductId = value;
    }

}
