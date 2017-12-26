
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementGeoRegionFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntitlementGeoRegionFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Include"/>
 *     &lt;enumeration value="Exclude"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntitlementGeoRegionFilterType")
@XmlEnum
public enum EntitlementGeoRegionFilterType {

    @XmlEnumValue("Include")
    INCLUDE("Include"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude");
    private final String value;

    EntitlementGeoRegionFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntitlementGeoRegionFilterType fromValue(String v) {
        for (EntitlementGeoRegionFilterType c: EntitlementGeoRegionFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
