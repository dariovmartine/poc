
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCommercialProductsByVersion" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCommercialProductsByVersion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCommercialProductsByVersion"
})
@XmlRootElement(name = "GetCommercialProductsByVersionRequest")
public class GetCommercialProductsByVersionRequest {

    @XmlElement(name = "GetCommercialProductsByVersion", required = true)
    protected GetCommercialProductsByVersion getCommercialProductsByVersion;

    /**
     * Gets the value of the getCommercialProductsByVersion property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommercialProductsByVersion }
     *     
     */
    public GetCommercialProductsByVersion getGetCommercialProductsByVersion() {
        return getCommercialProductsByVersion;
    }

    /**
     * Sets the value of the getCommercialProductsByVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommercialProductsByVersion }
     *     
     */
    public void setGetCommercialProductsByVersion(GetCommercialProductsByVersion value) {
        this.getCommercialProductsByVersion = value;
    }

}
