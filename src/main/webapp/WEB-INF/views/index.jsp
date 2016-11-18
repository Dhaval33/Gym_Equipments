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

	   	<div class="bs-example">
   <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
            <li data-target="#myCarousel" data-slide-to="4"></li>
            <li data-target="#myCarousel" data-slide-to="5"></li>
        </ol>   
        <!-- Wrapper for carousel items -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="<c:url value="/Resources/Images/gym image6.jpeg"/>" alt="First Slide">
            </div>
            <div class="item">
                <img src="<c:url value="/Resources/Images/gym image2.jpg"/>" alt="Second Slide">
            </div>
            <div class="item">
                <img src="<c:url value="/Resources/Images/gym image.jpg"/>" alt="Third Slide">
            </div>
            <div class="item">
                <img src="<c:url value="/Resources/Images/gym7.jpg"/>" alt="Fourth Slide">
            </div>
            <div class="item">
                <img src="<c:url value="/Resources/Images/gym8.png"/>" alt="Fifth Slide">
            </div>
            <div class="item">
                <img src="<c:url value="/Resources/Images/gym9.jpg"/>" alt="Sixth Slide">
            </div>
        </div>
        <!-- Carousel controls -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
    
</div>
	
		
		
		<jsp:include page="footer1.jsp"></jsp:include>

	</i></body>

</html>
