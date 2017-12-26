
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
 *         &lt;element name="DeleteAllActiveCustomerSchedulesResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}DeleteAllActiveCustomerSchedulesResult"/>
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
    "deleteAllActiveCustomerSchedulesResult"
})
@XmlRootElement(name = "DeleteAllActiveCustomerSchedulesResponse")
public class DeleteAllActiveCustomerSchedulesResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "DeleteAllActiveCustomerSchedulesResult", required = true)
    protected DeleteAllActiveCustomerSchedulesResult deleteAllActiveCustomerSchedulesResult;

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
     * Gets the value of the deleteAllActiveCustomerSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteAllActiveCustomerSchedulesResult }
     *     
     */
    public DeleteAllActiveCustomerSchedulesResult getDeleteAllActiveCustomerSchedulesResult() {
        return deleteAllActiveCustomerSchedulesResult;
    }

    /**
     * Sets the value of the deleteAllActiveCustomerSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteAllActiveCustomerSchedulesResult }
     *     
     */
    public void setDeleteAllActiveCustomerSchedulesResult(DeleteAllActiveCustomerSchedulesResult value) {
        this.deleteAllActiveCustomerSchedulesResult = value;
    }

}
