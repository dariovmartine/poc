
package com.directv.afe.billing.invoice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerCodesCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerCodesCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DealerCodeItem" type="{http://directvla.com/schema/businessdomain/common/v1-0}DealerCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerCodesCollection", propOrder = {
    "dealerCodeItem"
})
public class DealerCodesCollection {

    @XmlElement(name = "DealerCodeItem", nillable = true)
    protected List<DealerCode> dealerCodeItem;

    /**
     * Gets the value of the dealerCodeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealerCodeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealerCodeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealerCode }
     * 
     * 
     */
    public List<DealerCode> getDealerCodeItem() {
        if (dealerCodeItem == null) {
            dealerCodeItem = new ArrayList<DealerCode>();
        }
        return this.dealerCodeItem;
    }

}