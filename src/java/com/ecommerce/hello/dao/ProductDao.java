
package com.ecommerce.hello.dao;


import java.sql.Connection;
import java.sql.DriverManager;
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
    public static void insert(ProductModel cm ) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("");
            
        }catch (Exception e){
            System.out.println(e);}
    
   Connection con=null;
   Statement st= null;

        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","");
       
        } catch (Exception e) {
            System.out.println(e);
        }
        
String sql="insert into product(product_id, product_name,rating )values('"+cm.getProduct_id()+"','"+cm.getProduct_name() +"','"+cm.getRating()+"')";
try{
    st=con.createStatement();
    st.execute(sql);
}catch (Exception e){
            System.out.println(e);
        }
}
}