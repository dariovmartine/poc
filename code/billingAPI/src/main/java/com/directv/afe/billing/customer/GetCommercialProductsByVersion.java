
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetCommercialProductsByVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommercialProductsByVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutenticationContext" type="{http://directvla.com/schema/context/common/v1-0}ConnectionContext"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SellFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SellTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCommercialProductsByVersion", propOrder = {
    "autenticationContext",
    "categoryId",
    "sellFrom",
    "sellTo"
})
public class GetCommercialProductsByVersion {

    @XmlElement(name = "AutenticationContext", required = true)
    protected ConnectionContext autenticationContext;
    @XmlElement(name = "CategoryId")
    protected int categoryId;
    @XmlElement(name = "SellFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellFrom;
    @XmlElement(name = "SellTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellTo;

    /**
     * Gets the value of the autenticationContext property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionContext }
     *     
     */
    public ConnectionContext getAutenticationContext() {
        return autenticationContext;
    }

    /**
     * Sets the value of the autenticationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionContext }
     *     
     */
    public void setAutenticationContext(ConnectionContext value) {
        this.autenticationContext = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the sellFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellFrom() {
        return sellFrom;
    }

    /**
     * Sets the value of the sellFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellFrom(XMLGregorianCalendar value) {
        this.sellFrom = value;
    }

    /**
     * Gets the value of the sellTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellTo() {
        return sellTo;
    }

    /**
     * Sets the value of the sellTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellTo(XMLGregorianCalendar value) {
        this.sellTo = value;
    }

}
