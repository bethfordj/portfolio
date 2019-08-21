<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>
<!-- Form goes here -->



<div id="main-content">
	<div>
		<c:url var="allActors" value="/ActorSearchResults" />
		<form action="${allActors}" method="GET">
			<input type="text" name="last_Name" /> 
				 <input type="submit" value="Submit" />
		</form>
	</div>

	<table class="table">
		<tr>
			<th>Name</th>
		</tr>
		<c:forEach var="actor" items="${actors}">
			<tr>
				<td><c:out value="${actor.firstName} ${actor.lastName}" /></td>
			</tr>
		</c:forEach>
	</table>

</div>

	<%@include file="common/footer.jspf"%>