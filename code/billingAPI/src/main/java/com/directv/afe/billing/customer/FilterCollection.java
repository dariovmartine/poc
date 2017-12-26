
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterItem" type="{http://directvla.com/schema/businessdomain/common/v1-0}Restriction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterCollection", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "filterItem"
})
public class FilterCollection {

    @XmlElement(name = "FilterItem", required = true)
    protected List<Restriction> filterItem;

    /**
     * Gets the value of the filterItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * 
     * 
     */
    public List<Restriction> getFilterItem() {
        if (filterItem == null) {
            filterItem = new ArrayList<Restriction>();
        }
        return this.filterItem;
    }

}
