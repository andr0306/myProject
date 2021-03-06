
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="<c:url value="/resources/js/1.js"  />"defer></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body>
	
	<div class = "jumbotron">
		<h2 align = "center">  Офіційний склад FC Elita</h2>
	</div>
    <div class="container">
        <div class="row text-center">
            <div class="col-md-12">
                
                <div class="divider-line text-center"></div>
            </div>
        </div>
        <c:forEach items = "${teamEntity}" var="teamEntity">        
            <div class="col-md-4" >
                <div class="team-box" >
                <div class="team-img">
                    <img src="${pageContext.request.contextPath}${"resources/images/"}${teamEntity.img}">
                </div>
                <div class="team-title" >
                    <h3 align = "center">Ім'я: ${ teamEntity.firstname} ${ teamEntity.lastname} </h3>
                    <h4 align = "center">Вік: ${ teamEntity.age}</h4>
                    <h4 align = "center">Позиція: ${ teamEntity.position}</h4>
                    <h4 align = "center">Номер: ${ teamEntity.rating}</h4>
                    
               	 </div>
           		 </div>           
            </div>
         </c:forEach>
    </div>
    
</body>