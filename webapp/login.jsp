<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!-- pageContext is an implicit object in JSP ex. path_to_workspace/project_name/src/main -->
<!-- it is useful for importing JS,CSS files on JSP files -->
<!-- in our case is equal to /home/carlos/working/eclipse-auth-jsp/springboot-registration-login/src/main -->

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Main</title>

      <link href="${contextPath}/resources/bootstrap-5-dist/css/bootstrap.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
  </head>

  <body>
	<div class="row">
	    <div class="col-6">	
	        <form:form action="${contextPath}/register" method="POST" modelAttribute="registerForm" class="form-signin">
	            <h2 class="form-signin-heading">Register</h2>
	            <spring:bind path="username">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="text" path="username" class="form-control" placeholder="Username"
	                                autofocus="true"></form:input>
	                    <form:errors path="username"></form:errors>
	                </div>
	            </spring:bind>
	
				<spring:bind path="Name">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="text" path="Name" class="form-control" placeholder="Name"
	                                autofocus="true"></form:input>
	                    <form:errors path="email"></form:errors>
	                </div>
	            </spring:bind>
	
				<spring:bind path="Alias">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="text" path="text" class="form-control" placeholder="Alias"
	                                autofocus="true"></form:input>
	                    <form:errors path="Alias"></form:errors>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="email">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="email" path="email" class="form-control" placeholder="Email"
	                                autofocus="true"></form:input>
	                    <form:errors path="email"></form:errors>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="password">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
	                    <form:errors path="password"></form:errors>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="ConfirmPW">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <form:input type="password" path="ConfirmPW" class="form-control"
	                                placeholder="Confirm PW"></form:input>
	                    <form:errors path="passwordConfirm"></form:errors>
	                </div>
	            </spring:bind>
	
	            <button id="register" class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
	        </form:form>
	
	    </div>
	    <div class="col-6">
	      <form name="login" method="POST" action="${contextPath}/login" class="form-signin">
	        <h2 class="form-heading">Login</h2>
	
	        <div class="form-group ${error != null ? 'has-error' : ''}">
	            <span >${message}</span>
	            
	            <div class="form-floating mb-3">
				  <input name="username" type="text" class="form-control" id="floatingUsername" placeholder="Username">
				  <label for="floatingUsername">Username</label>
				</div>
				<div class="form-floating mb-3">
				  <input name="email" type="email" class="form-control" id="floatingEmail" placeholder="Email">
				  <label for="floatingEmail">Email:</label>
				</div>
				<div class="form-floating">
				  <input name="password" type="password" class="form-control" id="floatingPassword" placeholder="Password">
				  <label for="floatingPassword">Password:</label>
				</div>
	            
	            <span>${error}</span>
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				
				<button type="submit" class="btn btn-success mt-3 mb-2">Login</button>
				
	        </div>
	      </form>
	    </div>
    </div>

    <script src="${contextPath}/resources/js/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/bootstrap-5-dist/js/bootstrap.js"></script>
  </body>
</html>
