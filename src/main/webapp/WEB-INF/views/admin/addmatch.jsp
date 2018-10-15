<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ page contentType="text/html; charset=UTF-8" %>




       <form:form method="POST" action="${pageContext.request.contextPath }" modelAttribute="matchEntity">
        <div id="frm">
             <h4 style="text-align:center">Додати результат</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="concept" class="col-sm-3 control-label">Фк Еліта</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="name" name="name" value="FC Elita">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Противники</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="enemyname" name="enemyname">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Господарі</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="score" name="score">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Гості</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="enemyscore" name="enemyscore">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Дата</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="date" name="date">
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