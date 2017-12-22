
package com.directvla.schema.businessdomain.customer.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.Category;


/**
 * <p>Java class for CustomerNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="CompletionStage" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByUserKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActionUserKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerNote", propOrder = {
    "customerKey",
    "id",
    "body",
    "category",
    "completionStage",
    "createDate",
    "createdByUserKey",
    "actionUserKey",
    "extended",
    "createdByUserName",
    "actionUserName"
})
public class CustomerNote {

    @XmlElement(name = "CustomerKey")
    protected Integer customerKey;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "Category")
    protected Category category;
    @XmlElement(name = "CompletionStage")
    protected Category completionStage;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CreatedByUserKey")
    protected Integer createdByUserKey;
    @XmlElement(name = "ActionUserKey")
    protected Integer actionUserKey;
    @XmlElement(name = "Extended")
    protected String extended;
    @XmlElement(name = "CreatedByUserName")
    protected String createdByUserName;
    @XmlElement(name = "ActionUserName")
    protected String actionUserName;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerKey(Integer value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the completionStage property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCompletionStage() {
        return completionStage;
    }

    /**
     * Sets the value of the completionStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCompletionStage(Category value) {
        this.completionStage = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createdByUserKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedByUserKey() {
        return createdByUserKey;
    }

    /**
     * Sets the value of the createdByUserKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedByUserKey(Integer value) {
        this.createdByUserKey = value;
    }

    /**
     * Gets the value of the actionUserKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActionUserKey() {
        return actionUserKey;
    }

    /**
     * Sets the value of the actionUserKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActionUserKey(Integer value) {
        this.actionUserKey = value;
    }

    /**
     * Gets the value of the extended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtended(String value) {
        this.extended = value;
    }

    /**
     * Gets the value of the createdByUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUserName() {
        return createdByUserName;
    }

    /**
     * Sets the value of the createdByUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUserName(String value) {
        this.createdByUserName = value;
    }

    /**
     * Gets the value of the actionUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUserName() {
        return actionUserName;
    }

    /**
     * Sets the value of the actionUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUserName(String value) {
        this.actionUserName = value;
    }

}
