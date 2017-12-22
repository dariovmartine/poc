
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialProductEPCMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialProductEPCMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommercialProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductCodeIdIfCommissionable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialProductEPCMapping", propOrder = {
    "businessUnitId",
    "commercialProductId",
    "extended",
    "externalProductCodeIdIfCommissionable",
    "id"
})
public class CommercialProductEPCMapping {

    @XmlElementRef(name = "BusinessUnitId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> businessUnitId;
    @XmlElementRef(name = "CommercialProductId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commercialProductId;
    @XmlElementRef(name = "Extended", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extended;
    @XmlElementRef(name = "ExternalProductCodeIdIfCommissionable", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> externalProductCodeIdIfCommissionable;
    @XmlElementRef(name = "Id", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;

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
     * Gets the value of the commercialProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommercialProductId() {
        return commercialProductId;
    }

    /**
     * Sets the value of the commercialProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommercialProductId(JAXBElement<Integer> value) {
        this.commercialProductId = value;
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
     * Gets the value of the externalProductCodeIdIfCommissionable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExternalProductCodeIdIfCommissionable() {
        return externalProductCodeIdIfCommissionable;
    }

    /**
     * Sets the value of the externalProductCodeIdIfCommissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExternalProductCodeIdIfCommissionable(JAXBElement<Integer> value) {
        this.externalProductCodeIdIfCommissionable = value;
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

}
