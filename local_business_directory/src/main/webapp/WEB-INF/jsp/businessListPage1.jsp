<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="common/header.jsp" />

<div id="site-blurb">
	<h3>About the Directory</h3>
	<p>Welcome to my Local Business Directory for Columbus, Ohio, and its greater metropolitan area!</p>
	<p>To be included in this listing, the businesses must be independently owned and operated - not part of a chain or franchise. Larger businesses or corporations will only be included if the listing is for their main headquarters (which is in Columbus, Ohio).</p>
	<p>As you may expect, this is an ongoing project and will take some time to complete. I will continue to update as I gather more business information, but there is no deadline in sight at the moment.</p>
</div>

<div class="directory">

	<h2>Columbus Businesses</h2>

	<div id="tile-background">	
	
		<c:url var="page1Url" value="/" />
		<form:form action="${page1Url}" method="POST" modelAttribute="page1">

			<input type="text" placeholder="Search for a Business..">
			
			<div>
				<label path="busFilter">Search By</label>
				<select path="busFilter">
					<option value="cityName">City Name</option>
					<option value="zipCode">Zipcode</option>
					<option value="type">Type of Business</option>
					<option value="name">Name</option>
					<option value="rating">Rating</option>
				</select>
			</div>
	
			<div>
			<label path="sortOrder">Sort By</label>
			<select path="sortOrder">
				<option value="GeneralType">General Type</option>
				<option value="RatingHighToLow">Rating: High-to-Low</option>
				<option value="RatingLowToHigh">Rating: Low-to-High</option>
			</select>
			</div>
			
			<button type="submit" id="main-submit-button">Search <i class="fa fa-search"></i></button>
		</form:form>
		
			<c:import url="/WEB-INF/jsp/businessTile.jsp" />
			
	</div>
	
	
	
	
	
	

			<%--  ending div for the directory --%>
			</div>
		<%--  ending div for main-grid --%>
		</div>

	<%--  ending div for floating-content --%>
	</div>
	
	<c:import url="common/footer.jsp" />