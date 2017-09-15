/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.controller;

import com.ecommerce.hello.dao.ProductDao;
import com.ecommerce.hello.model.ProductModel;
import com.ecommerce.hello.utilities.Tag;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ananda
 */
@WebServlet({"/admin/product/add", "/admin/product/delete/", "/admin/product/edit/"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/admin/product/delete/")) {
            int id = Integer.parseInt(request.getParameter("product_id"));
            ProductDao.delete(id);
            response.sendRedirect(contextPath + "/admin/product");
        } else if (request.getRequestURI().equals(contextPath + "/admin/product/edit/")) {
            int product_id = Integer.parseInt(request.getParameter("product_id"));
            request.setAttribute("editproductval", ProductDao.selectById(product_id));
            //response.sendRedirect(contextPath+"/admin/product");
            RequestDispatcher rd = request.getRequestDispatcher("/admin-product.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/admin/product/add")) {
//          int id=Integer.parseInt(request.getParameter("product_id"));
            String saveLocation = request.getServletContext().getRealPath("/product_image");
            MultipartRequest mr = new MultipartRequest(request, saveLocation, 1000000, new DefaultFileRenamePolicy());
            String image= mr.getOriginalFileName("product_image");
            String name = mr.getParameter("product_name");
            int price = Integer.parseInt(mr.getParameter("product_price"));
            String discount = mr.getParameter("product_discount");
            //String image = request.getParameter("product_image");
            //MultipartRequest mr= new Multipart   

            String[] tempTag = mr.getParameterValues("product_tag");
            String tag = Tag.convertTag(tempTag);

            //file upload garna baki xa
            //encapsulate the data
            ProductModel pm = new ProductModel();
            //m.setProduct_id(id);
            pm.setProduct_name(name);
            pm.setProduct_discount(discount);
            pm.setProduct_price(price);
            pm.setProduct_tag(tag);
            pm.setProduct_image(image);
            int id = 0;
            try {
                id = Integer.parseInt(request.getParameter("product_id"));
                pm.setProduct_id(id);
            } catch (Exception e) {
            }
            if (id == 0) {
                //send the object to dao
                ProductDao.insert(pm);
            } else {
                ProductDao.update(pm);
            }
            response.sendRedirect(contextPath + "/admin/product");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
