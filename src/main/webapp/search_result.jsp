<%-- 
    Document   : getSearchResult
    Created on : Feb 4, 2023, 2:24:24 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.Food"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    
      <link rel="stylesheet" type="text/css" href="css/cart.css" />
      <link rel="stylesheet" type="text/css" href="css/default.css" />
    <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&display=swap" rel="stylesheet">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <div id="title-box">
     <h1> Select the Items and Add to Cart </h1> <br>
    </div>
    <body>
   <form action="AddToCart" method="post">
    <center>
        
     
    <table>            

      
        
        
        
    
     <%
     ArrayList <Food> listofItems = (ArrayList)request.getAttribute("filterList"); 
   for(int i=0;i<listofItems.size();i++){

 %>
     
  <tr>

   <td>
       <div class="food-card">
           <div class = "food-card-prop">
               <%=listofItems.get(i).getName()%>
           <h4>Price: <%=listofItems.get(i).getPrice()%></h4>
           </div>
           <img alt="img not found" src="<%=listofItems.get(i).getImgPath()%>">
           <input type = "checkbox" name = "selectedItems" value ="<%=listofItems.get(i).getName()%>" />
        </div>
   
   </td>

  </tr>
  <br>
<%
 
   
    }
%>
<!--  <tr>
      
   <td> 
      <div class="food-card">
           <div class = "food-card-prop">
       <h3>< %=session.getAttribute("itemSelected")%></h3>
           <h4>Price: < %=session.getAttribute("itemPrice")%></h4>
           <input type = "checkbox" name = "chemistry" />
           </div>
           <img alt="img not found" src="< %=session.getAttribute("itemImg")%>">
     
      </div>
        
  
  </td>
  </tr>-->
  
    </table>  
          
           </center>           
  <br>
  <br>
         <center> <input type="submit" value="Add to cart" ></center>
 </form>
    </body>
</html>