<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>





       <form:form method="POST" action="${pageContext.request.contextPath }" modelAttribute="investorEntity">
        <div id="frm">
             <h4 style="text-align:center">Стати інвестором</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="concept" class="col-sm-3 control-label">Імя</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="firstname" name="firstname">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Прізвище</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="lastName" name="lastName">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Вік</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="age" name="age">
                        </div> 
                       </div>
                   
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Номер телефону</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Країна</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="country" name="country">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Місто</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="city" name="city">
                        </div>
                    </div> 
                               
                    <div class="form-group">
                        <div class="col-sm-12 text-right">
                            <button type="submit" class="btn btn-default preview-add-button">
                                <span class="glyphicon glyphicon-plus"></span> Додати
                            </button>
                             <a href="/" class="btn btn-success btn-product"> Назад</a>
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