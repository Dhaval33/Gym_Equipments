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
  

	<title>Home page</title>

	
	<link href="<c:url value="/Resources/css/footer-distributed-with-contact-form.css"/>" rel="stylesheet">

	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

	<link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
	
	<style>
	
	img {
    float: right;
    margin: 0 0 10px 10px;
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
	
	<h1> <i><center>GOLD STAR GYM EQUIPMENTS</center><i></h1>

		
		
		
		
		
		
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
        <li class="active"><a href="#">About Us <span class="sr-only">(current)</span></a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Products <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Upper Body Equipments</a></li>
            <li><a href="#">Lower Body Equipments</a></li>
            <li><a href="#">Cardio Equipments</a></li>
            <li><a href="#">Light and Heavy Dumbells</a></li>
            <li><a href="#">Rods and Plates</a></li>
			<li><a href="#">Gym Accessories</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        
        <li class="Admin">
          <a href="#" class="admin-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Add a Product</a></li>
            <li><a href="#">Update a Product</a></li>
            <li><a href="#">Delete a Product</a></li>
            
          </ul>
        </li>
		<li><a href="cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
		<li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
		<li><a href="register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<p><i><img src="<c:url value="/Resources/Images/gym image5.jpg"/>" alt="Equipments" ><b><h3>GOLD STAR GYM EQUIPMENTS</h3></b></br>
<b>Gold star Gym equipments is one of the most famous gym Equipments store in United States of America. we deliver all kinds all of Gym Equipments for Gyms as well as for home use to make you life and body healthy
 and in perfect shape to boost your presonality and confidence.</br>We are awarded the number 1 gym equipments store by the FORBES magzines
  and fitness magzines.<br>Understanding gym equipment when starting your journey through fitness and putting together an exercise regiment 
  can seem pretty daunting in the beginning.<br>One visit to your local public/private gym and its as if youve entered the Matrix, 
  dozens of exercise machines roam the venue, and youre not so sure if youre the One prophesied to conquer them all.
  <br>Weve put together this exercise equipment guide to set you free from the unknown and expand your fitness horizons. 
  This guide will help you put together an effective and informed work-out regiment.<br>Our goals are<br>
  To simplify the information out there that is currently available for aspiring home gym owners,
  To provide a work-out and fitness information resource for those that already own a personal home gym and to spread awareness of all the 
  benefits of leaving scammy, unethical corporate gyms</b></i></p>
  
  
	<jsp:include page="footer1.jsp"></jsp:include>
	</body>

</html>
   

