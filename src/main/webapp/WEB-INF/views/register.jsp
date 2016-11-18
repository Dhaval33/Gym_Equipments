<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Registration page</title>
	<style>
	body{
     background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/gym6.jpg) no-repeat;
     background-size: 100%,100%;
	 top: 0;
     left: 0;
     
	overflow: hidden;
    
	}

.panel-default {
 opacity: 0.9;
 

 
}
.form-group.last {
 margin-bottom:0px;
}

@media (min-width: 350px) and (max-width: 500px) {
     .login-form{
     	width: 300px !important;
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





}

</style>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>



<body>



<div class="modal-body row">
     <div class="col-md-1">
    <i><div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">REGISTRATION</strong>
				</div>
                    <div class="panel-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Name</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" id="inputEmail3" placeholder="Name"  required="">
                            </div>
						</div>
                        
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Username</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" id="inputEmail3" placeholder="Username"  required="">
                            </div>
						</div>
                     <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Password</label><br><br>
                            <div class="col-sm-12">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="(should be min of 5 chars)" pattern=".{5,18}" required="">
                            </div>
                        </div>
 
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Password(Confirm)</label><br><br>
                            <div class="col-sm-12">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="Password(Confirm)" pattern=".{5,18}" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Contact</label><br><br>
                            <div class="col-sm-12">
                                <input type="tel" class="form-control" id="inputEmail3" placeholder="Contact (format: xx-xxxxxxxxxx)" maxlength="13" pattern="^\d{2}-\d{10}$" required="">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Address</label><br><br>
                            <div class="col-sm-12">
                                 <input type="Textarea" class="form-control" id="inputEmail3" placeholder="Address" required="">
                            </div>
                        </div>
                        
 
                        <div class="control-group">
                          <!-- Button -->
                            <div class="controls">
                                  <button class="btn btn-info">Register</button>&nbsp;
								  &nbsp;<button class="btn btn-success">Reset</button>
                            </div>
                        </div>
						      </form>
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
 