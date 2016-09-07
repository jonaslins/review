<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
	<c:url value="/resources/text.txt" var="url"/>
	<s:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
	Hi I'm ${user.name} with id #${user.id}
	<br>
	My e-mail is: ${user.email}
	<br><br>
	Spring URL: ${springUrl} at ${time}
	<br>
	JSTL URL: ${url}
	<br>
	Message: ${message} 
	
	<br><br>
	And this is a i18n message: <s:message code="user.message.default"/>
	<br><br>
</body>

</html>
