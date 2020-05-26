<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("hello world");
%>
<br><br>
writer :  ${dto.writer } 입니다. <br>
content :  ${dto.content } 입니다. 

</body>
</html>