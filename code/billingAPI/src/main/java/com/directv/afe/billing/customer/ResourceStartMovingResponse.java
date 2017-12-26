
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
 *         &lt;element name="ResourceStartMovingResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ResourceStartMovingResult"/>
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
    "resourceStartMovingResult"
})
@XmlRootElement(name = "ResourceStartMovingResponse")
public class ResourceStartMovingResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "ResourceStartMovingResult", required = true)
    protected ResourceStartMovingResult resourceStartMovingResult;

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
     * Gets the value of the resourceStartMovingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceStartMovingResult }
     *     
     */
    public ResourceStartMovingResult getResourceStartMovingResult() {
        return resourceStartMovingResult;
    }

    /**
     * Sets the value of the resourceStartMovingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStartMovingResult }
     *     
     */
    public void setResourceStartMovingResult(ResourceStartMovingResult value) {
        this.resourceStartMovingResult = value;
    }

}
