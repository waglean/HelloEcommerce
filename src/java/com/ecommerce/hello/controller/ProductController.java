/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.controller;

import com.ecommerce.hello.dao.ProductDao;
import com.ecommerce.hello.model.ProductModel;
import com.ecommerce.hello.utilities.Tag;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ananda
 */
@WebServlet({"/admin/product/add"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String contextPath=request.getContextPath();
       if(request.getRequestURI().equals(contextPath+"/admin/product/add")){
           
           String name=request.getParameter("product_name");
           int price=Integer.parseInt(request.getParameter("product_price")); 
           String discount=request.getParameter("product_discount");
           //String tag=request.getParameter("product_tag");
//           
           String[] tempTag=request.getParameterValues("product_tag");
           String tag=Tag.convertTag(tempTag);
           
           
           //file upload garna baki xa
           //encapsulate the data
           ProductModel pm = new ProductModel();
           pm.setProduct_name(name);
           pm.setProduct_discount(discount);
           pm.setProduct_price(price);
           pm.setProduct_tag(tag);
           //send the object to dao
          ProductDao.insert(pm);
          response.sendRedirect(contextPath+"/admin/product");
       }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}