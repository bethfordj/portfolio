<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h1>You have selected to add</h1>

<table>
	<tr>
		<td>Name:</td>
		<td>${city.name}</td>
	</tr>
	<tr>
		<td>State:</td>
		<td>${city.district}</td>
	</tr>
	<tr>
		<td>Population</td>
		<td>${city.population}</td>
	</tr>
</table>

<c:url var="confirmURL" value="/addCity/confirm" />

<form action="${confirmURL}" method="POST" >
	<input type="submit" value="Add City" />
</form>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />