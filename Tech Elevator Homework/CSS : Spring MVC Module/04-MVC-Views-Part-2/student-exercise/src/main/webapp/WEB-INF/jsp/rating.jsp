<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="rating">
	<c:choose>
		<c:when test="${products.averageRating < 1 }">
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
		</c:when>
		<c:when test="${products.averageRating < 2 }">
			<span class="filled">&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
		</c:when>
		<c:when test="${products.averageRating < 3 }">
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
		</c:when>
		<c:when test="${products.averageRating < 4 }">
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span>&#9734;</span>
			<span>&#9734;</span>
		</c:when>
		<c:when test="${products.averageRating < 5 }">
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span>&#9734;</span>
		</c:when>
		<c:when test="${products.averageRating < 6 }">
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
			<span class="filled">&#9734;</span>
		</c:when>
	</c:choose>
</div>