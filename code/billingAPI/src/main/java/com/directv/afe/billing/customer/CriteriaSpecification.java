
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filters" type="{http://directvla.com/schema/businessdomain/common/v1-0}FilterCollection"/>
 *         &lt;element name="Sorting" type="{http://directvla.com/schema/businessdomain/common/v1-0}SortingCollection" minOccurs="0"/>
 *         &lt;element name="Paging" type="{http://directvla.com/schema/businessdomain/common/v1-0}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaSpecification", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "filters",
    "sorting",
    "paging"
})
public class CriteriaSpecification {

    @XmlElement(name = "Filters", required = true)
    protected FilterCollection filters;
    @XmlElement(name = "Sorting")
    protected SortingCollection sorting;
    @XmlElement(name = "Paging")
    protected Paging paging;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCollection }
     *     
     */
    public FilterCollection getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCollection }
     *     
     */
    public void setFilters(FilterCollection value) {
        this.filters = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link SortingCollection }
     *     
     */
    public SortingCollection getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingCollection }
     *     
     */
    public void setSorting(SortingCollection value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
