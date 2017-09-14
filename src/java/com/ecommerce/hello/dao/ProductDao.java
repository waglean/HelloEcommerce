package com.ecommerce.hello.dao;

import com.ecommerce.hello.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author ananda
 */
public class ProductDao {

    public static void insert(ProductModel cm) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "ananda");

        } catch (Exception e) {
            System.out.println(e);
        }

        String sql = "insert into product( product_id, product_name, product_price, product_tag, product_discount, product_image )values("+cm.getProduct_id()+",'" + cm.getProduct_name() + "',"+cm.getProduct_price()+",'"+cm.getProduct_tag()+"','"+cm.getProduct_discount()+"','"+cm.getProduct_image()+"')";
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     public static void update(ProductModel cm) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "ananda");

        } catch (Exception e) {
            System.out.println(e);
        }

        String sql = "update product set product_name='"+cm.getProduct_name()+"', product_price="+cm.getProduct_price()+", product_tag='"+cm.getProduct_tag()+"', product_discount='"+cm.getProduct_discount()+"', product_image='"+cm.getProduct_image()+"' where product_id="+cm.getProduct_id();
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public static ArrayList<ProductModel> select() {
        ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "ananda");

        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from product";
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new ProductModel(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("product_price"),rs.getString("product_tag"), rs.getString("product_discount"), rs.getString("product_image")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }
 public static ArrayList<ProductModel> selectById(int product_id) {
        ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "ananda");

        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from product where product_id="+product_id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
                al.add(new ProductModel(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("product_price"),rs.getString("product_tag"), rs.getString("product_discount"), rs.getString("product_image")));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }

public static void delete(int id){
   try{
            Class.forName("com.mysql.jdbc.Driver");
         
            
        }catch (Exception e){
            System.out.println(e);}
    
   Connection con=null;
   Statement st= null;

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","ananda");
       
        } catch (Exception e) {
            System.out.println(e);
        
}   
String sql="delete from product where product_id="+id;
try{
st= con.createStatement();
st.execute(sql);

}catch(Exception e){
 System.out.println(e);
}
}
}