<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tags" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-1 URL='JobsAction.action'">
<title>Jobs</title>
</head>
<body>
	<h1>hi jobs</h1>
	<h2>Attribute of the Login Action Class:</h2>
	<tags:property value="returnData" />
	<tags:property value="result" />

	<tags:textfield id="jobSercher" name="parameterJobSearch" type="text"
		placeholder="Job Search"></tags:textfield>
</body>
</html>