
package com.directvla.schema.util.commondatatypes.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestID" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestIDType"/>
 *         &lt;element name="sourceID" type="{http://directvla.com/schema/util/commondatatypes/v1-0}SourceIDType"/>
 *         &lt;element name="systemID" type="{http://directvla.com/schema/util/commondatatypes/v1-0}SystemIDType" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://directvla.com/schema/util/commondatatypes/v1-0}UserIDType" minOccurs="0"/>
 *         &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="debug" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userProof" type="{http://directvla.com/schema/util/commondatatypes/v1-0}UserProofType" minOccurs="0"/>
 *         &lt;element name="userApp" type="{http://directvla.com/schema/util/commondatatypes/v1-0}UserAppType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMetadataType", propOrder = {
    "requestID",
    "sourceID",
    "systemID",
    "userID",
    "validate",
    "debug",
    "userProof",
    "userApp"
})
public class RequestMetadataType {

    @XmlElement(required = true)
    protected String requestID;
    @XmlElement(required = true)
    protected String sourceID;
    protected String systemID;
    protected String userID;
    protected Boolean validate;
    protected Boolean debug;
    protected String userProof;
    protected String userApp;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
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
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidate(Boolean value) {
        this.validate = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebug(Boolean value) {
        this.debug = value;
    }

    /**
     * Gets the value of the userProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserProof() {
        return userProof;
    }

    /**
     * Sets the value of the userProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserProof(String value) {
        this.userProof = value;
    }

    /**
     * Gets the value of the userApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserApp() {
        return userApp;
    }

    /**
     * Sets the value of the userApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserApp(String value) {
        this.userApp = value;
    }

}
