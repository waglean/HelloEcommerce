package com.ecommerce.hello.dao;

import com.ecommerce.hello.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        String sql = "insert into product( product_name )values('" + cm.getProduct_name() + "')";
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
                al.add(new ProductModel(rs.getString("product_name")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }

public static void delete(String name){
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
String sql="delete from product where product_name="+name;
try{
st= con.createStatement();
st.execute(sql);

}catch(Exception e){
 System.out.println(e);
}
}
}