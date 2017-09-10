package com.ecommerce.hello.controller;

import com.ecommerce.hello.dao.ProductDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/admin-dashboard","/admin/product"}) 
public class AdminController extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String contextPath=request.getContextPath();


        if(request.getRequestURI().equals(contextPath+"/admin-dashboard")){
            
            RequestDispatcher rd = request.getRequestDispatcher("admin-dashboard.jsp");

            rd.forward(request,response);

        }
        
        else if(request.getRequestURI().equals(contextPath+"/admin/product")){//two url
            request.setAttribute("productvalues", ProductDao.select());
            
            RequestDispatcher rd = request.getRequestDispatcher("/admin-product.jsp");//if there is two url then add slash

            rd.forward(request,response);

        }

 
                      

             

    }



    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        

    }

}