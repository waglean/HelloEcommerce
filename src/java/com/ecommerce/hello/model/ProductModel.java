
package com.ecommerce.hello.model;

import java.io.Serializable;

/**
 *
 * @author ananda
 */

public class ProductModel implements Serializable {
    private static long serialVersionUID=1L;
    //private int product_id;
    private String product_name;
   // private String product_rating;
   // private String product_tag;
   // private int product_price;
   // private String product_image;

    public ProductModel() {
        
    }

    public ProductModel( String product_name) {
//        this.product_id = product_id;
          this.product_name = product_name;
//        this.product_rating = product_rating;
//        this.product_tag = product_tag;
//        this.product_price = product_price;
//        this.product_image = product_image;
    }

//    public int getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(int product_id) {
//        this.product_id = product_id;
//    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

//    public String getProduct_rating() {
//        return product_rating;
//    }
//
//    public void setProduct_rating(String product_rating) {
//        this.product_rating = product_rating;
//    }
//
//    public String getProduct_tag() {
//        return product_tag;
//    }
//
//    public void setProduct_tag(String product_tag) {
//        this.product_tag = product_tag;
//    }
//
//    public int getProduct_price() {
//        return product_price;
//    }
//
//    public void setProduct_price(int product_price) {
//        this.product_price = product_price;
//    }
//
//    public String getProduct_image() {
//        return product_image;
//    }
//
//    public void setProduct_image(String product_image) {
//        this.product_image = product_image;
//    }
    
    
}