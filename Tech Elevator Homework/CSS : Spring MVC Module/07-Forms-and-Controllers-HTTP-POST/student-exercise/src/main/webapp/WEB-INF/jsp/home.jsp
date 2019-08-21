<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="pageTitle" value=""/>

<%@include file="common/header.jspf"%>

<div class="reviews">
	
	<section>
	
		<div class="book-image" >
		
			<img src="<c:url value="/forDummies.png" />" />
		
		</div>
		
		<div class="main-content">
		
			<h2>Squirrel Cigar Parties: The Journey</h2>
			
			<p>The seed of <em>Squirrel Cigar Parties for Dummies</em> was planted on a spring walk with my cousin to one of our favorite book stores. As we crossed the street, a squirrel bounded across in front of us - a tattered cigar hanging from his mouth. As he raced to the nearest tree, another squirrel appeared and dove for the stogie. My cousin and I watched the fight with growing alarm.</p>
			<p>"Two squirrels and 1 cigar - talk about a bad party!"</p>
			<p>Neither of us had any idea how important my cousin's one-line joke would become. From that day on, I found myself drawn again and again to the problem of squirrel cigar parties. The more I researched, the more I realized that poorly planned parties played a significant role in squirrel squabbles.</p>
			<p><em>Squirrel Cigar Parties for Dummies</em> is the result of that obsession and the goal of spreading the word so that fewer squirrels are forced to endure placid parties.</p>
			
		</div>
	
	</section>
	
	<div class="reviews">
	
	<h2>Reviews</h2>
	
	<div class="posts">
		<c:forEach var="review" items="${reviews}">
			<div class="post">
				<p class="review-title"><c:out value="${review.title}" /></p>
				
				<div class="rating">
					<c:choose>
						<c:when test="${review.rating < 1 }">
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
						</c:when>
						<c:when test="${review.rating < 2 }">
							<span class="filled">&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
						</c:when>
						<c:when test="${review.rating < 3 }">
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
						</c:when>
						<c:when test="${review.rating < 4 }">
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span>&#9734;</span>
							<span>&#9734;</span>
						</c:when>
						<c:when test="${review.rating < 5 }">
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span>&#9734;</span>
						</c:when>
						<c:when test="${review.rating < 6 }">
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
							<span class="filled">&#9734;</span>
						</c:when>
					</c:choose>
				</div>
				
				<p>by <c:out value="${review.username} on" /> 
					<fmt:parseDate value="${review.dateSubmitted}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both" />
					<fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${parsedDateTime}" />
				</p>
				<p>
					<c:out value="${review.text}" />
				</p>
			</div>
	
		</c:forEach>
	</div>
	
	</div>
</div>


<%@include file="common/footer.jspf"%>