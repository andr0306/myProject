<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="container">
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              <div class="panel-heading">
                <h3 class="panel-title text-center">Результати</h3>
              </div>
              <div class="panel-body ">
                  <table class="table table-striped table-hover">
                    <thead class='table-head'>
                      <tr class='table-head'>
                     	 <th>Номер</th>
                        <th>Фк Еліта</th>
                        <th>Противник</th>
                        <th>Господарі</th>
                        <th>Гості</th>
                        <th>Редагувати</th>
                        <th>Видалити</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${matchEntityList }" var="matchEntity">
                      <tr>
                        <td>${ matchEntity.id}</td>
                        <td>${ matchEntity.name}</td>
                        <td>${ matchEntity.enemyname}</td>
                        <td>${ matchEntity.score}</td>
                        <td>${ matchEntity.enemyscore}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${matchEntity.id}/editmatch">Редагувати</a></td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${matchEntity.id}/delete">Видалити</a></td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>    	
              </div>
            </div>
            <a href="/admin/addmatch" class="btn btn-success btn-product"> Назад</a>
            <a href="/admin/" class="btn btn-success btn-product"> Меню</a>
    	</div>
	</div>
</div>