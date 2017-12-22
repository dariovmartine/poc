
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.common.v1_0.CriteriaSpecification;


/**
 * <p>Java class for GetCustomerOrderedEventsByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerOrderedEventsByCriteria">
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
@XmlType(name = "GetCustomerOrderedEventsByCriteria", propOrder = {
    "criterias"
})
public class GetCustomerOrderedEventsByCriteria {

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
