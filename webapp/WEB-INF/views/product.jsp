<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<spring:url value="/Resources/Images" var="images"/>
<title>Product Page</title>
<style>
tr:hover {background-color: #f5f5f5}

tr {
    height: 50px;
}

table {
   width: 98%;
   border: 1px solid black;
   text-align: center;
   border-collapse: collapse;
   padding: 50px 30px 50px 80px;
}
th, td {
    padding: 15px;
    text-align: left;
    border-bottom: 1px solid black;
    border-right: 1px solid black;
    font-family: verdana;
    font-size: 20px;
}

.btn {
    padding: 14px 24px;
    border: 0 none;
    font-weight: 700;
    letter-spacing: 1px;
    text-transform: uppercase;
    font-size: 24px;
    margin: 1em 0 0.5em 0;
    
}
</style>
</head>
<body>
${msg}
<h1><i><b>Add a Product</b></i></h1>
 <c:url var="addAction" value="/manage_product_add"></c:url>
 <form:form action="${addAction}" modelAttribute ="product" enctype ="multipart/form-data" method ="post">
 <table>
 <tr>
     <td><form:label path="id"><spring:message text="ID" /></form:label></td>
     <c:choose>
       <c:when test="${!empty product.id}">
           <td><form:input path="id" disabled="true" readonly="true"/>
           </td>
       </c:when>
       <c:otherwise>
       <td><form:input path="id" pattern=".{5,20}" required= "true"
                title="id should contain 5 to 20 characters"/></td>
       </c:otherwise>
       </c:choose>
       <tr>
           <td><form:label path="name">  <spring:message text="Name"/></form:label></td>
           <td><form:input path="name" required="true"/></td>
        </tr>   
        <tr>
           <td><form:label path="price">  <spring:message text="Price"/></form:label></td>
           <td><form:input path="price" required="true"/></td>
        </tr>
        
        <tr>
         <td><form:label path="category">  <spring:message text="Category"/>
         </form:label></td> 
         <td><form:select path="category.name" items="${categoryList}"
               itemValue= "name" itemLabel= "name"/></td>
            </tr> 
            
            <tr>
         <td><form:label path="supplier">  <spring:message text="Supplier"/>
         </form:label></td> 
         <td><form:select path="supplier.name" items="${supplierList}"
               itemValue= "name" itemLabel= "name"/></td>
            </tr>    
       
       <tr> 
       <td align="left"><form:label path="image">
       <spring:message text="Image"/>
       </form:label></td>
       <td align ="left"><form:input type="file" name="image" path="image" /></td>
       </tr>
       
       <tr>
          <td colspan="2"><c:if test="${!empty product.name}">
          <input type="submit" value="<spring:message text ="Update Product"/>"/>
          </c:if><c:if test="${empty product.name}">
           <input type="submit" value="<spring:message text ="Add/Update Product"/>"/>
           </c:if></td>
           
        </tr>
        </table>
        </form:form>
        <br>
        
        <h3><i><b>Product List</b></i></h3>
        <c:if test="${!empty productList}">
        <table class="tg">
        <tr>
            <th width="80">Product ID</th>
            <th width="120">Product Name</th>
            <th width="120">Product Price</th>
            <th width="120">Category ID</th>
            <th width="120">Supplier ID</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
           </tr>
           <c:forEach items="${productList}" var="product">
           <tr>
             <td>${product.id}</td>
             <td>${product.name}</td>
             <td>${product.price}</td>
             <td>${product.category_id}</td>
             <td>${product.supplier_id}</td>
             <td><a href="<c:url value='/manage_product_edit?id=${product.id }'/>"button class="btn btn-primary">Edit</a></td>
             <td><a href="<c:url value='/manage_product_remove?id=${product.id }'/>"button class="btn btn-danger">Delete</a></td>
             </tr>
            </c:forEach>
            </table>
            </c:if>
</body>
</html>