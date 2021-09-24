<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
</head>
<body>

	

 	<div class="container">
		<form:form method="POST" modelAttribute="showForm" action="${contextPath}/shows/${showForm.id}/edit" class="form-signin">
		  
		  <h2 class="form-heading my-5 mx-5">${showTitle}</h2>
		  
		  <spring:bind path="id">
		  	    <form:input id="showId" value="${showForm.id}" type="hidden" path="id"></form:input>
		  </spring:bind>
		   
		  <spring:bind path="title">
          	<div class="row my-5 form-group ${status.error ? 'has-error' : ''}">
          		<label for="showTitle" class="col-sm-2 col-form-label">Title:</label>
            	<div class="col-sm-10">
            		<form:input id="showTitle" value="${showForm.title}" type="text" path="title" class="col-sm-10 col-form-label" autofocus="true"></form:input>
                </div>
                <form:errors path="title"></form:errors>
            </div>
          </spring:bind>
          
          <spring:bind path="network.name">
          	<div class="row my-5 form-group ${status.error ? 'has-error' : ''}">
          		<label for="showNetwork" class="col-sm-2 col-form-label">Instructor:</label>
            	<div class="col-sm-10">
            		<form:input id="showNetwork" value="${showForm.network.name}" type="text" path="network.name" class="col-sm-10 col-form-label" autofocus="true"></form:input>
                </div>
                <form:errors path="network"></form:errors>
            </div>
          </spring:bind>
          
		  <button type="submit" class="btn btn-success mt-3 mb-2">Update</button>
		 
		 </form:form>
		 
		 <div class="col-12 my-5">
			<a class="btn btn-success" href="${contextPath}/delete?showId=${showId}">Delete</a>
		</div>
		 
	</div>

</body>
</html>