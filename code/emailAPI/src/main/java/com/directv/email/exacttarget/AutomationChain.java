
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationChain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationChain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition">
 *       &lt;sequence>
 *         &lt;element name="AutomationToChainID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationChain", propOrder = {
    "automationToChainID"
})
public class AutomationChain
    extends InteractionDefinition
{

    @XmlElement(name = "AutomationToChainID")
    protected String automationToChainID;

    /**
     * Gets the value of the automationToChainID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationToChainID() {
        return automationToChainID;
    }

    /**
     * Sets the value of the automationToChainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationToChainID(String value) {
        this.automationToChainID = value;
    }

}
