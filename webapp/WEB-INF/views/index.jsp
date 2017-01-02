<html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="footer, contact, form, icons" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
	<title>Home page</title>
	<link href="<c:url value="/Resources/css/footer-distributed-with-contact-form.css"/>" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
	
	img {
object-fit: cover;
overflow: hidden;
    }
	
	h1 {
	background-color:black;
	margin: 1em 0 0.5em 0;
	color: #FFD700;
	font-weight: normal;
	font-family: 'Ultra', sans-serif;   
	font-size: 50px;
	line-height: 50px;
	text-transform: uppercase;
	text-shadow: 0 2px white, 0 3px #777;
}

</style>



</head>
<body><i>


	
	
	
	
	<jsp:include page="header1.jsp"></jsp:include>
	
	
	
	<c:if test="${! empty logoutMessage}">
	<div class="alert_alert_success">${logoutMessage}</div>
	</c:if>
	
	<c:if test="${! empty successMessage}">
	<div class="alert_alert_success">${successMessage}</div>
	</c:if>
	
	<c:if test="${! empty errorMessage}">
	<div class="alert_alert_danger">${errorMessage}</div>
	</c:if>
	
	
	
	
	<c:if test="${isUserClickedEquipments== true }">
	<%@ include file="./productmenu1.jsp" %>
	</c:if>
	
	<c:if test="${isUserClickedAboutus== true }">
	<jsp:include page="aboutus.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserClickedGym== true }">
	<jsp:include page="gym.jsp"></jsp:include>
	</c:if>
	
	
	<c:if test="${isAdminClickedCategories== true }">
	<%@ include file="./category1.jsp" %>
	</c:if>
	
	<c:if test="${isAdminClickedProducts== true }">
	<%@ include file="./product.jsp" %>
	</c:if>
	
	<c:if test="${isAdminClickedSuppliers== true }">
	<%@ include file="./supplier.jsp" %>
	</c:if>
	
	<c:if test="${!empty selectedProduct.name}">
	<%@ include file="./selectedProduct.jsp" %>
	</c:if>
	
	<c:if test="${!empty name}">
	<%@ include file="./productlist.jsp" %>
	</c:if>
	
	<c:if test="${displayCart==true}">
	<%@include file="./cart.jsp" %>
	</c:if>
	
	<c:if test="${isUserClickedIndex== true}">
	<jsp:include page="carousel.jsp"></jsp:include>
	</c:if>
	
	<jsp:include page="footer1.jsp"></jsp:include>
	
		

		
	

	</i></body>

</html>
