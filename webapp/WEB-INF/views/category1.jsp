<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Category Page</title>
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
<h1><b><i>Add a Category</i></b></h1>
 <c:url var="addAction" value="/manage_category_add"></c:url>
 <form:form action="${addAction}" modelAttribute ="category" method ="post">
 <table>
 <tr>
     <td><form:label path="id"><spring:message text="ID" /></form:label></td>
      <c:choose>
        <c:when test="${!empty category.id}">
           <td><form:input path="id" disabled= "true" readonly="true"/></td>
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
           <td><form:label path="description">  <spring:message text="Description"/></form:label></td>
           <td><form:input path="description" required="true"/></td>
        </tr>   
       
      
       <tr>
          <td colspan="2"><c:if test="${!empty category.name}">
          <input type="submit" value="<spring:message text ="Update Category"/>"button class="btn btn-info"/>
          </c:if><c:if test="${empty category.name}">
           <input type="submit" value="<spring:message text ="Add Category"/>"button class="btn btn-info"/>
           </c:if></td>
           
        </tr>
        </table>
        </form:form>
        <br>
        
        <h3><i><b>Category List</b></i></h3>
        <c:if test="${!empty categoryList}">
        <table class="tg">
        <tr>
            <th width="100">Category ID</th>
            <th width="150">Category Name</th>
            <th width="150">Category Description</th>
            <th width="80">Edit</th>
            <th width="80">Delete</th>
           </tr>
           <c:forEach items="${categoryList}" var="category">
           <tr>
             <td>${category.id}</td>
             <td>${category.name}</td>
             <td><i>${category.description}</i></td>
             <td><a href="<c:url value='/manage_category_edit?id=${category.id }'/>" button class="btn btn-primary">Edit</a></td>
             <td><a href="<c:url value='/manage_category_remove?id=${category.id }'/>" button class="btn btn-danger">Delete</a></td>
             </tr>
            </c:forEach>
            </table>
            </c:if>
<br>
<br>
</body>
</html>