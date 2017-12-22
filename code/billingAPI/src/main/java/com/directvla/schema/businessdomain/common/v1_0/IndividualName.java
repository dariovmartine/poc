
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}PartyName">
 *       &lt;sequence>
 *         &lt;element name="formattedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aristocraticTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formOfAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyGeneration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualifications" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualName", propOrder = {
    "formattedName",
    "legalName",
    "aristocraticTitle",
    "formOfAddress",
    "generation",
    "givenNames",
    "preferredGivenName",
    "middleNames",
    "familyNamePrefix",
    "familyNames",
    "familyGeneration",
    "qualifications"
})
public class IndividualName
    extends PartyName
{

    protected String formattedName;
    protected String legalName;
    protected String aristocraticTitle;
    protected String formOfAddress;
    protected String generation;
    protected String givenNames;
    protected String preferredGivenName;
    protected String middleNames;
    protected String familyNamePrefix;
    protected String familyNames;
    protected String familyGeneration;
    protected Category qualifications;

    /**
     * Gets the value of the formattedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Sets the value of the formattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedName(String value) {
        this.formattedName = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the aristocraticTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAristocraticTitle() {
        return aristocraticTitle;
    }

    /**
     * Sets the value of the aristocraticTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAristocraticTitle(String value) {
        this.aristocraticTitle = value;
    }

    /**
     * Gets the value of the formOfAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfAddress() {
        return formOfAddress;
    }

    /**
     * Sets the value of the formOfAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfAddress(String value) {
        this.formOfAddress = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneration(String value) {
        this.generation = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
    }

    /**
     * Gets the value of the preferredGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredGivenName() {
        return preferredGivenName;
    }

    /**
     * Sets the value of the preferredGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredGivenName(String value) {
        this.preferredGivenName = value;
    }

    /**
     * Gets the value of the middleNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNames() {
        return middleNames;
    }

    /**
     * Sets the value of the middleNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNames(String value) {
        this.middleNames = value;
    }

    /**
     * Gets the value of the familyNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNamePrefix() {
        return familyNamePrefix;
    }

    /**
     * Sets the value of the familyNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNamePrefix(String value) {
        this.familyNamePrefix = value;
    }

    /**
     * Gets the value of the familyNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNames() {
        return familyNames;
    }

    /**
     * Sets the value of the familyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNames(String value) {
        this.familyNames = value;
    }

    /**
     * Gets the value of the familyGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyGeneration() {
        return familyGeneration;
    }

    /**
     * Sets the value of the familyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyGeneration(String value) {
        this.familyGeneration = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setQualifications(Category value) {
        this.qualifications = value;
    }

}
