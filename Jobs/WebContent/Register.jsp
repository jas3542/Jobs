<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>	
	<tags:form id="registerForm" action="doRegister">
		<tags:textfield id="registerUser" name="parameterUser" type="text" placeholder="User"> </tags:textfield>
		<tags:textfield id="registerPass" name="parameterPassword"	type="password" placeholder="Password"> </tags:textfield>
		<tags:textfield id="registerConfirmPass" name="parameterConfirmPassword" type="password" placeholder="Confirm Password"> </tags:textfield>
		<tags:textfield id="registerEmail" name="parameterEmail"	type="text" placeholder="Email" > </tags:textfield>
		<tags:submit id="registerSubmitBtn" type="submit" value="Sign Up" > </tags:submit>
	</tags:form>
	
</body>
</html>