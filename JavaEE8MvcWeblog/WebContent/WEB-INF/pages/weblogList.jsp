<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>WebLog List</title>
		<style>
			
			#weblogArticles {
				font-family: Arial,Helvetica Neue,Helvetica,sans-serif;
				font-size: 16px;
				margin-left: 30px;
				margin-top: 30px;
				border: 1px solid #000066;
				padding: 2 2 2 2px;
				width: 600px;
				position:relative;
				-webkit-border-radius: 10px;
				-moz-border-radius: 10px;
				border-radius: 10px;

			}	
			
			#weblogArticles h1 {
				background-color: #000066;
				color: white;
				font-size: 1.2em;
				padding: 1 1 1 1px;
				margin-top: 0px;	
				-webkit-border-radius: 5px;
				-moz-border-radius: 5px;
				border-radius: 5px;
				float:left;
				width: 575px;
			}

			#weblogArticles #addButton {
				text-align:center;
				border: 1px solid #000066;
				-webkit-border-radius: 5px;
				-moz-border-radius: 5px;
				border-radius: 5px;
				font-weight:bold;
				font-size: 1.2em;
				margin-left:1px;
				float:right;
				width: 18px;				
			}

			#weblogArticles #addButton a, #weblogArticles #addButton a:hover {
				text-decoration:none;
				color:#000066;
			}	


			#weblogArticles h2 {
				font-size: 1.1em;
				margin-top: 0px;
				margin-bottom: 0px;
			}

			#weblogArticles p {
				margin-top: 0px;
			}
			
		</style>
	</head>
	<body>
		<div id="weblogArticles">
			<div>
				<h1>Weblog Entries</h1>
			</div>
			<div id="addButton">				
				<a href="/weblog/app/entryForm">+</a>
			</div>
			<c:forEach items="${weblogService.all}" var="entry">
				<article>
					<h2>
						[<c:out value="${entry.getLogDateFormatted()}" />]&nbsp;<c:out value="${entry.headline}" />
					</h2>
					<p>
						<c:out value="${entry.logText}" />
					</p>
				</article>
			</c:forEach>
		</div>
	</body>
</html>