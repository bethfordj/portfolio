<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<H1>People in the Address Book</H1>

<div>
	<c:url var="addPersonUrl" value="/persons" />
	
	<form action="${addPersonUrl}" method="POST">
		<label for="firstName">First Name:</label>
		<input type="text" name="firstName" />
		
		<label for="lastName">Last Name:</label>
		<input type="text" name="lastName" />
		
		<input type="submit" value="Add" />
	</form>

</div>


<ul>
	<c:forEach var="contact" items="${contacts}">
		<li><c:out value="${contact.firstName}" /> <c:out value="${contact.lastName}" /></li>
	</c:forEach> 


</ul>