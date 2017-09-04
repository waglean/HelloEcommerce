
package com.ecommerce.hello.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet({"/index","/personal-info"})                 //ctrl+shift+I import

public class IndexController extends HttpServlet {
    //get: all the requests are get request
    //post:after we spectify something as post, only then post request is sent

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String contextPath=request.getContextPath();

        String ipAddress=request.getRemoteAddr();

        //String uri = request.getRequestURI();

       

        //System.out.println(contextPath);

        //System.out.println(ipAddress);

        //System.out.println(uri);

        

        if(request.getRequestURI().equals(contextPath+"/index")){
            request.setAttribute("el","we are practing expression language");
            //el=we are practing expression language...
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

            rd.forward(request,response);

        }

        

        if(request.getRequestURI().equals(contextPath+"/personal-info")){

            RequestDispatcher rd = request.getRequestDispatcher("personal-info.jsp");

            rd.forward(request,response);

        }

                      

             

    }



    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        

    }





    @Override

    public String getServletInfo() {

        return "Short description";

    }// </editor-fold>



}