<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="container">
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              <div class="panel-heading">
                <h3 class="panel-title text-center">Команда</h3>
              </div>
              <div class="panel-body ">
                  <table class="table table-striped table-hover">
                    <thead class='table-head'>
                      <tr class='table-head'>
                     	 <th>ID</th>
                        <th>Імя</th>
                        <th>Прізвище</th>
                        <th>Вік</th>
                        <th>Позиція</th>
                        <th>Опис</th>
                        <th>Редагувати</th>
                        <th>Видалити</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${teamEntityList }" var="teamEntity">
                      <tr>
                        <td>${ teamEntity.id}</td>
                        <td>${ teamEntity.firstname}</td>
                        <td>${ teamEntity.lastname}</td>
                        <td>${ teamEntity.age}</td>
                        <td>${ teamEntity.position}</td>
                        <td>${ teamEntity.description}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${teamEntity.id}/editteam">Редагувати</a></td>
                         <td><a href = "${pageContext.request.contextPath }/admin/${teamEntity.id}/deleteplayer">Видалити</a></td>
                        
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>    	
              </div>
            </div>
            <a href="/admin/addteam" class="btn btn-success btn-product"> Назад</a>
            <a href="/admin/" class="btn btn-success btn-product"> Меню</a>
    	</div>
	</div>
</div>