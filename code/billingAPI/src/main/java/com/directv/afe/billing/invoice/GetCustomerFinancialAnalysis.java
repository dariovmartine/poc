
package com.directv.afe.billing.invoice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerFinancialAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerFinancialAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://directvla.com/schema/businessdomain/common/v1-0}NationalIdentityCardIdentification" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerFinancialAnalysis", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "identification",
    "creditCardNumber"
})
public class GetCustomerFinancialAnalysis {

    @XmlElementRef(name = "Identification", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<NationalIdentityCardIdentification> identification;
    @XmlElementRef(name = "creditCardNumber", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardNumber;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NationalIdentityCardIdentification }{@code >}
     *     
     */
    public JAXBElement<NationalIdentityCardIdentification> getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NationalIdentityCardIdentification }{@code >}
     *     
     */
    public void setIdentification(JAXBElement<NationalIdentityCardIdentification> value) {
        this.identification = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardNumber(JAXBElement<String> value) {
        this.creditCardNumber = value;
    }

}
