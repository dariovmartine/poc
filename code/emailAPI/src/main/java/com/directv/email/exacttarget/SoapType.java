
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoapType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xsd:string"/>
 *     &lt;enumeration value="xsd:boolean"/>
 *     &lt;enumeration value="xsd:double"/>
 *     &lt;enumeration value="xsd:dateTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoapType")
@XmlEnum
public enum SoapType {

    @XmlEnumValue("xsd:string")
    XSD_STRING("xsd:string"),
    @XmlEnumValue("xsd:boolean")
    XSD_BOOLEAN("xsd:boolean"),
    @XmlEnumValue("xsd:double")
    XSD_DOUBLE("xsd:double"),
    @XmlEnumValue("xsd:dateTime")
    XSD_DATE_TIME("xsd:dateTime");
    private final String value;

    SoapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapType fromValue(String v) {
        for (SoapType c: SoapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
