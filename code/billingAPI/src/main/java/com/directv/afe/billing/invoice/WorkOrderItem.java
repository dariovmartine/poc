
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteractionItem">
 *       &lt;sequence>
 *         &lt;element name="WorkOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderItem", propOrder = {
    "workOrderID"
})
public class WorkOrderItem
    extends BusinessInteractionItem
{

    @XmlElement(name = "WorkOrderID")
    protected Integer workOrderID;

    /**
     * Gets the value of the workOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkOrderID() {
        return workOrderID;
    }

    /**
     * Sets the value of the workOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkOrderID(Integer value) {
        this.workOrderID = value;
    }

}