<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
	<title>Payment Method</title>
<style>
	
     body{
     background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/pay.jpg) no-repeat;
     background-size: 100%,150%;
	 top: 0;
     left: 0;
     
	 overflow: hidden;
    
	}


.panel-default {
 opacity: 0.9;
 margin-top:-40px;

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
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/pay.jpg) no-repeat center center fixed; 
	  	-webkit-background-size: cover;
	  	-moz-background-size: cover;
	  	-o-background-size: cover;
	  	background-size: cover;
		background-color: #fff;
	}
}

@media (min-width: 1024px) and (max-width: 1360px) {
     body{
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/pay.jpg) no-repeat center center fixed; 
	  	-webkit-background-size: cover;
	  	-moz-background-size: cover;
	  	-o-background-size: cover;
	  	background-size: cover;
		background-color: #fff;
	}
}

@media (min-width: 1361px) and (max-width: 1960px) {
     body{
		background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/pay.jpg) no-repeat center center fixed; 
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

<br><br>

<div class="modal-body row">
     <div class="col-md-1">
  <i><div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">PAYMENT METHOD</strong>

                </div>
                <div class="panel-body">
                
                    <form class="form-horizontal" role="form"  action="${flowExecutionUrl}&_eventId=submitPaymentMethod"  method="post" commandName="paymentMethod">
                       
                        
                        <div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                         <input type ="radio" name="paymentMethod" value="Net Banking"><b>Net Banking<br>
                                </div>
                            </div>
                        </div>
						<div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                        <input type ="radio" name="paymentMethod" value="Cash On Delivery"><b>Cash On Delivery<br>
                                </div>
                            </div>
                        </div>
						
						<div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                        <input type ="radio" name="paymentMethod" value="Debit Card"><b>Debit Card</b><br>
                                </div>
                            </div>
                        </div>
						
						<div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                        <input type ="radio" name="paymentMethod" value="Credit Card"><b>Credit Card</b><br>
                                </div>
                            </div>
                        </div>
						
						<div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                        <input type ="radio" name="paymentMethod" value="Instant Transfer">Instant Transfer<br>
                                </div>
                            </div>
                        </div>
						
						<div class="form-group">
                            <div class="col-sm-offset-0 col-sm-12">
                                <div class="">
                                    <label class="">
                                        <input type ="radio" name="paymentMethod" value="Gold Star Wallet">Gold Star Wallet<br><br>                                </div>
                            </div>
                        </div>
						
                        <div class="form-group last">
                            <div class="col-sm-offset-1 col-sm-11">
                                <button type="submit" class="btn btn-success btn-md">Confirm Order</button>
                                <button type="reset" class="btn btn-default btn-md">Reset</button>
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




</div>

</div>
	</body>
	</html>
