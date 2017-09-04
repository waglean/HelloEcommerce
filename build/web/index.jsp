<%-- 
    Document   : index
    Created on : Aug 25, 2017, 9:41:31 AM
    Author     : ananda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! by html</h1>
        <h1> <% out.println("Hello world by scriplet, not good practice though."); %> </h1>
        <h1> ${el} </h1> <!-- expression language  -->
        <h1><c:out value="learning jstl by way of printing"/></h1><!-- jstl -->
        <h1><c:out value="${el}"/></h1>  <!-- unified expression language --> 
    </body>
</html>
