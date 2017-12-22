
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
 *         &lt;element name="GetCustomerProductByStatusResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerProductByStatusResult"/>
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
    "getCustomerProductByStatusResult"
})
@XmlRootElement(name = "GetCustomerProductByStatusResponse")
public class GetCustomerProductByStatusResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerProductByStatusResult", required = true)
    protected GetCustomerProductByStatusResult getCustomerProductByStatusResult;

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
     * Gets the value of the getCustomerProductByStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerProductByStatusResult }
     *     
     */
    public GetCustomerProductByStatusResult getGetCustomerProductByStatusResult() {
        return getCustomerProductByStatusResult;
    }

    /**
     * Sets the value of the getCustomerProductByStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerProductByStatusResult }
     *     
     */
    public void setGetCustomerProductByStatusResult(GetCustomerProductByStatusResult value) {
        this.getCustomerProductByStatusResult = value;
    }

}
