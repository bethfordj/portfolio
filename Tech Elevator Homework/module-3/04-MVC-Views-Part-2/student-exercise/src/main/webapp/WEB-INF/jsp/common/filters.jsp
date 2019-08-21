<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>
	<ul>
		<li>
			<c:url var="maxPrice" value="${param.baseRoute}">
   			  <c:param name="maxPrice"  value="25" />
			</c:url>
			<a href="${maxPrice}">Under $25</a>
		</li>
		<li>
			<c:url var="minMaxPrice" value="${param.baseRoute}">
   			  <c:param name="minPrice"  value="25" />
   			  <c:param name="maxPrice"  value="50" />
			</c:url>
			<a href="${minMaxPrice}">$25 to $50</a>
		</li>
		<li>
		 	<c:url var="minPrice" value="${param.baseRoute}">
   			  <c:param name="minPrice"  value="50" />
			</c:url>
			<a href="${minPrice}">$50 &amp; Above</a>
		</li>
	</ul>
	<p>Avg. Review</p>
	<ul>
		<li>
			<c:url var="fourUp" value="${param.baseRoute}">
   			  <c:param name="minRating"  value="4" />
			</c:url>
			<a class="rating" href="${fourUp}#">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<c:url var="threeUp" value="${param.baseRoute}">
   			  <c:param name="minRating"  value="3" />
			</c:url>
			<a class="rating" href="${threeUp}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<c:url var="twoUp" value="${param.baseRoute}">
   			  <c:param name="minRating"  value="2" />
			</c:url>
			<a class="rating" href="${twoUp}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<c:url var="oneUp" value="${param.baseRoute}">
   			  <c:param name="minRating"  value="1" />
			</c:url>
			<a class="rating" href="${oneUp}">
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
	</ul>
	<p>Category</p>
	<ul>
		<li>
			<c:url var="Home" value="${param.baseRoute}">
   			  <c:param name="category"  value="Home" />
			</c:url>
			<a href="${Home}">Home</a>
		</li>
		<li>
			<c:url var="Apparel" value="${param.baseRoute}">
   			  <c:param name="category"  value="Apparel" />
			</c:url>
			<a href="${Apparel}">Apparel</a>
		</li>
		<li>
			<c:url var="Jewelry" value="${param.baseRoute}">
   			  <c:param name="category"  value="Jewelry" />
			</c:url>
			<a href="${Jewelry}">Jewelry</a>
		</li>
		<li>
			<c:url var="Garden" value="${param.baseRoute}">
   			  <c:param name="category"  value="Garden" />
			</c:url>
			<a href="${Garden}">Garden</a>
		</li>
	</ul>
</div>
