<%-- 
    Document   : main
    Created on : Apr 18, 2015, 7:46:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Using GET Method to Read Form Data</title>
</head>
<body>
<center>
<h1>Using GET Method to Read Form Data</h1>
<ul>
<li><p><b>Keyword :</b>
   <%= request.getParameter("keyword")%>
</p></li>
<li><p><b>Kategori 1:</b>
   <%= request.getParameter("K1")%>
   <%= request.getParameter("ValK1")%>
</p></li>
<li><p><b>Kategori 2:</b>
   <%= request.getParameter("K2")%>
   <%= request.getParameter("ValK2")%>
</p></li>
<li><p><b>Mode:</b>
        <%=  request.getParameter("mode")%>
</p></li>
</ul>
</body>
</html>
