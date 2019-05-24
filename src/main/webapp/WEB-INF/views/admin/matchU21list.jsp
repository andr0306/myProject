<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="container">
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              <div class="panel-heading">
                <h3 class="panel-title text-center">РезультатиU21</h3>
              </div>
              <div class="panel-body ">
                  <table class="table table-striped table-hover">
                    <thead class='table-head'>
                      <tr class='table-head'>
                     	 <th>Номер</th>
                        <th>Команда</th>
                        <th>Противник</th>
                        <th>Господарі</th>
                        <th>Гості</th>
                        <th>Редагувати</th>
                        <th>Видалити</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${matchU21EntityList }" var="matchU21Entity">
                      <tr>
                        <td>${ matchU21Entity.id}</td>
                        <td>${ matchU21Entity.name}</td>
                        <td>${ matchU21Entity.enemyname}</td>
                        <td>${ matchU21Entity.score}</td>
                        <td>${ matchU21Entity.enemyscore}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${matchU21Entity.id}/editmatchU21">Редагувати</a></td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${matchU21Entity.id}/deleteU21">Видалити</a></td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>    	
              </div>
            </div>
            <a href="/admin/addmatchU21" class="btn btn-success btn-product"> Назад</a>
            <a href="/admin/" class="btn btn-success btn-product"> Меню</a>
    	</div>
	</div>
</div>