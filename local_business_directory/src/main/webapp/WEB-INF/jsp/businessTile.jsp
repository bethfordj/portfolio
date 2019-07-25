<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:forEach var="business" items="${businessList}">
	<div class="tile">
		<c:set var="address" value="${business.address}" />
		<h3>${business.businessName}</h3>
		<c:if test="${business.slogan} != null">
			<p id="slogan">${business.slogan}</p>
		</c:if>
		<div class="address">
			<p id="subtitle">Address:</p>
			<p>${address.street1}</p>
			<p>${address.city},OH, ${address.zipCode}</p>
		</div>
	</div>

</c:forEach>