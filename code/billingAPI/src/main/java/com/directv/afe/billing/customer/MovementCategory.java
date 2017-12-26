
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Value1"/>
 *     &lt;enumeration value="Value2"/>
 *     &lt;enumeration value="Value3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementCategory", namespace = "http://directvla.com/schema/businessdomain/common/v1-0")
@XmlEnum
public enum MovementCategory {

    @XmlEnumValue("Value1")
    VALUE_1("Value1"),
    @XmlEnumValue("Value2")
    VALUE_2("Value2"),
    @XmlEnumValue("Value3")
    VALUE_3("Value3");
    private final String value;

    MovementCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MovementCategory fromValue(String v) {
        for (MovementCategory c: MovementCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
