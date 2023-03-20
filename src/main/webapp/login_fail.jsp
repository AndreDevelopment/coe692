<%-- 
    Document   : login_fail
    Created on : Feb 15, 2023, 10:12:34 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" type="text/css" href="css/default.css" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login failed!</title>
    </head>
    <body>
        <h1> Your login has failed! Please try again</h1>
        <h2>  Hello - <%=session.getAttribute("uname")%> </h2> <br>
    </body>
</html>
