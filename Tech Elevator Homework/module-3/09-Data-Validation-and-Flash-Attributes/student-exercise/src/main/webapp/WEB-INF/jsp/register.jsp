<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url var="registrationUrl" value="/register"/>
<form:form action="${registrationUrl}" method="POST" modelAttribute="registration">

	<label for="firstName">First Name</label>
	<form:input path="firstName" />
	      <form:errors path="firstName" cssClass="error" />
	      
	<label for="lastName">Last Name</label>
	<form:input path="lastName" />
	      <form:errors path="lastName" cssClass="error" />
	      
	<label for="email">Email</label>
	<form:input path="email" />
	      <form:errors path="email" cssClass="error" />
	      <form:errors path="emailFormatting" cssClass="error" />
	      
	<label for="verifyEmail">Confirm Email</label>
	<form:input path="verifyEmail" />
	      <form:errors path="verifyEmail" cssClass="error" />	  
	      <form:errors path="emailMatching" cssClass="error" />	
	      <form:errors path="emailFormatting" cssClass="error" />      
     	 
    <label for="password">Password</label>
	<form:input path="password" />
	      <form:errors path="password" cssClass="error" />
	      
	<label for="verifyPassword">Confirm</label>
	<form:input path="verifyPassword" />
	      <form:errors path="verifyPassword" cssClass="error" />	  
	      <form:errors path="passwordMatching" cssClass="error" />	      

	<label for="birthDate">Birth Date</label>
	<form:input path="birthDate" />
	      <form:errors path="birthDate" cssClass="error" />

	<label for="numberOfTickets">Number of Tickets</label>
	<form:input path="numberOfTickets" />
	      <form:errors path="numberOfTickets" cssClass="error" />
	      <form:errors path="ticketNotBlank" cssClass="error" />
	      
	<input type="submit" value="Submit" />

</form:form>



<%@include file="common/footer.jspf" %>