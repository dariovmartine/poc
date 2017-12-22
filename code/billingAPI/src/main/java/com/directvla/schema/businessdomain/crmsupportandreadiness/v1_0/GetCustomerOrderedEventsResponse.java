
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
 *         &lt;element name="GetCustomerOrderedEventsResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerOrderedEventsResult"/>
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
    "getCustomerOrderedEventsResult"
})
@XmlRootElement(name = "GetCustomerOrderedEventsResponse")
public class GetCustomerOrderedEventsResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerOrderedEventsResult", required = true)
    protected GetCustomerOrderedEventsResult getCustomerOrderedEventsResult;

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
     * Gets the value of the getCustomerOrderedEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerOrderedEventsResult }
     *     
     */
    public GetCustomerOrderedEventsResult getGetCustomerOrderedEventsResult() {
        return getCustomerOrderedEventsResult;
    }

    /**
     * Sets the value of the getCustomerOrderedEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerOrderedEventsResult }
     *     
     */
    public void setGetCustomerOrderedEventsResult(GetCustomerOrderedEventsResult value) {
        this.getCustomerOrderedEventsResult = value;
    }

}
