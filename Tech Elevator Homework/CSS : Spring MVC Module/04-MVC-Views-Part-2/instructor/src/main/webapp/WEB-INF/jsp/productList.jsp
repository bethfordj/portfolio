<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="#">Price - Low to High</a></li>
				<li><a href="#">Price - High to Low</a></li>
				<li><a href="#">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			<c:forEach var="product" items="${products}" >
				<div class="tile ${product.remainingStock == 0 ? 'sold-out' : '' }">
	
					<c:if test="${product.remainingStock > 0 && product.topSeller}">
						<span class="banner top-seller">Top Seller!</span>
					</c:if>
	
					<c:if test="${product.remainingStock < 1}">
						<span class="banner">Sold Out</span>
					</c:if>

			
					<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
					<a class="product-image" href="#"> 
						<img src="<c:url value="/images/product-images/${product.imageName}" />" />
					</a>
					<div class="details">
						<p class="name">${product.name}</p>
	
						<!-- .filled will make the star solid -->
						<div class="rating">
							<c:forEach begin="1" end="5" var="starCnt">
								<span class="${ product.averageRating >= starCnt ? 'filled' : ''  }">&#9734;</span> 
							</c:forEach>
							
							<c:if test="${product.remainingStock > 0 && product.remainingStock < 5}">
								<span class="product-alert">Only <c:out value="${product.remainingStock}" /> left!</span>
							</c:if>
						</div>
						<p class="price"><fmt:formatNumber type="currency" maxIntegerDigits="2" value="${product.price}" /></p>
					</div>
				</div>
			
			</c:forEach>


			<%-- 
				<!-- Include this if the product is considered a Top Seller -->
				<span class="banner top-seller">Top Seller!</span>
				
				<!-- Include this if the remaining quantity is greater than 0, but less than or equal to 5 -->
				<span class="product-alert">Only 4 left!</span>
				
				<!-- Add the .sold-out class if the remaining quantity is 0 -->
				<div class="tile sold-out">
				
				<!-- Include this if the remaining quantity is 0 -->
				<span class="banner">Sold Out</span>
			--%>
				
					

		
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />