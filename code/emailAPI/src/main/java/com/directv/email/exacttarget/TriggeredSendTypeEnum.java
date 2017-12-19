
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggeredSendTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Continuous"/>
 *     &lt;enumeration value="Batched"/>
 *     &lt;enumeration value="Scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggeredSendTypeEnum")
@XmlEnum
public enum TriggeredSendTypeEnum {

    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous"),
    @XmlEnumValue("Batched")
    BATCHED("Batched"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled");
    private final String value;

    TriggeredSendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggeredSendTypeEnum fromValue(String v) {
        for (TriggeredSendTypeEnum c: TriggeredSendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
