
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dialectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alphabetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Language", propOrder = {
    "dialectName",
    "alphabetName"
})
public class Language {

    protected String dialectName;
    protected String alphabetName;

    /**
     * Gets the value of the dialectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialectName() {
        return dialectName;
    }

    /**
     * Sets the value of the dialectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialectName(String value) {
        this.dialectName = value;
    }

    /**
     * Gets the value of the alphabetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphabetName() {
        return alphabetName;
    }

    /**
     * Sets the value of the alphabetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphabetName(String value) {
        this.alphabetName = value;
    }

}
