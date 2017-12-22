
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.product.v1_0.Product;


/**
 * <p>Java class for GetCommandStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommandStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductInvolvement" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product"/>
 *         &lt;element name="CommandId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCommandStatus", propOrder = {
    "productInvolvement",
    "commandId"
})
public class GetCommandStatus {

    @XmlElement(name = "ProductInvolvement", required = true)
    protected Product productInvolvement;
    @XmlElement(name = "CommandId")
    protected int commandId;

    /**
     * Gets the value of the productInvolvement property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductInvolvement() {
        return productInvolvement;
    }

    /**
     * Sets the value of the productInvolvement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductInvolvement(Product value) {
        this.productInvolvement = value;
    }

    /**
     * Gets the value of the commandId property.
     * 
     */
    public int getCommandId() {
        return commandId;
    }

    /**
     * Sets the value of the commandId property.
     * 
     */
    public void setCommandId(int value) {
        this.commandId = value;
    }

}
