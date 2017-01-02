<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Supplier Page</title>
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
<h1><i><b>Add a Supplier</b></i></h1>
 <c:url var="addAction" value="/manage_supplier_add"></c:url>
 <form:form action="${addAction}" commandName ="supplier" method ="post">
 <table>
 <tr>
     <td><form:label path="id"><spring:message text="ID" /></form:label></td>
     <c:choose>
       <c:when test="${!empty supplier.id}">
           <td><form:input path="id" disabled="true" readonly="true"></form:input></td>
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
           <td><form:label path="address">  <spring:message text="Address"/></form:label></td>
           <td><form:input path="address" required="true"/></td>
        </tr>   
       
       
       
       <tr>
          <td colspan="2"><c:if test="${!empty supplier.name}">
          <input type="submit" value="<spring:message text ="Update Supplier"/>"/>
          </c:if><c:if test="${empty supplier.name}">
           <input type="submit" value="<spring:message text ="Add Supplier"/>"/>
           </c:if></td>
           
        </tr>
        </table>
        </form:form>
        <br>
        
        <h3><i><b>Supplier List</b></i></h3>
        <c:if test="${!empty supplierList}">
        <table class="tg">
        <tr>
            <th width="80">Supplier ID</th>
            <th width="120">Supplier Name</th>
            <th width="120">Supplier Address</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
           </tr>
           <c:forEach items="${supplierList}" var="supplier">
           <tr>
             <td>${supplier.id}</td>
             <td>${supplier.name}</td>
             <td>${supplier.address}</td>
             <td><a href="<c:url value='/manage_supplier_edit?id=${supplier.id }'/>"button class="btn btn-primary">Edit</a></td>
             <td><a href="<c:url value='/manage_supplier_remove?id=${supplier.id }'/>"button class="btn btn-danger">Delete</a></td>
             </tr>
            </c:forEach>
            </table>
            </c:if>
</body>
</html>