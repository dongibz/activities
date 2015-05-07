<%-- 
    Document   : profile
    Created on : 05 6, 15, 4:26:48 PM
    Author     : asi
--%>


<%
    response.setHeader("Cache-Control","no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);

    if(session.getAttribute("username")!=null)
    {    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="home.jsp">Home</a> | <a href="profile.jsp">Profile</a> | <a href="LogoutServlet">Log-out</a>
        <%
            String username = request.getParameter("username");
        %>
        <h1>Hello <%=session.getAttribute("username")%>!!</h1>
    </body>
</html>
<%
    }else{
        response.sendRedirect("index.html");
        }
%>
