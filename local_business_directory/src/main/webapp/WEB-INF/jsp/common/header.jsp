<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>A directory of local businesses in Columbus, Ohio, and its greater metropolitan area (AKA cbus).</title>
<link href="https://fonts.googleapis.com/css?family=Antic"
	rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=Give+You+Glory"
	rel="stylesheet" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<c:url var="cssUrl" value="/css/site.css" />
<link rel="stylesheet" href="${cssUrl}">
</head>

<body>
	<nav>
		<ul>
			<c:url var="allBusinessesUrl" value="/" />
			<li><a href="${allBusinessesUrl}">Directory Home</a></li>
			<li id="diamond">&#9830;</li>
			<c:url var="liveCbus" value="https://www.livecolumbusoh.com/" />
			<li><a href="${liveCbus}">Back to Live Columbus</a></li>
			
		</ul>
	</nav>
	
	<div class="floating-content">
		<h1 id="page-title">Local Business Directory</h1>
		<nav>
			<ul>
				<c:url var="allBusinessesUrl" value="/" />
				<li><a href="${allBusinessesUrl}">Map</a></li>
				<li><a href="${allBusinessesUrl}/tiles">Grid</a></li>
			</ul>
		</nav>
		
		<div class="main-grid">
		

			
	
	

