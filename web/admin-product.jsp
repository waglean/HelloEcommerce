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
            <small>Product tables</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Product</a></li>
            <li class="active">Product tables</li>
        </ol>
    </section>




    <!-- Main content -->
    <section class="content">
        <div class="row">
            <!-- left column -->
            <div class="col-md-6">
                <!-- general form elements -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">ITEMS</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST">
                        <div class="box-body">

                            <div class="form-group">
                                <label> Product Name</label>
                                <input type="text" name="product_name" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Name">
                            </div>
                            <div class="form-group">
                                <label> Product Price</label>
                                <input type="text" name="product_price" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Price">
                            </div>    

                            <div class="form-group">
                <label>Product Tags</label>
                <select name="product_tag" class="form-control select2" multiple="multiple" data-placeholder="Type a new tag" style="width: 100%;" tabindex="-1" aria-hidden="true">
                  <option>Food</option>
                  <option>LifeStyle</option>
                  <option>Sports</option>
                  <option>Electronics</option>
                  <option>Health</option>
                  <option>Accessories</option>
                  <option>Computer and IT gadgets</option>
                </select>
                  </div>




                            <!--  <div class="checkbox">
                            <label>
                            <input type="checkbox"> Check me out
                            </label>
                            </div>-->
                        </div>
                        <!-- /.box-body -->

                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form>
                </div>
                <!-- /.box -->
            </div>
        </div>
    </section>


    <div class="box">
        <div class="box-header">
            <h3 class="box-title">Product Table</h3>
        </div>
        <!-- /.box-header -->
        <div class="box-body">
            <table id="example1" class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Name</th>
                        <th>Product Price</th>
                        <th>Product Tag</th>

                    </tr>
                </thead>
                <tbody>

                    <c:forEach items="${productvalues}" var="product">
                        <tr>
                            <td>${product.product_id}</td>
                            <td>${product.product_name}</td>
                            <td>${product.product_price}</td>
                            <td>${product.product_tag}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
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