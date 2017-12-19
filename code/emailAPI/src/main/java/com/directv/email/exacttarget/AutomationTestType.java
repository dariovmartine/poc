
package com.directv.email.exacttarget;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationTestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomationTestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="UnplannedOutage"/>
 *     &lt;enumeration value="InMaintenance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutomationTestType")
@XmlEnum
public enum AutomationTestType {

    OK("OK"),
    @XmlEnumValue("UnplannedOutage")
    UNPLANNED_OUTAGE("UnplannedOutage"),
    @XmlEnumValue("InMaintenance")
    IN_MAINTENANCE("InMaintenance");
    private final String value;

    AutomationTestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomationTestType fromValue(String v) {
        for (AutomationTestType c: AutomationTestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
