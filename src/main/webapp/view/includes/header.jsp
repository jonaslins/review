<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Type" content="application/javascript" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title><s:message code="app.title" /></title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="/css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="/css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
</head>
<body>

	<nav class="light-blue lighten-1" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="${contextPath}/" class="brand-logo"><s:message code="app.title"/></a>
			<ul class="right hide-on-med-and-down">
				<li><a href="${contextPath}/produto/listar"><i class="material-icons left">view_list</i>Produtos</a></li>
				
				<sec:authorize access="isAnonymous()">
				   	<f:form id="facebookConnectForm" style="display: none" action="${contextPath}/auth/facebook?scope=email,public_profile" method="POST">
					</f:form>
					<li>
					<a href="#" onclick="document.getElementById('facebookConnectForm').submit()">
	          		<div class="chip">
					    <img src="${contextPath}/images/fb_icon.png"/>
					    <span></span>
			        	<s:message code="login.title" />
			    	</div>
			    	</a>
	          		</li>
		       	</sec:authorize>
	         
	          	<sec:authorize access="isAuthenticated()">
	          		<li>
	          		<div class="chip">
					    <img src="${contextPath}/images/fb_icon.png"/>
					    <sec:authentication property="principal.user.name" />
			    	</div>
	          		</li>
		          	<f:form style="display: none" id="facebookDisconnectForm" action="${contextPath}/connect/facebook" method="delete">
		          	</f:form>
		         	<li><a  href="#" onclick="document.getElementById('facebookDisconnectForm').submit()"><s:message code="logout.title" /></a></li>
	          	</sec:authorize>					
				
			</ul>

			<ul id="nav-mobile" class="side-nav">
				<li><a href="#">Navbar Link</a></li>
			</ul>
			<a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
		</div>
	</nav>
<main>
	<div class="container">
		<div class="section">
			<!--   Icon Section   -->
			<div class="row">