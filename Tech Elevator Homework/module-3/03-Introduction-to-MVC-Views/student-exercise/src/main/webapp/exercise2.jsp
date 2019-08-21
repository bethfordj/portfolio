<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 <c:set var="previousNumber" value="1"/>
			 <c:set var="previousPreviousNumber" value="0"/>
			 <c:set var="interval" value="1" />
			 <c:forEach begin="1" end="25" step="${previousNumber}" var="currentNumber">
				 <c:set var="currentNumber" value="${previousNumber + previousPreviousNumber}" />	
				 <li>${currentNumber}</li>
				 <c:set var="previousPreviousNumber" value="${previousNumber}"/>	 	
			 	<c:set var="previousNumber" value="${currentNumber}"/>
			 </c:forEach>

		</ul>
	</body>
</html>