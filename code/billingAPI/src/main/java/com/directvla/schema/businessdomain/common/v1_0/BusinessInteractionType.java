
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteractionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Category">
 *       &lt;sequence>
 *         &lt;element name="ParentType" type="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteractionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteractionType", propOrder = {
    "parentType"
})
public class BusinessInteractionType
    extends Category
{

    @XmlElement(name = "ParentType")
    protected BusinessInteractionType parentType;

    /**
     * Gets the value of the parentType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionType }
     *     
     */
    public BusinessInteractionType getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionType }
     *     
     */
    public void setParentType(BusinessInteractionType value) {
        this.parentType = value;
    }

}
