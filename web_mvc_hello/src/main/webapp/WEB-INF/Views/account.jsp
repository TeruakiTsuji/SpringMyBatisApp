<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Hello Spring Framework</title>
</head>
<body>
<h1>Hello Spring Framework [${welcomeTitle}]</h1>
<hr/>
Account List<br/>
<table>
	<tr>
		<th>ログインID</th>
		<th>名前</th>
		<th>ロールID</th>
	</tr>
	<c:forEach var="account" items="${accounts}">
	<tr>
		<td>${account.loginid}</td>
		<td>${account.name}</td>
		<td>${account.roleid}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>