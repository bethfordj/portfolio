<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="pageTitle" value="Page1"/>

<%@include file="common/header.jspf"%>

<div class="main-content">

	<h1>Favorite Things Exercise</h1>

	<div>
			<c:url var="favURL" value="/FavoriteThings/Page1" />
			<form action="${favURL}" method="POST">
				<label for="color">What is your favorite color?</label>
				<input type="text" name="color" /> 
				<input type="submit" value="Next >>>" />
			</form>
	</div>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jspf" />