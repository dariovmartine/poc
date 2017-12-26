
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerHistoriesByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerHistoriesByCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criterias" type="{http://directvla.com/schema/businessdomain/common/v1-0}CriteriaSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerHistoriesByCriteria", propOrder = {
    "criterias"
})
public class GetCustomerHistoriesByCriteria {

    @XmlElement(name = "Criterias", required = true)
    protected CriteriaSpecification criterias;

    /**
     * Gets the value of the criterias property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaSpecification }
     *     
     */
    public CriteriaSpecification getCriterias() {
        return criterias;
    }

    /**
     * Sets the value of the criterias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaSpecification }
     *     
     */
    public void setCriterias(CriteriaSpecification value) {
        this.criterias = value;
    }

}
