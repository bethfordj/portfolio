<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<div id="main-content">

<div>
	<c:url var="allCustomers" value="/CustomerSearchResults" />
	<form action="${allCustomers}" method="GET">
		<input type="text" name="search" /> 
		<label for="sort">Sort:</label>
		<select name="sort">
			  <option value="last_name">Last Name</option>
			  <option value="email">Email</option>
			  <option value="active">Active</option>
		</select>
			 <input type="submit" value="Submit" />
	</form>
</div>

	<table class="table">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Active</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
		<c:choose>
			<c:when test="${customer.active == true}">
				<c:set var="active" value="Yes" />
			</c:when>
			<c:otherwise>
				<c:set var="active" value="No"/>
			</c:otherwise>
		</c:choose>
			<tr>
				<td><c:out value="${customer.firstName} ${customer.lastName}" /></td>
				<td><c:out value="${customer.email}" /></td>
				<td><c:out value="${active}" /></td>
			</tr>
		</c:forEach>
	</table>

</div>

<%@include file="common/footer.jspf"%>