
package com.directv.afe.billing.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAEntitlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAEntitlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CASystemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntitlementGeoRegionFilterList" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="EntitlementGeoRegionFilterType" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}EntitlementGeoRegionFilterType" minOccurs="0"/>
 *         &lt;element name="Entitlements1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Entitlements2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Entitlements3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CAEntitlement", propOrder = {
    "caSystemId",
    "entitlementGeoRegionFilterList",
    "entitlementGeoRegionFilterType",
    "entitlements1",
    "entitlements2",
    "entitlements3",
    "extended",
    "id"
})
public class CAEntitlement {

    @XmlElementRef(name = "CASystemId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caSystemId;
    @XmlElementRef(name = "EntitlementGeoRegionFilterList", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> entitlementGeoRegionFilterList;
    @XmlElement(name = "EntitlementGeoRegionFilterType")
    @XmlSchemaType(name = "string")
    protected EntitlementGeoRegionFilterType entitlementGeoRegionFilterType;
    @XmlElementRef(name = "Entitlements1", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entitlements1;
    @XmlElementRef(name = "Entitlements2", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entitlements2;
    @XmlElementRef(name = "Entitlements3", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entitlements3;
    @XmlElementRef(name = "Extended", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extended;
    @XmlElementRef(name = "Id", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;

    /**
     * Gets the value of the caSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCASystemId() {
        return caSystemId;
    }

    /**
     * Sets the value of the caSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCASystemId(JAXBElement<Integer> value) {
        this.caSystemId = value;
    }

    /**
     * Gets the value of the entitlementGeoRegionFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getEntitlementGeoRegionFilterList() {
        return entitlementGeoRegionFilterList;
    }

    /**
     * Sets the value of the entitlementGeoRegionFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setEntitlementGeoRegionFilterList(JAXBElement<ArrayOfint> value) {
        this.entitlementGeoRegionFilterList = value;
    }

    /**
     * Gets the value of the entitlementGeoRegionFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementGeoRegionFilterType }
     *     
     */
    public EntitlementGeoRegionFilterType getEntitlementGeoRegionFilterType() {
        return entitlementGeoRegionFilterType;
    }

    /**
     * Sets the value of the entitlementGeoRegionFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementGeoRegionFilterType }
     *     
     */
    public void setEntitlementGeoRegionFilterType(EntitlementGeoRegionFilterType value) {
        this.entitlementGeoRegionFilterType = value;
    }

    /**
     * Gets the value of the entitlements1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntitlements1() {
        return entitlements1;
    }

    /**
     * Sets the value of the entitlements1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntitlements1(JAXBElement<String> value) {
        this.entitlements1 = value;
    }

    /**
     * Gets the value of the entitlements2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntitlements2() {
        return entitlements2;
    }

    /**
     * Sets the value of the entitlements2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntitlements2(JAXBElement<String> value) {
        this.entitlements2 = value;
    }

    /**
     * Gets the value of the entitlements3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntitlements3() {
        return entitlements3;
    }

    /**
     * Sets the value of the entitlements3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntitlements3(JAXBElement<String> value) {
        this.entitlements3 = value;
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
