<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url var="loginURL" value="/login"/>
<form:form action="${loginURL}" method="POST" modelAttribute="login">

	<label for="email">Email</label>
	<form:input path="email" />
	      <form:errors path="email" cssClass="error" /> 
	      <form:errors path="emailValid" cssClass="error" />     
     	 
    <label for="password">Password</label>
	<form:input path="password" />
	      <form:errors path="password" cssClass="error" />
	      
	<input type="submit" value="Submit" />

</form:form>



<%@include file="common/footer.jspf" %>