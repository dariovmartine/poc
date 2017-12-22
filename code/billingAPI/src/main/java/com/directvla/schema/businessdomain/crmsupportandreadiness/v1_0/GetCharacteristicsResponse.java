
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
 *         &lt;element name="GetCharacteristicsResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCharacteristicsResult"/>
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
    "getCharacteristicsResult"
})
@XmlRootElement(name = "GetCharacteristicsResponse")
public class GetCharacteristicsResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCharacteristicsResult", required = true)
    protected GetCharacteristicsResult getCharacteristicsResult;

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
     * Gets the value of the getCharacteristicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCharacteristicsResult }
     *     
     */
    public GetCharacteristicsResult getGetCharacteristicsResult() {
        return getCharacteristicsResult;
    }

    /**
     * Sets the value of the getCharacteristicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCharacteristicsResult }
     *     
     */
    public void setGetCharacteristicsResult(GetCharacteristicsResult value) {
        this.getCharacteristicsResult = value;
    }

}
