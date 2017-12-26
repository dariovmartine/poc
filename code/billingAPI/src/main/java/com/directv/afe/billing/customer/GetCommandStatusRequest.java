
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
 *         &lt;element name="requestMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestMetadataType"/>
 *         &lt;element name="GetCommandStatus" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCommandStatus"/>
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
    "requestMetadata",
    "getCommandStatus"
})
@XmlRootElement(name = "GetCommandStatusRequest")
public class GetCommandStatusRequest {

    @XmlElement(required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCommandStatus", required = true)
    protected GetCommandStatus getCommandStatus;

    /**
     * Gets the value of the requestMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMetadataType }
     *     
     */
    public RequestMetadataType getRequestMetadata() {
        return requestMetadata;
    }

    /**
     * Sets the value of the requestMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMetadataType }
     *     
     */
    public void setRequestMetadata(RequestMetadataType value) {
        this.requestMetadata = value;
    }

    /**
     * Gets the value of the getCommandStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommandStatus }
     *     
     */
    public GetCommandStatus getGetCommandStatus() {
        return getCommandStatus;
    }

    /**
     * Sets the value of the getCommandStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommandStatus }
     *     
     */
    public void setGetCommandStatus(GetCommandStatus value) {
        this.getCommandStatus = value;
    }

}
