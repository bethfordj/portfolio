<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="pageTitle" value="Page3"/>

<%@include file="common/header.jspf"%>

<div class="main-content">

	<h1>Favorite Things Exercise</h1>

	<div>
			<c:url var="favURL" value="/FavoriteThings/Page3" />
			<form action="${favURL}" method="POST">
				<label for="season">What is your favorite season?</label>
				<div class="radio-buttons">
					<input type="radio" name="season" value="Spring" checked> Spring
				</div>
				<div class="radio-buttons">
				<input type="radio" name="season" value="Summer" checked> Summer
				</div>
				<div class="radio-buttons">
				<input type="radio" name="season" value="Autumn" checked> Autumn
				</div>
				<div class="radio-buttons">
				<input type="radio" name="season" id="Winter" value="Winter" checked> Winter
				</div>
				<input type="submit" value="Next >>>" />
			</form>
	</div>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jspf" />