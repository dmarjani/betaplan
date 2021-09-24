<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bright Ideas  ${pageContext.request.userPrincipal.name}</title>
</head>
<body>
  
  <div class="container my-5">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome! ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
    </c:if>
    
    <h2 class="form-heading my-5 mx-5">TV Shows</h2>    
    <!-- table -->
	<table id="customersTable" class="table table-striped my-5">
		<thead>
		    <tr>
		      <th scope="col">Register</th>
		      <th scope="col">Login</th>
		    </tr>
		</thead>
		<tbody>
		  	<c:forEach items="${showratings}" var="showrating">
		  		<tr>
			  		<td>
		  				<a class="link-primary" href="${contextPath}/shows/${showrating.show.id}">${showrating.show.title}</a>
		  			</td>
			  		<td>${showrating.show.network.name}</td>
		  		</tr>
		  	</c:forEach>
		</tbody>
	</table>

  </div>
</body>
</html>
