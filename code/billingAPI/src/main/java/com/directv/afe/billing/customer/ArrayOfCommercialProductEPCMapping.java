
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCommercialProductEPCMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommercialProductEPCMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialProductEPCMapping" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CommercialProductEPCMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommercialProductEPCMapping", propOrder = {
    "commercialProductEPCMapping"
})
public class ArrayOfCommercialProductEPCMapping {

    @XmlElement(name = "CommercialProductEPCMapping", nillable = true)
    protected List<CommercialProductEPCMapping> commercialProductEPCMapping;

    /**
     * Gets the value of the commercialProductEPCMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialProductEPCMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialProductEPCMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialProductEPCMapping }
     * 
     * 
     */
    public List<CommercialProductEPCMapping> getCommercialProductEPCMapping() {
        if (commercialProductEPCMapping == null) {
            commercialProductEPCMapping = new ArrayList<CommercialProductEPCMapping>();
        }
        return this.commercialProductEPCMapping;
    }

}
