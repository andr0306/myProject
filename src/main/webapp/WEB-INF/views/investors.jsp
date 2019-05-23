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
                        <th>Номер телефону</th>
                        <th>Країна</th>
                        <th>Місто</th>
                        
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${investorEntity }" var="investorEntity">
                      <tr>
                        <td>${ investorEntity.id}</td>
                        <td>${ investorEntity.firstname}</td>
                        <td>${ investorEntity.lastName}</td>
                        <td>${ investorEntity.age}</td>
                        <td>${ investorEntity.phoneNumber}</td>
                        <td>${ investorEntity.country}</td>
                        <td>${ investorEntity.city}</td>
                       
                        
                        
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