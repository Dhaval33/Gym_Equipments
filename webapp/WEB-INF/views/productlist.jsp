<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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





</style>


</head>
<body>


<c:forEach var="listcategory" items="${categoryList}">
     
      <c:if test="${listcategory.getName()== name}">
      <c:set var="category" value="${listcategory}"/>
      </c:if>
      </c:forEach>


<c:forEach items="${category.getProducts()}" var="product">
      <a href="manage_product/get/${product.id}" button class="btn btn-warning">${product.name}</a>
     </c:forEach>  

</body>
</html>