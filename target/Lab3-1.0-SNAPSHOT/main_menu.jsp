<%-- 
    Document   : login_sucess
    Created on : Feb 3, 2023, 12:42:12 PM
    Author     : student
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="helper.Food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
      <link rel="stylesheet" type="text/css" href="css/home.css" />
      <link rel="stylesheet" type="text/css" href="css/default.css" />
    <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&display=swap" rel="stylesheet">
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <title> 
            Food Delivery Management App
        </title>
    
    </head>
    <body>
     <form action="SearchFunction" method="post" >
              <div id="title-box">
             <h1>Food Delivery Management App</h1> 
             </div>
          <div id = "firstDiv" style="text-align: center;">
        
              <div class = "container">
             <h2>  Hello - <%=session.getAttribute("uname")%> </h2> <br>
        <input type="text" name = "myInput" onkeyup="myFunction()" placeholder="Search for Food items.."> <input type = "submit" value= "Search"> <br> <br>
        </div>
        
       
            
        <center>
    
            <ul class = "list-items">            
 <%
     ArrayList <Food> listofItems = (ArrayList)request.getAttribute("foodItems"); 
   for(int i=0;i<listofItems.size();i++){

 %>
     
  

   <li>
       <div class="food-card">
           <div class = "food-card-prop">
           <h3><%=listofItems.get(i).getName()%></h3>
           <h4>Price: <%=listofItems.get(i).getPrice()%></h4>
           </div>
           <img alt="img not found" src="<%=listofItems.get(i).getImgPath()%>">
        </div>
   
  </li>
 
<%
    }
%>
    </ul>
       
    </center>
        </div>
           
            
     </form>
        
    </body>
</html>
