
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCommercialProductInvoiceLineText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommercialProductInvoiceLineText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialProductInvoiceLineText" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CommercialProductInvoiceLineText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommercialProductInvoiceLineText", propOrder = {
    "commercialProductInvoiceLineText"
})
public class ArrayOfCommercialProductInvoiceLineText {

    @XmlElement(name = "CommercialProductInvoiceLineText", nillable = true)
    protected List<CommercialProductInvoiceLineText> commercialProductInvoiceLineText;

    /**
     * Gets the value of the commercialProductInvoiceLineText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialProductInvoiceLineText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialProductInvoiceLineText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialProductInvoiceLineText }
     * 
     * 
     */
    public List<CommercialProductInvoiceLineText> getCommercialProductInvoiceLineText() {
        if (commercialProductInvoiceLineText == null) {
            commercialProductInvoiceLineText = new ArrayList<CommercialProductInvoiceLineText>();
        }
        return this.commercialProductInvoiceLineText;
    }

}
