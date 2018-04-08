<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String ctx = request.getContextPath();
	request.setAttribute("ctx", ctx);
	String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()+ "/";
	request.setAttribute("base", base);
	
%>
<base href="${ base }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="flow" method="post">
		data<input type="text" name="data">
		sender_name<input type="text" name="sender_name">
		flowType<input type="text" name="flowType">
		subject<input type="text" name="subject">
		<input type="submit" value="提交">
	</form>
</body>
</html>