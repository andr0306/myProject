<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ page contentType="text/html; charset=UTF-8" %>



       <form:form method="POST" action="${pageContext.request.contextPath }/admin/${teamEntity.id }/editteam" modelAttribute="teamEntity">
        <div id="frm">
             <h4 style="text-align:center">Редагувати склад:</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="concept" class="col-sm-3 control-label">Імя</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="firstname" name="firstname" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Прізвище</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="lastname" name="lastname">
                        </div>
                    </div> 
                     <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Фото</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="img" name="img">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Вік</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="age" name="age">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Позиція</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="position" name="position">
                        </div>
                          <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Опис</label>
                        <div class="col-sm-9">
                            <textarea rows="3" cols="58" id="description" name="description"></textarea>
                        </div>
                    </div>
                     
                    <div class="form-group">
                        <div class="col-sm-12 text-right">
                            <button type="submit" class="btn btn-default preview-add-button">
                                <span class="glyphicon glyphicon-plus"></span> Додати
                            </button>
                             <a href="/admin" class="btn btn-success btn-product"> Назад</a>
                        </div>
                    </div>
                    
                </div>
            </div>            
        </div>
        </form:form>
        
        <style>
        	#frm{
        	width: 60%;
        	margin:auto;
        	}
        </style>