
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageAbility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageAbility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingProficiency" type="{http://directvla.com/schema/businessdomain/common/v1-0}Language" minOccurs="0"/>
 *         &lt;element name="writingProficiency" type="{http://directvla.com/schema/businessdomain/common/v1-0}Language" minOccurs="0"/>
 *         &lt;element name="speakingProficiency" type="{http://directvla.com/schema/businessdomain/common/v1-0}Language" minOccurs="0"/>
 *         &lt;element name="listeningProficiency" type="{http://directvla.com/schema/businessdomain/common/v1-0}Language" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageAbility", propOrder = {
    "readingProficiency",
    "writingProficiency",
    "speakingProficiency",
    "listeningProficiency"
})
public class LanguageAbility {

    protected Language readingProficiency;
    protected Language writingProficiency;
    protected Language speakingProficiency;
    protected Language listeningProficiency;

    /**
     * Gets the value of the readingProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getReadingProficiency() {
        return readingProficiency;
    }

    /**
     * Sets the value of the readingProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setReadingProficiency(Language value) {
        this.readingProficiency = value;
    }

    /**
     * Gets the value of the writingProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getWritingProficiency() {
        return writingProficiency;
    }

    /**
     * Sets the value of the writingProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setWritingProficiency(Language value) {
        this.writingProficiency = value;
    }

    /**
     * Gets the value of the speakingProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getSpeakingProficiency() {
        return speakingProficiency;
    }

    /**
     * Sets the value of the speakingProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setSpeakingProficiency(Language value) {
        this.speakingProficiency = value;
    }

    /**
     * Gets the value of the listeningProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getListeningProficiency() {
        return listeningProficiency;
    }

    /**
     * Sets the value of the listeningProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setListeningProficiency(Language value) {
        this.listeningProficiency = value;
    }

}
