<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Shipping Address</title>
	<style>
	body{
     background: url(http://localhost:9999/ShoppingCartFrontEnd/Resources/Images/Ship.jpg) no-repeat;
     background-size: 100%,100%;
	 top: 0;
     left: 0;
     
	overflow: hidden;
    
	}

.panel-default {
 opacity: 1.0;
 

 
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
                <div class="panel-heading"> <strong class="">SHIPPING ADDRESS</strong>
				</div>
                    <div class="panel-body">
                    <form class="form-horizontal" role="form" action="${flowExecutionUrl}&_eventId=submitShippingAddress"  commandName="shippingAddress" method="post">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Address_Line_1</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" name="Line1" id="inputEmail3" placeholder="Line-1"  required="">
                            </div>
						</div>
                        
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Address_Line_2</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" name="Line2" id="inputEmail3" placeholder="Line-2"  >
                            </div>
						</div>
                     <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">City</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" name="City" id="inputEmail3" placeholder="City"  required="">
                            </div>
                        </div>
 
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">State</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" name="State" id="inputEmail3" placeholder="State"  required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Country</label><br><br>
                            <div class="col-sm-12">
                                <input type="text" class="form-control" name="Country" id="inputEmail3" placeholder="Country"  required="">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">Zipcode</label><br><br>
                            <div class="col-sm-12">
                                 <input type="text" pattern="^[1-9][0-9]{5}$" title="Enter zipcode" class="form-control" placeholder="Zipcode" required="">
                            </div>
                        </div>
                        
 
                        <div class="control-group">
                          <!-- Button -->
                            <div class="controls">
                                  <button class="btn btn-info">Proceed to Billing Address</button>
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
 