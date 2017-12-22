
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.util.commondatatypes.v1_0.RequestMetadataType;


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
 *         &lt;element name="DeleteCustomerCharacteristic" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}DeleteCustomerCharacteristic"/>
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
    "deleteCustomerCharacteristic"
})
@XmlRootElement(name = "DeleteCustomerCharacteristicRequest")
public class DeleteCustomerCharacteristicRequest {

    @XmlElement(name = "RequestMetadata", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "DeleteCustomerCharacteristic", required = true)
    protected DeleteCustomerCharacteristic deleteCustomerCharacteristic;

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
     * Gets the value of the deleteCustomerCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCustomerCharacteristic }
     *     
     */
    public DeleteCustomerCharacteristic getDeleteCustomerCharacteristic() {
        return deleteCustomerCharacteristic;
    }

    /**
     * Sets the value of the deleteCustomerCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCustomerCharacteristic }
     *     
     */
    public void setDeleteCustomerCharacteristic(DeleteCustomerCharacteristic value) {
        this.deleteCustomerCharacteristic = value;
    }

}
