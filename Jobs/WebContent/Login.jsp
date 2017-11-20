<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" uri="/struts-tags"%>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Login.css" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%=java.util.Calendar.getInstance().getTime()%>
	<div id="login_page">

		<tags:if test="hasActionMessages()">
			<div id="error">
				<tags:actionmessage />
			</div>
		</tags:if>

		<tags:if test="hasActionErrors()">
			<div id="error">
				<tags:actionerror />
			</div>
		</tags:if>
		<!-- with struts tags. -->
		<tags:form id="loginForm" action="doLogin">
			<tags:textfield id="loginUser" name="parameterUser" type="text"
				placeholder="User"></tags:textfield>
			<tags:textfield id="loginPass" name="parameterPassword"
				type="password" placeholder="Password"></tags:textfield>
			<tags:submit id="loginSubmitBtn" type="submit" value="Submit!"></tags:submit>

		</tags:form>
		<div id="register_Page">
			<a href="Register.jsp">Sign up</a>
		</div>
		<div id="resetPassword_Page">
			<a href="ResetPassword.jsp">Reset Password</a>
		</div>

	</div>
</body>
</html>