
package com.directvla.schema.businessdomain.product.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.directvla.schema.businessdomain.product.v1_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Product_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "Product");
    private final static QName _ProductType_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "ProductType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.directvla.schema.businessdomain.product.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductCollection }
     * 
     */
    public ProductCollection createProductCollection() {
        return new ProductCollection();
    }

    /**
     * Create an instance of {@link CustomerProductOfferCollection }
     * 
     */
    public CustomerProductOfferCollection createCustomerProductOfferCollection() {
        return new CustomerProductOfferCollection();
    }

    /**
     * Create an instance of {@link ProductCharacteristicValue }
     * 
     */
    public ProductCharacteristicValue createProductCharacteristicValue() {
        return new ProductCharacteristicValue();
    }

    /**
     * Create an instance of {@link ProductPriceCollection }
     * 
     */
    public ProductPriceCollection createProductPriceCollection() {
        return new ProductPriceCollection();
    }

    /**
     * Create an instance of {@link ProductStatus }
     * 
     */
    public ProductStatus createProductStatus() {
        return new ProductStatus();
    }

    /**
     * Create an instance of {@link ProductPrice }
     * 
     */
    public ProductPrice createProductPrice() {
        return new ProductPrice();
    }

    /**
     * Create an instance of {@link ProductCharacteristicValueCollection }
     * 
     */
    public ProductCharacteristicValueCollection createProductCharacteristicValueCollection() {
        return new ProductCharacteristicValueCollection();
    }

    /**
     * Create an instance of {@link ProductOffer }
     * 
     */
    public ProductOffer createProductOffer() {
        return new ProductOffer();
    }

    /**
     * Create an instance of {@link CustomerProductOffer }
     * 
     */
    public CustomerProductOffer createCustomerProductOffer() {
        return new CustomerProductOffer();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link ProductOfferCollection }
     * 
     */
    public ProductOfferCollection createProductOfferCollection() {
        return new ProductOfferCollection();
    }

    /**
     * Create an instance of {@link ProductSpecCharacteristic }
     * 
     */
    public ProductSpecCharacteristic createProductSpecCharacteristic() {
        return new ProductSpecCharacteristic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/product/v1-0", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/product/v1-0", name = "ProductType")
    public JAXBElement<Product> createProductType(Product value) {
        return new JAXBElement<Product>(_ProductType_QNAME, Product.class, null, value);
    }

}
