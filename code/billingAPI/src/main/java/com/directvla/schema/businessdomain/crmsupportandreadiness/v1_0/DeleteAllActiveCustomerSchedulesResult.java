
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteAllActiveCustomerSchedulesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteAllActiveCustomerSchedulesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchedulesDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAllActiveCustomerSchedulesResult", propOrder = {
    "schedulesDeleted"
})
public class DeleteAllActiveCustomerSchedulesResult {

    @XmlElement(name = "SchedulesDeleted")
    protected boolean schedulesDeleted;

    /**
     * Gets the value of the schedulesDeleted property.
     * 
     */
    public boolean isSchedulesDeleted() {
        return schedulesDeleted;
    }

    /**
     * Sets the value of the schedulesDeleted property.
     * 
     */
    public void setSchedulesDeleted(boolean value) {
        this.schedulesDeleted = value;
    }

}
