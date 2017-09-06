/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.dao;

import java.io.Serializable;

/**
 *
 * @author ananda
 */
public class ProductModel implements Serializable {
    private static long serialVersionUID=1L;
    private int product_id;
    private String product_name;
    private String rating;

    public ProductModel() {
    }

    public ProductModel(int product_id, String product_name, String rating) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.rating = rating;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
}
