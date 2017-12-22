
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductCombinationScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductCombinationScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCombinationScope" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ProductCombinationScope" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductCombinationScope", propOrder = {
    "productCombinationScope"
})
public class ArrayOfProductCombinationScope {

    @XmlElement(name = "ProductCombinationScope", nillable = true)
    protected List<ProductCombinationScope> productCombinationScope;

    /**
     * Gets the value of the productCombinationScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCombinationScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCombinationScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCombinationScope }
     * 
     * 
     */
    public List<ProductCombinationScope> getProductCombinationScope() {
        if (productCombinationScope == null) {
            productCombinationScope = new ArrayList<ProductCombinationScope>();
        }
        return this.productCombinationScope;
    }

}
