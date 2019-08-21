<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="pageTitle" value="Page2"/>

<%@include file="common/header.jspf"%>

<div class="main-content">

	<h1>Favorite Things Exercise</h1>

	<div>
			<c:url var="favURL" value="/FavoriteThings/Page2" />
			<form action="${favURL}" method="POST">
				<label for="food">What is your favorite food?</label>
				<input type="text" name="food" /> 
				<input type="submit" value="Next >>>" />
			</form>
	</div>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jspf" />