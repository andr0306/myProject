<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Реєстрація</h3>
					<form:form action="/register" modelAttribute="userModel">
						<div class="form-group">
							<form:errors path="*" cssClass="error"/>
						</div>
						<div class="form-group">
  							<label class="control-label">Електронна пошта</label>
							<form:input path="email" cssClass="form-control" title="E-mail address" />
											
							<label class="control-label">Пароль</label>
							<form:password path="password" cssClass="form-control" title="Password" />
							
							<label class="control-label">Підтвердіть пароль</label>
							<form:password path="passwordConfirmation" cssClass="form-control" title="Password Confirmation" />
						</div>
						<div class="form-group">
							<span class="input-group-btn">
								<input type="submit" class="btn btn-primary" value="Register">
							</span>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>