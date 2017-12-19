
package com.directv.email.exacttarget;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDefinitionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttributeSet" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeSet" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactEvent", propOrder = {
    "contactID",
    "contactKey",
    "eventDefinitionKey",
    "data"
})
public class ContactEvent
    extends APIObject
{

    @XmlElement(name = "ContactID")
    protected Long contactID;
    @XmlElement(name = "ContactKey")
    protected String contactKey;
    @XmlElement(name = "EventDefinitionKey")
    protected String eventDefinitionKey;
    @XmlElement(name = "Data")
    protected ContactEvent.Data data;

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactID(Long value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the contactKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactKey() {
        return contactKey;
    }

    /**
     * Sets the value of the contactKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactKey(String value) {
        this.contactKey = value;
    }

    /**
     * Gets the value of the eventDefinitionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDefinitionKey() {
        return eventDefinitionKey;
    }

    /**
     * Sets the value of the eventDefinitionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDefinitionKey(String value) {
        this.eventDefinitionKey = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ContactEvent.Data }
     *     
     */
    public ContactEvent.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactEvent.Data }
     *     
     */
    public void setData(ContactEvent.Data value) {
        this.data = value;
    }


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
     *         &lt;element name="AttributeSet" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeSet" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeSet"
    })
    public static class Data {

        @XmlElement(name = "AttributeSet")
        protected List<AttributeSet> attributeSet;

        /**
         * Gets the value of the attributeSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeSet }
         * 
         * 
         */
        public List<AttributeSet> getAttributeSet() {
            if (attributeSet == null) {
                attributeSet = new ArrayList<AttributeSet>();
            }
            return this.attributeSet;
        }

    }

}
