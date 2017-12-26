
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
 *         &lt;element name="responseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="AddCustomerAccountProductInvolvementWithResourceResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AddCustomerAccountProductInvolvementWithResourceResult"/>
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
    "addCustomerAccountProductInvolvementWithResourceResult"
})
@XmlRootElement(name = "AddCustomerAccountProductInvolvementWithResourceResponse")
public class AddCustomerAccountProductInvolvementWithResourceResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "AddCustomerAccountProductInvolvementWithResourceResult", required = true)
    protected AddCustomerAccountProductInvolvementWithResourceResult addCustomerAccountProductInvolvementWithResourceResult;

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
     * Gets the value of the addCustomerAccountProductInvolvementWithResourceResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddCustomerAccountProductInvolvementWithResourceResult }
     *     
     */
    public AddCustomerAccountProductInvolvementWithResourceResult getAddCustomerAccountProductInvolvementWithResourceResult() {
        return addCustomerAccountProductInvolvementWithResourceResult;
    }

    /**
     * Sets the value of the addCustomerAccountProductInvolvementWithResourceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddCustomerAccountProductInvolvementWithResourceResult }
     *     
     */
    public void setAddCustomerAccountProductInvolvementWithResourceResult(AddCustomerAccountProductInvolvementWithResourceResult value) {
        this.addCustomerAccountProductInvolvementWithResourceResult = value;
    }

}
