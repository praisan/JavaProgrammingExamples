<%-- 
    Document   : ProductListing
    Created on : Dec 27, 2017, 4:13:39 PM
    Author     : INT676
--%>

<%@page import="java.util.List"%>
<%@page import="sit.sitcom.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product lasting::</h1>
        <form action="ProductListing" method="post">
            Enter product description: <input type="text" name="description" />
            <input type="submit" value="Search" />           

        </form>
        <table>
            <th>Number</th>
            <th>Product ID</th>
            <th>Product Description</th>
            <th>Price</th>
            <c:forEach items="${products}" var="p" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${p.productId}</td>
                <td>${p.description}</td>
                <td>${p.price}</td>
                <td></td>
            </tr>
            </c:forEach>
                <!---%
                    List<Product> productList = (List) request.getAttribute("products");
                    for (Product product : productList) {
                %>
            <tr>
                <td><!---%=product.getProductId()%></td>
                <td><!---%=product.getDescription()%></td>
                <td><!---%=product.getPrice()%></td>
            </tr>   
            <!---%
                }
            %--->

        </table>

    </body>
</html>

