<%-- 
    Document   : profile
    Created on : 05 6, 15, 4:26:48 PM
    Author     : asi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="home.jsp">Home</a> | <a href="profile.jsp">Profile</a>
        <%
            String username = request.getParameter("username");
        %>
        <h1>Hello <%=session.getAttribute("username")%>!!</h1>
    </body>
</html>
