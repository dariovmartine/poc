
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourlyRecurrencePatternTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HourlyRecurrencePatternTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Interval"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HourlyRecurrencePatternTypeEnum")
@XmlEnum
public enum HourlyRecurrencePatternTypeEnum {

    @XmlEnumValue("Interval")
    INTERVAL("Interval");
    private final String value;

    HourlyRecurrencePatternTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HourlyRecurrencePatternTypeEnum fromValue(String v) {
        for (HourlyRecurrencePatternTypeEnum c: HourlyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
