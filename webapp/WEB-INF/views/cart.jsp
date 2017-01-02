<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<title>Cart</title>

<style>

tr:hover {background-color: #f5f5f5}

tr {
    height: 50px;
}

table {
   width: 98%;
   border: 1px solid black;
   text-align: center;
   border-collapse: collapse;
   
}
th, td {
    padding: 15px;
    text-align: left;
    border-bottom: 1px solid black;
    border-right: 1px solid black;
    font-family: verdana;
    font-size: 20px;
}
.btn {
    padding: 14px 24px;
    border: 0 none;
    font-weight: 700;
    letter-spacing: 1px;
    text-transform: uppercase;
    font-size: 24px;
    margin: 1em 0 0.5em 0;
 
}
</style>
</head>
<body>

<h1><i>CART PRODUCTS</i></h1>
<table>
  <tr>
  
  <th align = "left" width ="80">Cart ID</th>
  <th align ="left" width ="120">Product Name</th>
   <th align ="left" width="120">Quantity</th>
  <th align ="left" width ="80">Price</th>
  <th colspan="2" align="center" width ="60">Action</th>
  </tr>
  <c:forEach items="${cartList }"  var="cart">
  <tr>
   <td align ="left">${cart.id}</td>
   <td align="left">${cart.productName}</td>
   <td align="left">${cart.quantity}</td>
   <td align ="left">${cart.price}</td>
   <td align ="left"><a href="<c:url value='/cart_delete?id=${cart.id}' />"button class="btn btn-danger">Delete</a></td>
   </tr>
   </c:forEach>
</table>
<h2> Total Cost: ${totalAmount}</h2>

<a href="cart_checkout" "button class="btn btn-success">Checkout</a>
<br>
<br>

</body>
</html>