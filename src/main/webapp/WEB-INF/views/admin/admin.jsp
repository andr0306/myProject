<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ page contentType="text/html; charset=UTF-8" %>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div id="list">
        <div>
            <ul class="nav nav-pills nav-stacked">
               <li class="dropdown">
        	 <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-bar-chart-o fa-fw"></i>Головна</a></li>
          	<li><a href="${pageContext.request.contextPath}/admin/teamlist"><i class="fa fa-bar-chart-o fa-fw"></i>Склад</a></li>
          	
            <li><a href="${pageContext.request.contextPath}/admin/matchlist"><i class="fa fa-table fa-fw"></i> Результати</a></li>
            
            <li><a href="${pageContext.request.contextPath}/admin/newslist"><i class="fa fa-calendar fa-fw"></i>Список новин</a></li>
            <li><a href="${pageContext.request.contextPath}/admin/addteam"><i class="fa fa-pencil fa-fw"></i>Редагувати склад</a></li>
             
            <li><a href="${pageContext.request.contextPath}/admin/addmatch"><i class="fa fa-book fa-fw"></i>Додати результат</a></li>
                  
            <li><a href="${pageContext.request.contextPath}/admin/addnews"><i class="fa fa-cogs fa-fw"></i>Додати новину</a></li>
             
            </ul>
        </div>
    </div>
</div>

<style>
#list{
		margin:auto;
		margin-left:500px";
		
	}
	
	li{
	text-align:center;
	}
	
	.dropdown-menu{
		text-align:center;
		width:50%;
		margin-left:25%;
	}
</style>