<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<title>Product selected</title>

<style>

tr:hover {background-color: #f5f5f5}

tr {
    height: 50px;
}

table {
   width: 98%;
   
   text-align: center;
   border-collapse: collapse;
   
}
th, td {
    padding: 15px;
    text-align: left;
    font-family: verdana;
    font-size: 20px;
}
</style>

</head>
<body>

<c:set var="imageFolder" value="Resources/Images/"/>

<table>
<tr>

<td>
   <img alt="${selectedProduct.name}"
   src="${imageFolder}${selectedProduct.id}.jpg" width="500" height="560">
   </td>
   <td>
   <ul> Description 
   <c:if test="${empty loggedInUser || !empty loggedInAdmin}">
<li>You first need to Login as a Valid User in order to buy this product.</li>
</c:if>
<li>This product is very useful</li>
<li>A Description booklet will be provided in order to how to use this equipment, at the time of delivery</li>
<li>This product is the best available product in the market
</td>
   
   
   
   
   </tr>
   
   <tr>
   <td>Price : ${selectedProduct.price}</td><br>
   
   <td><a class="col-xs-offset-5 btn btn-lg btn-info"
   href="cart_checkout">Buy Now</a></td>
   
 
   
   </tr>
   <tr>
   <td>Name : ${selectedProduct.name}</td><br>
   <c:if test="${!empty loggedInUser && empty loggedInAdmin}">
   <td><a 
         class="icon-shopping-cart" href="<c:url value='/cart_add?id=${selectedProduct.id}'/>"> Add to cart</a>
         </td>
          
         
         </c:if>
         </tr>
</table>





</body>
</html>