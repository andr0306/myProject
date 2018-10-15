<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>



<body>
<div class = "jumbotron">
		<h2 align = "center">Результати команди</h2>
	</div>

<div class="container" >
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              
              <div class="panel-body ">
                  <table class="table table-striped table-hover" >
                    <thead class='table-head'>
                     
                    </thead>
                    <tbody>
                    <c:forEach items = "${matchEntity }" var="matchEntity">
                      <tr>
                        <td>${ matchEntity.date}</td>
                        <td>${ matchEntity.name}</td>
                        <td>${ matchEntity.score}</td>
                        <td>-</td>
                        <td>${ matchEntity.enemyscore}</td>
                        <td>${ matchEntity.enemyname}</td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>    	
              </div>
            </div>
            
    	</div>
    	
	</div>
</div>
</body>