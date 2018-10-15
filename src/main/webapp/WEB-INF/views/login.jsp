<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					
					<c:if test="${param.fail}">
						<div style="color: red;" class="text-center">
							Неправильний логін або пароль
						</div>
					</c:if>	
					
					<form:form action="/login" method="POST">
						<fieldset>
							<legend>Логін</legend>
							
							<div class="form-group">
	  							<label class="control-label">Електронна пошта</label>
								<input name="email" type="email" class="form-control" title="E-mail address" />
								
								<label class="control-label">Пароль</label>
								<input name="password" type="password" class="form-control" title="Password" />
								
								<div class="col-sm-10">
									<div class="checkbox">
										<label><input type="checkbox" name="rememberMe"/> Запамятати</label>
									</div>
								</div>
							</div>
														
							<div class="form-group">
								<span class="input-group-btn">
									<input type="submit" class="btn btn-primary btn-block">
								</span>
							</div>
						</fieldset>
					</form:form>
				</div>
			</div>

			<div class="already">
				<p>У Вас досі немає аккунта?
					<a href="${pageContext.request.contextPath}/register">Реєстація</a>
				</p>
			</div>
		</div>
	</div>
</div>