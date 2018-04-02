<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!doctype html>
<html lang="en-US">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>index</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>		
			<form enctype="application/x-www-form-urlencoded" action="j_security_check" method="POST">
				<input type="text" id="j_username" name="j_username" placeholder="user id"/>
				<input type="password" id="j_password" name="j_password" placeholder="password"/>
				<input type="submit" />
			</form>
			</body>
</html>