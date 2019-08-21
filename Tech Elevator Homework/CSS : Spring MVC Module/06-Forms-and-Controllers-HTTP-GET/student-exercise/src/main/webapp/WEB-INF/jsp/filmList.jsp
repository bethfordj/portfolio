<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>



<div id="main-content">

	<div>

		<c:url var="allFilms" value="/FilmSearchResults" />
		<form action="${allFilms}" method="GET">
			<label for="minLength">Minimum Length:</label>
			<input type="text" name="minLength" /> 
			<label for="maxLength">Maximum Length:</label>
			<input type="text" name="maxLength" /> 
			<label for="genre">Genre:</label>
			<select name="genre">
				  <option value="Action">Action</option>
				  <option value="Animation">Animation</option>
				  <option value="Children">Children</option>
				  <option value="Classics">Classics</option>
				  <option value="Comedy">Comedy</option>
				  <option value="Documentary">Documentary</option>
				  <option value="Drama">Drama</option>
				  <option value="Family">Family</option>
				  <option value="Foreign">Foreign</option>
				  <option value="Games">Games</option>
				  <option value="Horror">Horror</option>
				  <option value="Music">Music</option>
				  <option value="New">New</option>
				  <option value="Sci-Fi">Sci-Fi</option> 
				  <option value="Sports">Sports</option>
				  <option value="Travel">Travel</option>
			</select>
			<input type="submit" value="Submit" />
		</form>
		
	</div>

	<table class="table">
	
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Release Year</th>
			<th>Length</th>
			<th>Rating</th>
		</tr>
		
		<c:forEach var="film" items="${films}">
			<tr>
				<td><c:out value="${film.title}" /></td>
				<td><c:out value="${film.description}" /></td>
				<td><c:out value="${film.releaseYear}" /></td>
				<td><c:out value="${film.length}" /></td>
				<td><c:out value="${film.rating}" /></td>
			</tr>
		</c:forEach>
		
	</table>

</div>


<%@include file="common/footer.jspf"%>