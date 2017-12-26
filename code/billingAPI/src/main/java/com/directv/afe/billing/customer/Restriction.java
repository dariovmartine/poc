
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Restriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restriction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Criteria">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction", namespace = "http://directvla.com/schema/businessdomain/common/v1-0")
@XmlSeeAlso({
    Equal.class,
    GreaterThan.class,
    NotEqual.class,
    In.class,
    GreaterThanOrEqualTo.class,
    LessThan.class,
    IsNotNull.class,
    Like.class,
    Between.class,
    LessThanOrEqualTo.class,
    IsNull.class
})
public class Restriction
    extends Criteria
{


}
