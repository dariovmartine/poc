
package com.directv.afe.billing.customer;

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
 *         &lt;element name="GetCommercialProductsByVersionResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCommercialProductsByVersionResult"/>
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
    "getCommercialProductsByVersionResult"
})
@XmlRootElement(name = "GetCommercialProductsByVersionResponse")
public class GetCommercialProductsByVersionResponse {

    @XmlElement(name = "GetCommercialProductsByVersionResult", required = true)
    protected GetCommercialProductsByVersionResult getCommercialProductsByVersionResult;

    /**
     * Gets the value of the getCommercialProductsByVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommercialProductsByVersionResult }
     *     
     */
    public GetCommercialProductsByVersionResult getGetCommercialProductsByVersionResult() {
        return getCommercialProductsByVersionResult;
    }

    /**
     * Sets the value of the getCommercialProductsByVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommercialProductsByVersionResult }
     *     
     */
    public void setGetCommercialProductsByVersionResult(GetCommercialProductsByVersionResult value) {
        this.getCommercialProductsByVersionResult = value;
    }

}
