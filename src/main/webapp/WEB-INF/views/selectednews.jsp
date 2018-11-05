<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<body>
<div class = "jumbotron">
		<h2 align = "center">${ newsEntity.title}(${ newsEntity.date})</h2>
	</div>
	<div class = "news">
		<div class = "newsl"></div>
		<div class = "newsc">
			<div class = "photol"></div>
			<div class = "photo"><img alt="asdsad" src="/${"resources/images/"}${newsEntity.img}"></div>
			<div class = "photor"></div>
			<div class = "text">${ newsEntity.description}</div>
		</div>
		<div class = "newsr"></div>
			
	</div>
</body>