
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/customer/v1-0}FinancialTransaction">
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
@XmlType(name = "ChargeTransaction", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0")
public class ChargeTransaction
    extends FinancialTransaction
{


}
