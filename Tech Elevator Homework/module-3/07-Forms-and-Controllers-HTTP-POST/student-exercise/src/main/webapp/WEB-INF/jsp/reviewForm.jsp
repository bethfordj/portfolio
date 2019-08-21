<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="pageTitle" value=" - Add a Review!"/>

<%@include file="common/header.jspf"%>

<section>

	<div class="book-image" >
	
		<img src="<c:url value="/forDummies.png" />" />
	
	</div>

	<div class="main-content">
	
	<h2>Review Form</h2>
	
		<c:url var="newReview" value="/review" />
		<form action="${newReview}" method="POST">
			<label for="username">Username:</label>
			<input type="text" name="username" /> 
			<label for="rating">Rating:</label>
			<select name="rating">
				  <option value="5">5 Stars</option>
				  <option value="4">4 Stars</option>
				  <option value="3">3 Stars</option>
				  <option value="2">2 Stars</option>
				  <option value="1">1 Star</option>
			</select>
			<label for="title">Review Title:</label>
			<input type="text" name="title" /> 
			<label for="text">Write your review here:</label>
			<textarea name="text"></textarea> 
			<input type="submit" value="Submit" />
		</form>
		
	</div>

</section>






<%@include file="common/footer.jspf"%>