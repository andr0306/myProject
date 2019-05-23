<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class = "header">
<nav class="navbar navbar-inverse ">
  <div class="container">
    <div class="navbar-header">
     
      <a class="navbar-brand">Fc Elita</a>
    </div>

    <div class=" navbar-collapse collapse ">
      <ul class="nav navbar-nav ">
        <li><a href="/">Головна<span class="sr-only">(current)</span></a></li>
     <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Склад команди <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/team">Основа</a></li>
            <li><a href="${pageContext.request.contextPath}/teamU21">U21</a></li>
          </ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/news">Новини</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Результати <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/results">Основа</a></li>
            <li><a href="${pageContext.request.contextPath}/resultsU21">U21</a></li>
          </ul>
        </li>
        
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Петиції <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/peticion">Переглянути петиції</a></li>
            <li><a href="${pageContext.request.contextPath}/addpeticion">Подати петицію</a></li>
          </ul>
        </li>
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Інвестори <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/investors">Cписок інвесторів</a></li>
            <li><a href="${pageContext.request.contextPath}/addinvestor">Стати інвестором</a></li>
          </ul>
        </li>
      </ul>
      

      <ul class="nav navbar-nav navbar-right" style="width: 300px;">
			<sec:authorize access="!isAuthenticated()">
		            <li><a href="/login">Логін</a></li>
		            <li class="divider"></li>
		            <li><a href="/register">Реєстрація</a></li>		
		     </sec:authorize>
		     
		     <sec:authorize access="isAuthenticated()">
		     		<sec:authentication property="principal.username" var="username"/>
	     			<li><a href="/admin">${username}</a></li>

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