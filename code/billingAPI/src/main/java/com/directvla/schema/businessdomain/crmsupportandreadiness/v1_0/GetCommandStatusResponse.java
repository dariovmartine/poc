
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
 *         &lt;element name="GetCommandStatusResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCommandStatusResult"/>
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
    "getCommandStatusResult"
})
@XmlRootElement(name = "GetCommandStatusResponse")
public class GetCommandStatusResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCommandStatusResult", required = true)
    protected GetCommandStatusResult getCommandStatusResult;

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
     * Gets the value of the getCommandStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommandStatusResult }
     *     
     */
    public GetCommandStatusResult getGetCommandStatusResult() {
        return getCommandStatusResult;
    }

    /**
     * Sets the value of the getCommandStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommandStatusResult }
     *     
     */
    public void setGetCommandStatusResult(GetCommandStatusResult value) {
        this.getCommandStatusResult = value;
    }

}
