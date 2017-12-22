
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.util.commondatatypes.v1_0.ResponseMetadataType;


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
 *         &lt;element name="AddOrUpgradeCustomerProductInvolvementResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AddOrUpgradeCustomerProductInvolvementResult"/>
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
    "addOrUpgradeCustomerProductInvolvementResult"
})
@XmlRootElement(name = "AddOrUpgradeCustomerProductInvolvementResponse")
public class AddOrUpgradeCustomerProductInvolvementResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "AddOrUpgradeCustomerProductInvolvementResult", required = true)
    protected AddOrUpgradeCustomerProductInvolvementResult addOrUpgradeCustomerProductInvolvementResult;

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
     * Gets the value of the addOrUpgradeCustomerProductInvolvementResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrUpgradeCustomerProductInvolvementResult }
     *     
     */
    public AddOrUpgradeCustomerProductInvolvementResult getAddOrUpgradeCustomerProductInvolvementResult() {
        return addOrUpgradeCustomerProductInvolvementResult;
    }

    /**
     * Sets the value of the addOrUpgradeCustomerProductInvolvementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrUpgradeCustomerProductInvolvementResult }
     *     
     */
    public void setAddOrUpgradeCustomerProductInvolvementResult(AddOrUpgradeCustomerProductInvolvementResult value) {
        this.addOrUpgradeCustomerProductInvolvementResult = value;
    }

}
