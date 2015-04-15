<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="java.io.*,java.util.*" %>
<html> 
<head><title>Hello World</title></head> 

<body> 
	Hello World!<br/> 
	<% out.println("Your IP address is " + request.getRemoteAddr()); %> 
</body> 
</html>