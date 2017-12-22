
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReauthorizeCustomerResourcesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReauthorizeCustomerResourcesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReauthorizeCustomerResourcesKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReauthorizeCustomerResourcesResult", propOrder = {
    "reauthorizeCustomerResourcesKey"
})
public class ReauthorizeCustomerResourcesResult {

    @XmlElement(name = "ReauthorizeCustomerResourcesKey")
    protected String reauthorizeCustomerResourcesKey;

    /**
     * Gets the value of the reauthorizeCustomerResourcesKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReauthorizeCustomerResourcesKey() {
        return reauthorizeCustomerResourcesKey;
    }

    /**
     * Sets the value of the reauthorizeCustomerResourcesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReauthorizeCustomerResourcesKey(String value) {
        this.reauthorizeCustomerResourcesKey = value;
    }

}
