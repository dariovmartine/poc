
package com.directv.email.computec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enviarDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enviarDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosConsulta" type="{http://co.com.computec.directvivr.ws/}datoConsultaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarDocumento", propOrder = {
    "datosConsulta"
})
public class EnviarDocumento {

    protected DatoConsultaDTO datosConsulta;

    /**
     * Gets the value of the datosConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link DatoConsultaDTO }
     *     
     */
    public DatoConsultaDTO getDatosConsulta() {
        return datosConsulta;
    }

    /**
     * Sets the value of the datosConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatoConsultaDTO }
     *     
     */
    public void setDatosConsulta(DatoConsultaDTO value) {
        this.datosConsulta = value;
    }

}
