
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
 *         &lt;element name="RequestMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestMetadataType"/>
 *         &lt;element name="DeleteCustomerScheduleById" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}DeleteCustomerScheduleById"/>
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
    "deleteCustomerScheduleById"
})
@XmlRootElement(name = "DeleteCustomerScheduleByIdRequest")
public class DeleteCustomerScheduleByIdRequest {

    @XmlElement(name = "RequestMetadata", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "DeleteCustomerScheduleById", required = true)
    protected DeleteCustomerScheduleById deleteCustomerScheduleById;

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
     * Gets the value of the deleteCustomerScheduleById property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCustomerScheduleById }
     *     
     */
    public DeleteCustomerScheduleById getDeleteCustomerScheduleById() {
        return deleteCustomerScheduleById;
    }

    /**
     * Sets the value of the deleteCustomerScheduleById property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCustomerScheduleById }
     *     
     */
    public void setDeleteCustomerScheduleById(DeleteCustomerScheduleById value) {
        this.deleteCustomerScheduleById = value;
    }

}
