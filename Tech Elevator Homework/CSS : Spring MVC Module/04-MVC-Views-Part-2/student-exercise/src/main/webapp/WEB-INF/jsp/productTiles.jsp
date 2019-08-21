<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products/tiles" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->
		<c:forEach var="products" items="${products}">
		<c:set var="products" value="${products}" scope="request" />
		
				<c:url var="detailPage" value="/products/detail">
   					  <c:param name="id"  value="${products.id}" />
				</c:url>
		<!-- Standard Product -->
					<c:choose>
					<c:when test="${products.remainingStock == 0 && products.topSeller == true}">
						<!-- Add the .sold-out class if the remaining quantity is 0 -->
						<div class="tile sold-out top-seller">
							<!-- Include this if the remaining quantity is 0 -->
							<span class="banner">Sold Out</span>
							<span class="banner top-seller">Top Seller!</span>

							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="${detailPage}"> <img
								src="<c:url value="/images/product-images/${products.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">
									<c:out value="${products.name}" />
								</p>

								<c:import url="/WEB-INF/jsp/rating.jsp" />

								<p class="price">
									<fmt:setLocale value="en_US" />
									<fmt:formatNumber value='${products.price}' type='currency' />
								</p>
							</div>
						</div>

					</c:when>
					<c:when test="${products.remainingStock == 0 && products.topSeller == false}">
						<!-- Add the .sold-out class if the remaining quantity is 0 -->
						<div class="tile sold-out">
							<!-- Include this if the remaining quantity is 0 -->
							<span class="banner">Sold Out</span>

							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="${detailPage}"> <img
								src="<c:url value="/images/product-images/${products.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">
									<c:out value="${products.name}" />
								</p>

								<c:import url="/WEB-INF/jsp/rating.jsp" />

								<p class="price">
									<fmt:setLocale value="en_US" />
									<fmt:formatNumber value='${products.price}' type='currency' />
								</p>
							</div>
						</div>

					</c:when>
					<c:when test="${products.remainingStock > 0 && products.topSeller == true}">
						<!-- Add the .sold-out class if the remaining quantity is 0 -->
						<div class="tile top-seller">
							
							<span class="banner top-seller">Top Seller!</span>

							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="${detailPage}"> <img
								src="<c:url value="/images/product-images/${products.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">
									<c:out value="${products.name}" />
								</p>

								<c:import url="/WEB-INF/jsp/rating.jsp" />

								<p class="price">
									<fmt:setLocale value="en_US" />
									<fmt:formatNumber value='${products.price}' type='currency' />
								</p>
							</div>
						</div>

					</c:when>
					<c:otherwise>
						<div class="tile ">

							<a class="product-image" href="${detailPage}"> <img
								src="<c:url value="/images/product-images/${products.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">
									<c:out value="${products.name}" />
								</p>

								<c:import url="/WEB-INF/jsp/rating.jsp" />


								<c:if
									test="${products.remainingStock > 0 && products.remainingStock <=5}">
									<span class="product-alert">Only <c:out
											value="${products.remainingStock}" /> left!
									</span>
								</c:if>

								<p class="price">
									<fmt:setLocale value="en_US" />
									<fmt:formatNumber value='${products.price}' type='currency' />
								</p>

							</div>
						</div>
					</c:otherwise>
				</c:choose>
		</c:forEach>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />