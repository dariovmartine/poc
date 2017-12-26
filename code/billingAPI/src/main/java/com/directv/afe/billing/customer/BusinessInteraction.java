
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionDateComplete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interactionStatus" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="initiatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Involves" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteractionType" minOccurs="0"/>
 *         &lt;element name="interactionLocationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvolvesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompromisedOf" type="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteractionItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteraction", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "customerKey",
    "id",
    "interactionDate",
    "description",
    "interactionDateComplete",
    "interactionStatus",
    "initiatedBy",
    "involves",
    "type",
    "interactionLocationKey",
    "characteristicValue",
    "referencesId",
    "actionTaken",
    "involvesName",
    "compromisedOf"
})
@XmlSeeAlso({
    CustomerInquiry.class,
    Agreement.class,
    Request.class,
    Response.class
})
public abstract class BusinessInteraction {

    @XmlElement(name = "CustomerKey")
    protected String customerKey;
    @XmlElement(name = "ID")
    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDate;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDateComplete;
    protected Category interactionStatus;
    protected String initiatedBy;
    @XmlElement(name = "Involves")
    protected String involves;
    protected BusinessInteractionType type;
    protected String interactionLocationKey;
    @XmlElement(name = "CharacteristicValue")
    protected String characteristicValue;
    @XmlElement(name = "ReferencesId")
    protected String referencesId;
    protected String actionTaken;
    @XmlElement(name = "InvolvesName")
    protected String involvesName;
    @XmlElement(name = "CompromisedOf")
    protected List<BusinessInteractionItem> compromisedOf;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the interactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDate(XMLGregorianCalendar value) {
        this.interactionDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the interactionDateComplete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDateComplete() {
        return interactionDateComplete;
    }

    /**
     * Sets the value of the interactionDateComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDateComplete(XMLGregorianCalendar value) {
        this.interactionDateComplete = value;
    }

    /**
     * Gets the value of the interactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getInteractionStatus() {
        return interactionStatus;
    }

    /**
     * Sets the value of the interactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setInteractionStatus(Category value) {
        this.interactionStatus = value;
    }

    /**
     * Gets the value of the initiatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatedBy() {
        return initiatedBy;
    }

    /**
     * Sets the value of the initiatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatedBy(String value) {
        this.initiatedBy = value;
    }

    /**
     * Gets the value of the involves property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolves() {
        return involves;
    }

    /**
     * Sets the value of the involves property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolves(String value) {
        this.involves = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionType }
     *     
     */
    public BusinessInteractionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionType }
     *     
     */
    public void setType(BusinessInteractionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the interactionLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionLocationKey() {
        return interactionLocationKey;
    }

    /**
     * Sets the value of the interactionLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionLocationKey(String value) {
        this.interactionLocationKey = value;
    }

    /**
     * Gets the value of the characteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicValue() {
        return characteristicValue;
    }

    /**
     * Sets the value of the characteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicValue(String value) {
        this.characteristicValue = value;
    }

    /**
     * Gets the value of the referencesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencesId() {
        return referencesId;
    }

    /**
     * Sets the value of the referencesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencesId(String value) {
        this.referencesId = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTaken(String value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the involvesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvesName() {
        return involvesName;
    }

    /**
     * Sets the value of the involvesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvesName(String value) {
        this.involvesName = value;
    }

    /**
     * Gets the value of the compromisedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compromisedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompromisedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionItem }
     * 
     * 
     */
    public List<BusinessInteractionItem> getCompromisedOf() {
        if (compromisedOf == null) {
            compromisedOf = new ArrayList<BusinessInteractionItem>();
        }
        return this.compromisedOf;
    }

}
