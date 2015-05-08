<%-- 
    Document   : user
    Created on : 05 8, 15, 3:39:22 PM
    Author     : asi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add/Edit</title>
    </head>
    <body>
         <a href="home.jsp">Home</a> | <a href="profile.jsp">Profile</a> | <a href="LogoutServlet">Log-out</a>
        <%
            String username = request.getParameter("username");
        %>
        <h1>Hello <%=session.getAttribute("username")%>!!</h1>
        <form method="POST" action="UpdateServlet">
            <%
                if(request.getParameter("action").equals("add")){
            %>
                    <pre>
                        <input type="hidden" name="action" value="add">
                        Username: <input type="text" name="username">
                        Password: <input type="text" name="password">
                                  <input type="submit" value="Submit">
                    </pre>
            <%
                }else if(request.getParameter("action").equals("edit")){
            %>
                    <pre>
                        <input type="hidden" name="action" value="edit">
                        Username: <input type="text" name="username" value="<%=request.getParameter("username")%>">
                        Password: <input type="text" name="password" value="<%=request.getParameter("password")%>">
                                  <input type="submit" value="Submit">
                    </pre>
            <%
                }
            %>
        </form>
    </body>
</html>
