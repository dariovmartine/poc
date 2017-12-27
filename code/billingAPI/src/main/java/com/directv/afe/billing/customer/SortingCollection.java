
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortingItem" type="{http://directvla.com/schema/businessdomain/common/v1-0}Sorting" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortingCollection", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "sortingItem"
})
public class SortingCollection {

    @XmlElement(name = "SortingItem", required = true)
    protected List<Sorting> sortingItem;

    /**
     * Gets the value of the sortingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sorting }
     * 
     * 
     */
    public List<Sorting> getSortingItem() {
        if (sortingItem == null) {
            sortingItem = new ArrayList<Sorting>();
        }
        return this.sortingItem;
    }

}