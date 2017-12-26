
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPROOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemDSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iso3code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionContext", namespace = "http://directvla.com/schema/context/common/v1-0", propOrder = {
    "countryID",
    "systemID",
    "systemURL",
    "userID",
    "userPROOF",
    "systemDSN",
    "systemVersion",
    "iso3Code"
})
public class ConnectionContext {

    protected String countryID;
    protected String systemID;
    protected String systemURL;
    protected String userID;
    protected String userPROOF;
    protected String systemDSN;
    protected String systemVersion;
    @XmlElement(name = "iso3code")
    protected String iso3Code;

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryID(String value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the systemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemURL() {
        return systemURL;
    }

    /**
     * Sets the value of the systemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemURL(String value) {
        this.systemURL = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userPROOF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPROOF() {
        return userPROOF;
    }

    /**
     * Sets the value of the userPROOF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPROOF(String value) {
        this.userPROOF = value;
    }

    /**
     * Gets the value of the systemDSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDSN() {
        return systemDSN;
    }

    /**
     * Sets the value of the systemDSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDSN(String value) {
        this.systemDSN = value;
    }

    /**
     * Gets the value of the systemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * Sets the value of the systemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemVersion(String value) {
        this.systemVersion = value;
    }

    /**
     * Gets the value of the iso3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso3Code() {
        return iso3Code;
    }

    /**
     * Sets the value of the iso3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso3Code(String value) {
        this.iso3Code = value;
    }

}
