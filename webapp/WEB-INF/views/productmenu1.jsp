     <html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<head>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<style>
.btn {
    padding: 14px 24px;
    border: 0 none;
    font-weight: 700;
    letter-spacing: 1px;
    text-transform: uppercase;
    font-size: 24px;
    margin: 1em 0 0.5em 0;
    margin-left:100px;
}

img {
    float: right;
    margin: 0 0 10px 10px;
   
}



</style>

</head>
<body>
<p><i><img src="<c:url value="/Resources/Images/gym image33.png"/>" alt="Categories" >
         <c:forEach items="${categoryList}" var="category">
        <a href="open_category?name=${category.name}" button class="btn btn-primary"> ${category.name}</a><br>
        
        </c:forEach>
        
</body>
</html>