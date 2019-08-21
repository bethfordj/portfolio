<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>City Search</title>
	</head>
	<body>
		<h1>City Search</h1>
		
		<c:url var="citySearchUrl" value="/cities" />
		
		<form action="${citySearchUrl}" method="GET">
			<label for ="countryCode">Country Code:</label>
			<input type="text" name="countryCode" />	
			<input type="submit" value="Search" />
		</form>
	
	
	</body>
</html>