<%-- 
    Document   : userbooks
    Created on : Jan 24, 2021, 1:00:48 AM
    Author     : student
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="ryerson.ca.lab2.BookBorrowed"%>
<!DOCTYPE html>


<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Book</title>
    </head>
    <style>

body {
  background-color: #E6E6FA;

}
</style>
<% 
    ArrayList<BookBorrowed> books= (ArrayList)request.getAttribute("booksBorrowedInfo");
  
%>

<center><h2>Hello <%=session.getAttribute("uname")%></h2></center>
<br>
<center><h3> The following is your books</h3></center>
<br>
<form action="Extend" method="post">
<table border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
   
<th> Name </th>
<th> Author </th>
<th> Due Date </th>
<th> Extend </th>

</tr>

    <% for(BookBorrowed book: books){
    %>
<tr>
<td> <%=book.getBookName()%> </td>
<td> <%=book.getBookAuthor()%></td>
<td> <%=new SimpleDateFormat("yyyy-MM-dd").format(book.getDueDate())%></td>
<% if (book.isAvailable()){
%>
<td> <input type="submit" value="Extend" ></td>
<%}

else {
%>


<td> "The book is not available for extension"</td>
<% }}
%>
</tr>
</table>
</form>
</body>
</html>
