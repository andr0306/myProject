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
                        <th>Номер</th>
                        <th>Редагувати</th>
                        <th>Видалити</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${teamU21EntityList }" var="teamU21Entity">
                      <tr>
                        <td>${ teamU21Entity.id}</td>
                        <td>${ teamU21Entity.firstname}</td>
                        <td>${ teamU21Entity.lastname}</td>
                        <td>${ teamU21Entity.age}</td>
                        <td>${ teamU21Entity.position}</td>
                        <td>${ teamU21Entity.rating}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${teamU21Entity.id}/editteamU21">Редагувати</a></td>
                         <td><a href = "${pageContext.request.contextPath }/admin/${teamU21Entity.id}/deleteplayerU21">Видалити</a></td>
                        
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