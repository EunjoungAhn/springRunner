<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello, Spring Web Application</title>
<style type="text/css">
	html, body {height: 100%;}
	html {display: table; width: 100%;}
	body {display: table-cell; text-align: center; vertical-align: middle;}
</style>
</head>
<body>
	<h2>${hello.name} �� �ȳ��ϼ���.</h2>
	<p>���� �ð��� <spring:eval expression="hello.currentDatetime"/> �Դϴ�. </p>
</body>
</html>