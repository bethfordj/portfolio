<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h1>Step Two: What is the population?</h1>

<c:url var="stepPostUrl" value="/addCity/stepThree" />

<form action="${stepPostUrl}" method="POST">
	<input type="number" name="population" />
	<input type="submit" value="Next >>" />
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />