<%-- 
    Document   : admin-product
    Created on : Aug 31, 2017, 8:28:07 AM
    Author     : ananda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Product
            <small>Form</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Product</a></li>
            <li class="active">Product Form</li>
        </ol>
    </section>




    <!-- Main content -->
    <section class="content">
        <div class="col">
            <!-- left column -->
            <div class="row-md-6">
                <!-- general form elements -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h2 class="box-title" >Fill Item</h2>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST" enctype="multipart/form-data">
                        <input type="hidden" name="product_id" value="${editproductval.get(0).product_id}">
                        <div class="box-body">

                            <div class="form-group">
                                <label> Product Name</label>
                                <input type="text" name="product_name" value="${editproductval.get(0).product_name}" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Name">
                            </div>
                            <div class="form-group">
                                <label> Product Price</label>
                                <input type="text" name="product_price" value="${editproductval.get(0).product_price}"  class="form-control" id="exampleInputEmail1" placeholder="Enter Product Price">
                            </div>    

                            <div class="form-group">
                                <label>Product Tags</label>
                                <select name="product_tag" class="form-control select2" multiple="multiple" data-placeholder="Type a new tag" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                    <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Food')}">
                                            selected</c:if>>
                                            Food</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('LifeStyle')}">
                                            selected</c:if>>
                                            LifeStyle</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Sports')}">selected</c:if>>
                                            Sports</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Electronics')}">selected</c:if>>
                                            Electronics</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Health')}">selected</c:if>>
                                            Health</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Accessories')}">selected</c:if>>
                                            Accessories</option>
                                        <option
                                        <c:if test="${editproductval.get(0).product_tag.contains('Computer and IT gadgets')}">selected</c:if>>
                                            Computer and IT gadgets</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label> Product Discount</label>
                                    <input type="text" value="${editproductval.get(0).product_discount}" name="product_discount" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Discount">
                            </div> 



                            <div class="form-group">
                                <label for="exampleInputFile">Upload Product Image</label>
                                <input type="file" value="${editproductval.get(0).product_image}" name="product_image" id="exampleInputFile">
                            </div>

                            <!--  <div class="checkbox">
                            <label>
                            <input type="checkbox"> Check me out
                            </label>
                            </div>-->
                        </div>
                        <!-- /.box-body -->

                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary"/>
                            <span class="glyphicon glyphicon-plus-sign"/>
                            Add
                        </div>
                    </form>
                </div>
                <!-- /.box -->
            </div>
        </div>
    </section>

    <!--                                
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Product
            <small>Table</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Product</a></li>
            <li class="active">Product Table</li>
        </ol>
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="">
            <!-- left column -->
            <div class="col">
                <!-- general form elements -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h2 class="box-title" >Item Display</h2>
                    </div>
                    <table id="example1" class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>Product ID</th>
                                <th>Product Name</th>
                                <th>Product Price</th>
                                <th>Product Tag</th>
                                <th>Product Discount</th>
                                <th>Product Image</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach items="${productvalues}" var="product">
                                <tr>
                                    <td>${product.product_id}</td>
                                    <td>${product.product_name}</td>
                                    <td>${product.product_price}</td>
                                    <td>${product.product_tag}</td>
                                    <td>${product.product_discount}</td>

                                    <td>
                                        <a href="${pageContext.request.contextPath}/product_image/${product.product_image}" target="_blank"/>
                                        <img height="30" width="30" src="${pageContext.request.contextPath}/product_image/${product.product_image}" alt="img"/></td> 
                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/product/edit/?product_id=${product.product_id}">
                                            <!--//not secure //injection-->
                                            <span class="glyphicon glyphicon-edit"></span>
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/admin/product/delete/?product_id=${product.product_id}">
                                            <span class="glyphicon glyphicon-remove"></span></td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>
</div>




<jsp:include page="admin-footer.jsp"/>

<script>
    //                $('#example1').DataTable({
    //                "paging": true,
    //                "lengthChange": false,
    //                "searching": true,
    //                "ordering": true,
    //                "info": true,
    //                "autoWidth": false
    //                });
    $('#example1').DataTable();
</script>