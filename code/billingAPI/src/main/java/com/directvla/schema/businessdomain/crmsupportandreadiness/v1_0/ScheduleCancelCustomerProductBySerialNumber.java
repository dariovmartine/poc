
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.PhysicalResource;


/**
 * <p>Java class for ScheduleCancelCustomerProductBySerialNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleCancelCustomerProductBySerialNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resource" type="{http://directvla.com/schema/businessdomain/common/v1-0}PhysicalResource"/>
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleCancelCustomerProductBySerialNumber", propOrder = {
    "resource",
    "scheduleDate",
    "reason"
})
public class ScheduleCancelCustomerProductBySerialNumber {

    @XmlElement(name = "Resource", required = true)
    protected PhysicalResource resource;
    @XmlElement(name = "ScheduleDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResource }
     *     
     */
    public PhysicalResource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResource }
     *     
     */
    public void setResource(PhysicalResource value) {
        this.resource = value;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     */
    public int getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     */
    public void setReason(int value) {
        this.reason = value;
    }

}
