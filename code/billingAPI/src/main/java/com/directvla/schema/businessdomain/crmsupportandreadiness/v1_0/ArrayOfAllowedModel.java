
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAllowedModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAllowedModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedModel" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AllowedModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAllowedModel", propOrder = {
    "allowedModel"
})
public class ArrayOfAllowedModel {

    @XmlElement(name = "AllowedModel", nillable = true)
    protected List<AllowedModel> allowedModel;

    /**
     * Gets the value of the allowedModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedModel }
     * 
     * 
     */
    public List<AllowedModel> getAllowedModel() {
        if (allowedModel == null) {
            allowedModel = new ArrayList<AllowedModel>();
        }
        return this.allowedModel;
    }

}
