
package com.directv.email.computec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datoConsultaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datoConsultaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAbonado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datoConsultaDTO", propOrder = {
    "email",
    "ibs",
    "nombreAbonado",
    "numFactura",
    "plantilla"
})
public class DatoConsultaDTO {

    protected String email;
    protected String ibs;
    protected String nombreAbonado;
    protected String numFactura;
    protected String plantilla;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ibs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbs() {
        return ibs;
    }

    /**
     * Sets the value of the ibs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbs(String value) {
        this.ibs = value;
    }

    /**
     * Gets the value of the nombreAbonado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAbonado() {
        return nombreAbonado;
    }

    /**
     * Sets the value of the nombreAbonado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAbonado(String value) {
        this.nombreAbonado = value;
    }

    /**
     * Gets the value of the numFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * Sets the value of the numFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFactura(String value) {
        this.numFactura = value;
    }

    /**
     * Gets the value of the plantilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantilla() {
        return plantilla;
    }

    /**
     * Sets the value of the plantilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantilla(String value) {
        this.plantilla = value;
    }

}
