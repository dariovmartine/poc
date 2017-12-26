
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendCommandResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendCommandResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendCommandKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendCommandResult", propOrder = {
    "sendCommandKey"
})
public class SendCommandResult {

    protected String sendCommandKey;

    /**
     * Gets the value of the sendCommandKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCommandKey() {
        return sendCommandKey;
    }

    /**
     * Sets the value of the sendCommandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCommandKey(String value) {
        this.sendCommandKey = value;
    }

}
