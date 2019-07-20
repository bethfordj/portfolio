<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="common/header.jsp" />



<div>
	<c:url var="page1Url" value="/" />
	<form:form action="${page1Url}" method="POST" modelAttribute="page1">
		<input type="text" placeholder="Search for a Business.."><button type="submit"><i class="fa fa-search"></i></button>
		<
	







	</form:form>



</div>







			<%--  ending div for the directory --%>
			</div>
		<%--  ending div for main-grid --%>
		</div>

	<%--  ending div for floating-content --%>
	</div>
	
	<c:import url="common/footer.jsp" />