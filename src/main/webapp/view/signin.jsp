<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title><s:message code="app.title" /></title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
</head>
<body>
<div class="panel panel-primary">

	<div class="panel-heading">
		<h3 class="panel-title">Please sign in</h3>
	</div>
	
	<div class="panel-body">
	
		<c:if test="${param.error != null}">
		    <div class="alert alert-danger">
		        Invalid username and password.
		    </div>
	    </c:if>
	    
	    <c:if test="${param.logout != null}">
		    <div class="alert alert-danger">
		        You have been logged out.
		    </div>
	    </c:if>
	
		<f:form role="form" method="post">
		
			<div class="form-group">
				<label for="username">Email address</label>
				<input id="username" name="username" type="email" class="form-control" placeholder="Enter email" />
				<p class="help-block">Enter your email address.</p>
			</div>
			
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" id="password" name="password" class="form-control" placeholder="Password" />
				<form:errors cssClass="error" path="password" />
			</div>
			
			<button type="submit" class="btn btn-primary">Sign In</button>
			<a class="btn btn-default" href="/forgot-password">Forgot Password</a>
			<a class="btn btn-default" href="/auth/facebook?scope=${facebookScope}">Facebook Sign In</a>
		</f:form>
	</div>
</div>

</body>
</html>