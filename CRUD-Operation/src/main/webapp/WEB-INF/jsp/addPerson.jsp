<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
	function addPerson() {
		alert("button clicked");
		var strPersonName = document.getElementById("person").personName.value;
		alert(strPersonName);
		document.getElementById("person").action = "/addedPerson"
		alert("this happened");
		document.getElementById("person").submit();
	}
</script>
</head>
<body>
	<form:form modelAttribute="person" id="person" action="/addPerson">
		Person Name: <form:input path="personName"></form:input>
	</form:form>
	<button id="addPerson" onclick="addPerson();">Submit</button>
	This is JSP to add People
</body>
</html>