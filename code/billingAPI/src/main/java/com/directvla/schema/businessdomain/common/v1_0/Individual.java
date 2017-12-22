
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Party">
 *       &lt;sequence>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliveDuring" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="IdentifiedBy" type="{http://directvla.com/schema/businessdomain/common/v1-0}IndividualIdentificationCollection" minOccurs="0"/>
 *         &lt;element name="NameUsing" type="{http://directvla.com/schema/businessdomain/common/v1-0}IndividualNameCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual", propOrder = {
    "gender",
    "placeOfBirth",
    "nationality",
    "maritalStatus",
    "aliveDuring",
    "identifiedBy",
    "nameUsing"
})
public class Individual
    extends Party
{

    protected String gender;
    protected String placeOfBirth;
    protected String nationality;
    protected String maritalStatus;
    protected TimePeriod aliveDuring;
    @XmlElement(name = "IdentifiedBy")
    protected IndividualIdentificationCollection identifiedBy;
    @XmlElement(name = "NameUsing")
    protected IndividualNameCollection nameUsing;

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the aliveDuring property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getAliveDuring() {
        return aliveDuring;
    }

    /**
     * Sets the value of the aliveDuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setAliveDuring(TimePeriod value) {
        this.aliveDuring = value;
    }

    /**
     * Gets the value of the identifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualIdentificationCollection }
     *     
     */
    public IndividualIdentificationCollection getIdentifiedBy() {
        return identifiedBy;
    }

    /**
     * Sets the value of the identifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualIdentificationCollection }
     *     
     */
    public void setIdentifiedBy(IndividualIdentificationCollection value) {
        this.identifiedBy = value;
    }

    /**
     * Gets the value of the nameUsing property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameCollection }
     *     
     */
    public IndividualNameCollection getNameUsing() {
        return nameUsing;
    }

    /**
     * Sets the value of the nameUsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameCollection }
     *     
     */
    public void setNameUsing(IndividualNameCollection value) {
        this.nameUsing = value;
    }

}
