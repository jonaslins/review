<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html lang="en">

<body>

	User details
	<br>
	Name: ${user.name}
	</br>
	<br>
	Email: ${user.email}
	</br>
	<br><br></br></br>
	And this is a i18n message: <s:message code="user.message.default"/>
	
</body>

</html>
