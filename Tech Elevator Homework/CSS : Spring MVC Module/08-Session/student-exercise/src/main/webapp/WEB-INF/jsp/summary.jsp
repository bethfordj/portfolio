<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="pageTitle" value="Page3"/>

<%@include file="common/header.jspf"%>

<div class="main-content">

	<h1>Favorite Things Exercise</h1>

	<table>
		<tr>
			<th>Favorite Color:  </th>
			<td><c:out value="  ${favorite.color}" /></td>
		</tr>
		<tr>
			<th>Favorite Food:  </th>
			<td><c:out value="  ${favorite.food}" /></td>
		</tr>
		<tr>
			<th>Favorite Season:  </th>
			<td><c:out value="  ${favorite.season}" /></td>
		</tr>
	</table>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jspf" />