<html>
	<head>
		<title>WebLog Entry Form</title>
		<style>
			
			body {
				font-family: Arial,Helvetica Neue,Helvetica,sans-serif;
				font-size: 16px;

			}	

			#weblogEntryList {
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

			#weblogEntryList h1 {
				background-color: #000066;
				color: white;
				font-size: 1.2em;
				padding: 1 1 1 1px;
				margin-top: 0px;	
				-webkit-border-radius: 5px;
				-moz-border-radius: 5px;
				border-radius: 5px;
				float:left;
				width: 558px;
			}

			#weblogEntryList #backButton {
				text-align:center;
				border: 1px solid #000066;
				-webkit-border-radius: 5px;
				-moz-border-radius: 5px;
				border-radius: 5px;
				font-weight:bold;
				font-size: 1.2em;
				margin-left:1px;
				float:right;
				width: 35px;				
			}

			#weblogEntryList #backButton a, #weblogEntryList #backButton a:hover {
				text-decoration:none;
				color:#000066;
			}	

			input[type="submit"] {
				color:white;
				background-color: #000066;
				border: 1px solid #000066;
				-webkit-border-radius: 5px;
				-moz-border-radius: 5px;
				border-radius: 5px;
			}

			input[type="submit"]:hover {
				background-color:#0B0B3B;
			}
		</style>
	</head>
	<body>
		<div id="weblogEntryList">
			<form action="/weblog/app/entryForm" method="POST">
				<div>				
					<h1>Weblog Entry Form</h1>
				</div>
				<div id="backButton">
					<a href="/weblog/app/weblogList"><<</a>
				</div>
				<label for="headline">Headline:</label>
				<br>
				<input type="text" name="headline" style="width: 580px">
				<br><br>
				<label for="logText">Log Text:</label>
				<br>				
				<textarea rows="10" cols="80" name="logText"></textarea>
				<br />
				<div style="text-align:right; margin-top: 20px; padding-right:20px;">
					<input type="submit" value="Save" />
				</div>
			</form>
		</div>
	</body>
</html>