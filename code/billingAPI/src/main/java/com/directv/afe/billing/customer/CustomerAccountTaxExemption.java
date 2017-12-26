
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAccountTaxExemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountTaxExemption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuingJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validFor" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountTaxExemption", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "issuingJurisdiction",
    "certificateNumber",
    "validFor"
})
public class CustomerAccountTaxExemption {

    @XmlElement(required = true)
    protected String issuingJurisdiction;
    @XmlElement(required = true)
    protected String certificateNumber;
    @XmlElement(required = true)
    protected TimePeriod validFor;

    /**
     * Gets the value of the issuingJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingJurisdiction() {
        return issuingJurisdiction;
    }

    /**
     * Sets the value of the issuingJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingJurisdiction(String value) {
        this.issuingJurisdiction = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

}
