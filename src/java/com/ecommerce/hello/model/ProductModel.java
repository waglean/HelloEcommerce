package com.ecommerce.hello.model;

import java.io.Serializable;

/**
 *
 * @author ananda
 */
public class ProductModel implements Serializable {

    private static long serialVersionUID = 1L;
    private int product_id;
    private String product_name;
    // private String product_rating;
    private String product_tag;
    private String product_discount;
    // private String product_image;
    private int product_price;

    public ProductModel() {

    }

    public ProductModel(int product_id, String product_name, int product_price, String product_tag, String product_discount) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_tag = product_tag;
        this.product_discount=product_discount;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(String product_discount) {
        this.product_discount = product_discount;
    }
    public String getProduct_tag() {
        return product_tag;
    }

    public void setProduct_tag(String product_tag) {
        this.product_tag = product_tag;
    }
//

    public int getProduct_price() {
        return product_price;
    }
//

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
//
//    public String getProduct_image() {
//        return product_image;
//    }
//
//    public void setProduct_image(String product_image) {
//        this.product_image = product_image;
//    }

    

}
