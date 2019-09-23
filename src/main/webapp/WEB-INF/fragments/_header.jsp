<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class = "header">
<nav class="navbar navbar-inverse ">
  <div class="container">
    <div class="navbar-header">
     
      <a class="navbar-brand">Fc Fenix</a>
    </div>

    <div class=" navbar-collapse collapse ">
      <ul class="nav navbar-nav ">
        <li><a href="/">Головна<span class="sr-only">(current)</span></a></li>
        
     	<li><a href="${pageContext.request.contextPath}/team">Склад команди</a></li>
     	
        <li><a href="${pageContext.request.contextPath}/news">Новини</a></li>
        
        <li><a href="${pageContext.request.contextPath}/results">Результати</a></li>
        
        
        
        <sec:authorize access="isAuthenticated()">
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Петиції <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/peticion">Переглянути петиції</a></li>
            <li><a href="${pageContext.request.contextPath}/addpeticion">Подати петицію</a></li>
          </ul>
        </li>
         </sec:authorize>
      </ul>
      

      <ul class="nav navbar-nav navbar-right" style="width: 300px;">
			<sec:authorize access="!isAuthenticated()">
		            <li><a href="/login">Логін</a></li>
		            <li class="divider"></li>
		            <li><a href="/register">Реєстрація</a></li>		
		     </sec:authorize>
		     
		     <sec:authorize access="isAuthenticated()">
		     		<sec:authentication property="principal.username" var="username"/>
	     			<li><a href="/admin" id='user'>${username}</a></li>

					<c:url var="logoutUrl" value="/logout" />
					<form:form action="${logoutUrl}" method="post" cssStyle="padding-top: 7px;">
						<li><input class="btn btn-danger" type="submit" value="logout" /></li>
						
					</form:form>
					
			</sec:authorize>
      </ul>
    </div>
  </div>
</nav>
</div>