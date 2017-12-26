
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="AddCustomerCharacteristicResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AddCustomerCharacteristicResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseMetadata",
    "addCustomerCharacteristicResult"
})
@XmlRootElement(name = "AddCustomerCharacteristicResponse")
public class AddCustomerCharacteristicResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "AddCustomerCharacteristicResult", required = true)
    protected AddCustomerCharacteristicResult addCustomerCharacteristicResult;

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadataType }
     *     
     */
    public ResponseMetadataType getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadataType }
     *     
     */
    public void setResponseMetadata(ResponseMetadataType value) {
        this.responseMetadata = value;
    }

    /**
     * Gets the value of the addCustomerCharacteristicResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddCustomerCharacteristicResult }
     *     
     */
    public AddCustomerCharacteristicResult getAddCustomerCharacteristicResult() {
        return addCustomerCharacteristicResult;
    }

    /**
     * Sets the value of the addCustomerCharacteristicResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddCustomerCharacteristicResult }
     *     
     */
    public void setAddCustomerCharacteristicResult(AddCustomerCharacteristicResult value) {
        this.addCustomerCharacteristicResult = value;
    }

}
