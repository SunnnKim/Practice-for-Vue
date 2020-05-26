<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String contextPath = (String)request.getContextPath();%>

<form action="<%=contextPath%>/create">
작성자	: <input type="text" name="writer" value="${dto.writer }">
이름		:   <input type="text" name="content" value="${dto.content }">
<input type="submit" value="완료">
</form>

</body>
</html>