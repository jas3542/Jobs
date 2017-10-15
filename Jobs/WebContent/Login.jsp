<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" uri="/struts-tags"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/Login.css" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%=java.util.Calendar.getInstance().getTime()%>
	<div id="login_page">
	
		
			<!-- with struts tags. -->
			<tags:form class="LoginForm" action="doLogin">
				<span class="LoginSpan"> </span>
					<tags:textfield id="LoginUser" name="parameterUser" type="text" placeholder="User" ></tags:textfield>
					<tags:textfield id="LoginPass" name="parameterPassword" type="password" placeholder="Password"></tags:textfield>
					<tags:submit id="LoginSubmitBtn" type="submit" value="Submit!" ></tags:submit>
				
			</tags:form>
		
	</div>
</body>
</html>