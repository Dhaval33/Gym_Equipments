<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
	<title>Login page</title>
<style>
	
     body{
     background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/download.jpg) no-repeat;
     background-size: 100%,150%;
	 top: 0;
     left: 0;
     
	 overflow: hidden;
    
	}


.panel-default {
 opacity: 0.9;
 margin-top:30px;

}
.form-group.last {
 margin-bottom:0px;
}


@media (min-width: 350px) and (max-width: 500px) {
     .login-form{
     	width: 300px !important;
     }
     
}

@media (min-width: 320px) and (max-width: 1023px) {
     body{
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/download.jpg) no-repeat center center fixed; 
	  	-webkit-background-size: cover;
	  	-moz-background-size: cover;
	  	-o-background-size: cover;
	  	background-size: cover;
		background-color: #fff;
	}
}

@media (min-width: 1024px) and (max-width: 1360px) {
     body{
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/download.jpg) no-repeat center center fixed; 
	  	-webkit-background-size: cover;
	  	-moz-background-size: cover;
	  	-o-background-size: cover;
	  	background-size: cover;
		background-color: #fff;
	}
}

@media (min-width: 1361px) and (max-width: 1960px) {
     body{
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/download.jpg) no-repeat center center fixed; 
	  	-webkit-background-size: cover;
	  	-moz-background-size: cover;
	  	-o-background-size: cover;
	  	background-size: cover;
		background-color: #fff;
	}
}


.img1{
    float: right;
    margin: 0 0 1025px 0px;
}

.img2{
float: right;
margin: 250px -40px 10px 0px;
}

.img3{
float: right;
margin: 350px -40px 10px 0px;

}

.img4{
float: right;
margin: 450px -40px 10px 0px;
}
  
	  </style>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

${errorMessage}<br><br>

<div class="modal-body row">
     <div class="col-md-1">
  <i><div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">LOGIN</strong>

                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="validate" method="post">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-3 control-label">Username</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="UserID" id="inputEmail3" placeholder="Username" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" name="password" id="inputPassword3" placeholder="Password" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <div class="checkbox">
                                    <label class="">
                                        <input type="checkbox" class="">Remember me</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">Sign in</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer">Not Registered? <a href="register" class="">Register here</a>
                </div>
            </div>
        </div>
    </div>
</div></i>
</div>
<div class="col-md-0">
<div class ="img1">
<a title="Home" href="./"><img alt="Home" src="<c:url value="/Resources/Images/home.png"/>" border=0></a>
</div>



<div class="img2">
<a target="_blank" title="find us on Facebook" href="http://www.facebook.com"><img alt="follow me on facebook" src="<c:url value="/Resources/Images/fb.png"/>" border=0></a>
</div>


<div class="img3">
<a target="_blank" title="find us on Google+" href="http://plus.google.com"><img alt="Follow me on google plus" src="<c:url value="/Resources/Images/g++.png"/>" border=0></a>
</div>
                                                                                                                                                                                       

<div class="img4">
<a target="_blank" title="follow me on twitter" href="http://www.twitter.com"><img alt="follow me on twitter" src="<c:url value="/Resources/Images/twt.png"/>" border=0></a>
</div>
</div>

</div>
	</body>
	</html>
