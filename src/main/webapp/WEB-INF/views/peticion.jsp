<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="<c:url value="/resources/js/1.js" />" defer></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body style="text-align:center">
<div class = "jumbotron">
		<h2 align = "center">Петиції</h2>
	</div>
	<c:forEach items = "${peticionEntity}" var="peticionEntity">
	<div class="pet">
		<div class="pettitle">${peticionEntity.title}</div>
		<div class="petauthor">${peticionEntity.firstname} ${peticionEntity.lastname}</div>

		<div class="petcontent">${peticionEntity.description}</div>

		<div class="petrate">
          <span id ="dislike" class="glyphicon glyphicon-thumbs-down"></span>
        <p id="rating">0</p>
          <span id ="like" class="glyphicon glyphicon-thumbs-up"></span>
      </div>
		
	</div>
	</c:forEach>
	
	</body>