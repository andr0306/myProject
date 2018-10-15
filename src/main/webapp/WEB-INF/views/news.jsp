<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body>
<div class = "jumbotron">
		<h2 align = "center"> Новини команди</h2>
	</div>

<div class="blog-section paddingTB60 ">
<div class="container">
	<div class="row">
		
	</div>
	<c:forEach items = "${newsEntity}" var="newsEntity">
	
	
			<div>
	      <div class="col-md-4"><a href="/${newsEntity.id}/shownews" class="thumbnail">
	      <img src="${pageContext.request.contextPath}${"resources/images/qweqwe.jpg"}" alt="Image" style="max-width:100%;">
	      <p align="center" class="team">${ newsEntity.title}</p>
	      <p align="center"class="team">${ newsEntity.date}</p>
	      </a>
	      </div>
                	</div>	
						
			
    
     </c:forEach>
     
     
</div>

</div>
</body>
