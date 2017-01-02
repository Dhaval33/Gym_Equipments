<html>

<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<head>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>



	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="footer, contact, form, icons" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  

	<title>Home page</title>

	
	<link href="<c:url value="/Resources/css/footer-distributed-with-contact-form.css"/>" rel="stylesheet">

	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

	<link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
	
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

</style>-->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


	

</head>

	<body><i>
	
	<h1> <i><center>GOLD STAR GYM EQUIPMENTS</center></i></h1>

		
		
		
		
		
		
		 <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="./">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="aboutus">About Us <span class="sr-only">(current)</span></a></li>
        <li><a href="gym">New to Gym</a></li>
        <li class="active"><a href="equipments">Equipments</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
           <c:if test= "${!empty loggedInAdmin}">
          <li class="Admin">
          <a href="#" class="admin-toggle" data-toggle="dropdown" role="button" >Admin <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="manage_categories">Update Categories</a></li>
            <li><a href="manage_suppliers">Update Suppliers</a></li>
            <li><a href="manage_products">Update Products</a></li>
            </ul></li></c:if>
            
          
                             <c:if test="${empty loggedInUser}">
                               <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                                  <li><a href="register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
                      </c:if> 
        <c:if test="${! empty loggedInUser}">
        
                       <c:if test="${empty loggedInAdmin}">                                   
                   <li><a href="cart">Cart <span class="glyphicon glyphicon-shopping-cart"></span>${cartSize}</a></i></li>
                   </c:if>
                         <li> <a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                          </c:if>
                        </ul>

                   
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</i>
</body>