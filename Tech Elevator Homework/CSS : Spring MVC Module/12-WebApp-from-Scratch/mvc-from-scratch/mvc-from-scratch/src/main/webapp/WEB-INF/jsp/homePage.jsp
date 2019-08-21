<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>MVC From Scratch</title>
	</head>
	<body>
		<h1>Available Items</h1>
		
		<table>
			<tr>
				<th>Slot</th>
				<th>Name</th>
				<th>Price</th>
				<th>Remaining</th>
			</tr>
			
			<c:forEach items="${slots}" var="slotEntry">
			
				<tr>
					<td>
						<form action="<c:url value="/purchase" />" method="POST">
							<input type="hidden" name="slotKey" value="${slotEntry.key}" />
							<input type="submit" value="${slotEntry.key}" />
						</form>
					</td>
					<td><c:out value="${slotEntry.value.item.name}" /></td>
					<td><c:out value="${slotEntry.value.item.price}" /></td>
					<td><c:out value="${slotEntry.value.count}" /></td>
				</tr>
			
		
			</c:forEach>
		
		</table>
		
		<h2>Your balance ${balance}</h2>
		<div>
			<form action="<c:url value="/addMoney" />" method="POST" >
				<label for="amount">Amount to insert</label>
				<input type="number" name="amount" />
				<input type="submit" name="Insert" />
			</form>
		
		</div>

		
	</body>
</html>