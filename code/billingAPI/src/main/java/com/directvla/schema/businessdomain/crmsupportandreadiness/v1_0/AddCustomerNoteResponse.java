
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
 *         &lt;element name="ResponseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="AddCustomerNoteResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AddCustomerNoteResult"/>
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
    "addCustomerNoteResult"
})
@XmlRootElement(name = "AddCustomerNoteResponse")
public class AddCustomerNoteResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "AddCustomerNoteResult", required = true)
    protected AddCustomerNoteResult addCustomerNoteResult;

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
     * Gets the value of the addCustomerNoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddCustomerNoteResult }
     *     
     */
    public AddCustomerNoteResult getAddCustomerNoteResult() {
        return addCustomerNoteResult;
    }

    /**
     * Sets the value of the addCustomerNoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddCustomerNoteResult }
     *     
     */
    public void setAddCustomerNoteResult(AddCustomerNoteResult value) {
        this.addCustomerNoteResult = value;
    }

}
