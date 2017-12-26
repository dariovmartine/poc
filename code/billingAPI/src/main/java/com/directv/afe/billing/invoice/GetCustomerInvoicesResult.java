
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerInvoicesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerInvoicesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceCollection" type="{http://directvla.com/schema/businessdomain/customer/v1-0}InvoiceCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerInvoicesResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "invoiceCollection"
})
public class GetCustomerInvoicesResult {

    @XmlElement(name = "InvoiceCollection", required = true)
    protected InvoiceCollection invoiceCollection;

    /**
     * Gets the value of the invoiceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCollection }
     *     
     */
    public InvoiceCollection getInvoiceCollection() {
        return invoiceCollection;
    }

    /**
     * Sets the value of the invoiceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCollection }
     *     
     */
    public void setInvoiceCollection(InvoiceCollection value) {
        this.invoiceCollection = value;
    }

}
