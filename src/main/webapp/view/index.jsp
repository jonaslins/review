<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
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
	<nav class="light-blue lighten-1" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo"><s:message code="app.title"/></a>
			<ul class="right hide-on-med-and-down">
				<li><a href="#"> <s:message code="login.title" /></a></li>
			</ul>

			<ul id="nav-mobile" class="side-nav">
				<li><a href="#">Navbar Link</a></li>
			</ul>
			<a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
		</div>
	</nav>
	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br>
			<br>
			<h1 class="header center orange-text">
				<s:message code="app.title" />
			</h1>
			<div class="row center">
				<h5 class="header col s12 light">
					<c:choose>
					    <c:when test="${empty sessionScope.sessionUser}">
					        <form action="/connect/facebook" method="POST">
					        	<input type="hidden" name="scope" value="email" />
					        	<input type="hidden" name="scope" value="public_profile" />
								<div class="formInfo">
									<p>You aren't connected to Facebook yet. Click the button to connect this application with your Facebook account.</p>
								</div>
								<p><button type="submit">Connect to Facebook</button></p>
							</form>
					    </c:when>
					    <c:otherwise>
					        User ${sessionScope.sessionUser.name} Email: ${sessionScope.sessionUser.email} message:
							<s:message code="user.message.default" />
					    </c:otherwise>
					</c:choose>
				</h5>				
			</div>
			
			<div class="container">
				<div class="input-field">
				  <i class="material-icons prefix">search</i>
		          <input type="text" id="autocomplete-input" class="autocomplete">
		          <label for="autocomplete-input">Procure aqui o produto que voc� deseja</label>
		        </div>
			</div>
			<br>
			<br>

		</div>
	</div>


	<div class="container">
		<div class="section">

			<!--   Icon Section   -->
			<div class="row">
				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center light-blue-text">
							<i class="material-icons">flash_on</i>
						</h2>
						<h5 class="center">Speeds up development</h5>

						<p class="light">We did most of the heavy lifting for you to
							provide a default stylings that incorporate our custom
							components. Additionally, we refined animations and transitions
							to provide a smoother experience for developers.</p>
					</div>
				</div>

				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center light-blue-text">
							<i class="material-icons">group</i>
						</h2>
						<h5 class="center">User Experience Focused</h5>

						<p class="light">By utilizing elements and principles of
							Material Design, we were able to create a framework that
							incorporates components and animations that provide more feedback
							to users. Additionally, a single underlying responsive system
							across all platforms allow for a more unified user experience.</p>
					</div>
				</div>

				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center light-blue-text">
							<i class="material-icons">settings</i>
						</h2>
						<h5 class="center">Easy to work with</h5>

						<p class="light">We have provided detailed documentation as
							well as specific code examples to help new users get started. We
							are also always open to feedback and can answer any questions a
							user may have about Materialize.</p>
					</div>
				</div>
			</div>

		</div>
		<br>
		<br>

		<div class="section"></div>
	</div>

	<footer class="page-footer orange">
		<div class="container">
			<div class="row">
				<div class="col l6 s12">
					<h5 class="white-text">Company Bio</h5>
					<p class="grey-text text-lighten-4">We are a team of college
						students working on this project like it's our full time job. Any
						amount would help support and continue development on this project
						and is greatly appreciated.</p>


				</div>
				<div class="col l3 s12">
					<h5 class="white-text">Settings</h5>
					<ul>
						<li><a class="white-text" href="#!">Link 1</a></li>
						<li><a class="white-text" href="#!">Link 2</a></li>
						<li><a class="white-text" href="#!">Link 3</a></li>
						<li><a class="white-text" href="#!">Link 4</a></li>
					</ul>
				</div>
				<div class="col l3 s12">
					<h5 class="white-text">Connect</h5>
					<ul>
						<li><a class="white-text" href="#!">Link 1</a></li>
						<li><a class="white-text" href="#!">Link 2</a></li>
						<li><a class="white-text" href="#!">Link 3</a></li>
						<li><a class="white-text" href="#!">Link 4</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="footer-copyright">
			<div class="container">
				Made by <a class="orange-text text-lighten-3"
					href="http://materializecss.com">Materialize</a>
			</div>
		</div>
	</footer>


	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>

</body>
</html>