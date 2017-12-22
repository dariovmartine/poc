
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomersByInternetUserId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomersByInternetUserId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternetUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomersByInternetUserId", propOrder = {
    "internetUserId"
})
public class GetCustomersByInternetUserId {

    @XmlElement(name = "InternetUserId", required = true)
    protected String internetUserId;

    /**
     * Gets the value of the internetUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetUserId() {
        return internetUserId;
    }

    /**
     * Sets the value of the internetUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetUserId(String value) {
        this.internetUserId = value;
    }

}
