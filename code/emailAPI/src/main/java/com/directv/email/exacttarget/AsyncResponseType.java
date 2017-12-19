
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsyncResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="HTTPPost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AsyncResponseType")
@XmlEnum
public enum AsyncResponseType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("email")
    EMAIL("email"),
    FTP("FTP"),
    @XmlEnumValue("HTTPPost")
    HTTP_POST("HTTPPost");
    private final String value;

    AsyncResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsyncResponseType fromValue(String v) {
        for (AsyncResponseType c: AsyncResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
