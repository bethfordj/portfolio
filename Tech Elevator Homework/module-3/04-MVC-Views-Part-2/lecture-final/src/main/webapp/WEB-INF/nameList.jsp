<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<ol>
			<c:forEach var="name" items="${requestScope.nameList}">
				<li>${name}</li>
			</c:forEach>
		</ol>
		
		<h2>${nameList[2]} is the 3rd name in the list</h2>
		
		<h2>A herd of lions is called a ${herds.Lion}</h2>
		<h2>A herd of rhinos is called a ${herds.Rhino}</h2>
		
		
		<c:forEach var="entry" items="${herds}">
			${entry.key} : ${entry.value}
		</c:forEach>
		
	</body>
</html>