
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Availability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Availability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AlwaysAvailable"/>
 *     &lt;enumeration value="DependentUponDistributorSettings"/>
 *     &lt;enumeration value="DependentUponDistributorAndSAL"/>
 *     &lt;enumeration value="DependentUponSAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Availability")
@XmlEnum
public enum Availability {

    @XmlEnumValue("AlwaysAvailable")
    ALWAYS_AVAILABLE("AlwaysAvailable"),
    @XmlEnumValue("DependentUponDistributorSettings")
    DEPENDENT_UPON_DISTRIBUTOR_SETTINGS("DependentUponDistributorSettings"),
    @XmlEnumValue("DependentUponDistributorAndSAL")
    DEPENDENT_UPON_DISTRIBUTOR_AND_SAL("DependentUponDistributorAndSAL"),
    @XmlEnumValue("DependentUponSAL")
    DEPENDENT_UPON_SAL("DependentUponSAL");
    private final String value;

    Availability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Availability fromValue(String v) {
        for (Availability c: Availability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
