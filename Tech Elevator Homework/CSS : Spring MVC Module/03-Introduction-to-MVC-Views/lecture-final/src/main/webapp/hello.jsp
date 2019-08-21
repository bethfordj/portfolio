<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 1 - Example: Hello, Internet!</title>
		<style>
			.red {
				color: red;
			}
			.blue {
				color:blue;
			}
		
		</style>
	</head>
	<body>
		<c:choose>
			<%-- We can reference the values of request parameters
			(e.g. from the query string) by using the "param" map.
			
			Here we are testing to see whether a query string 
			parameter called "name" was provided, and if it wasn't
			(i.e. it's empty) we're defaulting the name to "Internet" --%>
			<c:when test="${empty param.name}">
				<c:set var="name" value="Internet" />
			</c:when>
			<c:otherwise>
				<c:set var="name" value="${param.name}" />
			</c:otherwise>
		</c:choose>
		
		<h1>Hello, ${name}!</h1>
		
		<c:if test="${name != 'Internet'}" >
			<h2>You provided a Name!</h2>
		</c:if>
		
		<c:choose>
			<c:when test="${empty param.lastname}">
				<h2>You didn't tell us your last name</h2>
			</c:when>
			<c:when test="${name == 'John' && param.lastname == 'Fulton'}">
				<h2>It's THE John Fulton</h2>
			</c:when>
			<c:otherwise>
				<h2>Well you're not THE John Fulton, but you'll do</h2>
			</c:otherwise>
		</c:choose>


		<c:set var="fullname" value="${name} ${param.lastname}" />
		<c:set var="count" value="10" />
		<c:if test="${not empty param.count}">
			<c:set var="count" value="${param.count}" />
		</c:if>
		
		<c:forEach begin="1" end="${count}" var="num">
			<c:set var="cssClass" value="blue" />
			<c:if test="${num % 2 == 0}">
				<c:set var="cssClass" value="red" />
			</c:if>
			<h3 class="${cssClass}">${num} : ${fullname}</h3>
		</c:forEach>
		
		
	</body>
</html>