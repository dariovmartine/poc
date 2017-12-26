
package com.directv.afe.billing.invoice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="InvoiceIDNumber" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}InvoiceIDNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlagExists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchInvoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "invoiceIDNumber",
    "flagExists",
    "searchInvoiceID",
    "searchInvoiceNumber"
})
@XmlRootElement(name = "InvoiceNumberHistoryCollection", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class InvoiceNumberHistoryCollection {

    @XmlElement(name = "InvoiceIDNumber", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
    protected List<InvoiceIDNumberType> invoiceIDNumber;
    @XmlElement(name = "FlagExists", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
    protected String flagExists;
    @XmlElement(name = "SearchInvoiceID", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
    protected String searchInvoiceID;
    @XmlElement(name = "SearchInvoiceNumber", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
    protected String searchInvoiceNumber;

    /**
     * Gets the value of the invoiceIDNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceIDNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceIDNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceIDNumberType }
     * 
     * 
     */
    public List<InvoiceIDNumberType> getInvoiceIDNumber() {
        if (invoiceIDNumber == null) {
            invoiceIDNumber = new ArrayList<InvoiceIDNumberType>();
        }
        return this.invoiceIDNumber;
    }

    /**
     * Gets the value of the flagExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagExists() {
        return flagExists;
    }

    /**
     * Sets the value of the flagExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagExists(String value) {
        this.flagExists = value;
    }

    /**
     * Gets the value of the searchInvoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchInvoiceID() {
        return searchInvoiceID;
    }

    /**
     * Sets the value of the searchInvoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchInvoiceID(String value) {
        this.searchInvoiceID = value;
    }

    /**
     * Gets the value of the searchInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchInvoiceNumber() {
        return searchInvoiceNumber;
    }

    /**
     * Sets the value of the searchInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchInvoiceNumber(String value) {
        this.searchInvoiceNumber = value;
    }

}
