<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>City Search Results</title>
	</head>
	<body>
		<h1>Cities in country code ${param.countryCode}</h1>
		
		<ul>
		<c:forEach var="city" items="${cities}">
			<li><c:out value="${city.name}" /></li>
		</c:forEach>
		</ul>
	
	</body>

</html>