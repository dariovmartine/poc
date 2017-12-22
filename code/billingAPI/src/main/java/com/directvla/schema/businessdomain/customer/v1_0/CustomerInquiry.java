
package com.directvla.schema.businessdomain.customer.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.BusinessInteraction;


/**
 * <p>Java class for CustomerInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInquiry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteraction">
 *       &lt;sequence>
 *         &lt;element name="initiatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvolvesCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvolvesCreationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommercialProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingOrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StampDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInquiry", propOrder = {
    "initiatedByName",
    "involvesCreation",
    "involvesCreationName",
    "workOrderId",
    "commercialProductId",
    "shippingOrderId",
    "stampDate"
})
public class CustomerInquiry
    extends BusinessInteraction
{

    protected String initiatedByName;
    @XmlElement(name = "InvolvesCreation")
    protected String involvesCreation;
    @XmlElement(name = "InvolvesCreationName")
    protected String involvesCreationName;
    @XmlElement(name = "WorkOrderId")
    protected Integer workOrderId;
    @XmlElement(name = "CommercialProductId")
    protected Integer commercialProductId;
    @XmlElement(name = "ShippingOrderId")
    protected Integer shippingOrderId;
    @XmlElement(name = "StampDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stampDate;

    /**
     * Gets the value of the initiatedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatedByName() {
        return initiatedByName;
    }

    /**
     * Sets the value of the initiatedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatedByName(String value) {
        this.initiatedByName = value;
    }

    /**
     * Gets the value of the involvesCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvesCreation() {
        return involvesCreation;
    }

    /**
     * Sets the value of the involvesCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvesCreation(String value) {
        this.involvesCreation = value;
    }

    /**
     * Gets the value of the involvesCreationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvesCreationName() {
        return involvesCreationName;
    }

    /**
     * Sets the value of the involvesCreationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvesCreationName(String value) {
        this.involvesCreationName = value;
    }

    /**
     * Gets the value of the workOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkOrderId() {
        return workOrderId;
    }

    /**
     * Sets the value of the workOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkOrderId(Integer value) {
        this.workOrderId = value;
    }

    /**
     * Gets the value of the commercialProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommercialProductId() {
        return commercialProductId;
    }

    /**
     * Sets the value of the commercialProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommercialProductId(Integer value) {
        this.commercialProductId = value;
    }

    /**
     * Gets the value of the shippingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingOrderId() {
        return shippingOrderId;
    }

    /**
     * Sets the value of the shippingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingOrderId(Integer value) {
        this.shippingOrderId = value;
    }

    /**
     * Gets the value of the stampDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStampDate() {
        return stampDate;
    }

    /**
     * Sets the value of the stampDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStampDate(XMLGregorianCalendar value) {
        this.stampDate = value;
    }

}
