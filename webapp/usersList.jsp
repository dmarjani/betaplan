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
		  
		<h2 class="form-heading my-5 mx-5">${show.title}</h2>
		  
        <div class="col-12 my-5">
        	<label class="col-sm-10 col-form-label">Network: ${show.network.name}</label>
        </div>

		<h2 class="form-heading my-5 mx-5">Users who rated this show</h2>    
	    <!-- table -->
		<table id="ratedTable" class="table table-striped my-5">
			<thead>
			    <tr>
			      <th scope="col">Alias</th>
			      <th scope="col">Name</th>
			    </tr>
			</thead>
			<tbody>
			  	<c:forEach items="${ratings}" var="rating">
			  		<tr>
				  		<td>${rating.show.network.name}</td>
				  		<td>${rating.value}</td>
			  		</tr>
			  	</c:forEach>
			</tbody>
		</table>
		
		<div class="col-12 my-5">
			<a class="btn btn-success" href="${contextPath}/shows/${show.id}/edit">Edit</a>
		</div>
		
		<!-- Rating -->
		<form:form method="POST" modelAttribute="ratingForm" action="${contextPath}/rate/new" class="form-signin">
		   
		  <spring:bind path="show.id">
            	<form:input value="${ratingForm.show.id}" type="hidden" path="show.id"></form:input>
          </spring:bind>
          
          <spring:bind path="show.title">
            	<form:input value="${ratingForm.show.title}" type="hidden" path="show.title"></form:input>
          </spring:bind>
          
          <spring:bind path="show.network.id">
            	<form:input value="${ratingForm.show.network.id}" type="hidden" path="show.network.id"></form:input>
          </spring:bind>
          
          <spring:bind path="show.network.name">
            	<form:input value="${ratingForm.show.network.name}" type="hidden" path="show.network.name"></form:input>
          </spring:bind>
          
          <spring:bind path="user.id">
            	<form:input value="${ratingForm.user.id}" type="hidden" path="user.id"></form:input>
          </spring:bind>
          
          <spring:bind path="user.username">
            	<form:input value="${ratingForm.user.username}" type="hidden" path="user.username"></form:input>
          </spring:bind>
          
          <spring:bind path="user.email">
            	<form:input value="${ratingForm.user.email}" type="hidden" path="user.email"></form:input>
          </spring:bind>
          
          <spring:bind path="user.password">
            	<form:input value="${ratingForm.user.password}" type="hidden" path="user.password"></form:input>
          </spring:bind>
          
          <spring:bind path="value">
          	<div class="row my-5 form-group ${status.error ? 'has-error' : ''}">
          		<label for="ratingValue" class="col-sm-2 col-form-label">Leave a rating:</label>
            	<div class="col-sm-10">
            		<form:input id="ratingValue" value="${ratingForm.value}" type="number" path="value" class="col-sm-10 col-form-label" autofocus="true"></form:input>
                </div>
                <form:errors path="value"></form:errors>
            </div>
          </spring:bind>
          
		  <button type="submit" class="btn btn-success mt-3 mb-2">Rate</button>
		 
		 </form:form>
		
	</div>

</body>
</html>