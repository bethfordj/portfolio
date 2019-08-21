<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h1>Step One: What is the name of the City?</h1>

<c:url var="stepOnePostUrl" value="/addCity/stepOne" />

<form action="${stepOnePostUrl}" method="POST">
	<input type="text" name="name" />
	<input type="submit" value="Next >>" />
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />