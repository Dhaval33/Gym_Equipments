     <html>

<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<head>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

  



	<!--  <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="footer, contact, form, icons" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  

	<title>Home page</title>

	
	<link href="<c:url value="/Resources/css/footer-distributed-with-contact-form.css"/>" rel="stylesheet">

	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

	<link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">-->
	

	
	
	
	

</head>
<body>



<div class="container">
<ul class=" nav nav-pills" role="tablist">
   <c:forEach items="${categoryList}" var="category">
       <li class="dropdown" ><a href="#" class ="dropdown-toggle"
            data-toggle="dropdown"  role="menu" >${category.name}<span
                 class="caret"></span></a>
           <ul class= "dropdown menu" >
     <c:forEach items="${category.products}" var="product">
      <li><a href="manage_product/get/${product.id}">${product.name}</a></li> 
     </c:forEach>  
   </ul>

 
  
    </li>
</c:forEach>
</ul> 
</div>
<hr color="red" font="italic">
</body>
</html>