<%-- 
    Document   : added_cart
    Created on : Feb 15, 2023, 5:18:19 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
     <link rel="stylesheet" type="text/css" href="css/cart.css" />
     <link rel="stylesheet" type="text/css" href="css/default.css" />
    <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&display=swap" rel="stylesheet">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Added to Cart</title>
    </head>
        <div id="title-box">
     <h1>Added to Cart! </h1> <br>
    </div>
    <body>
   
    <center>
    <table>            

      
        
        
        
    
     <%
     String[] listofItemsSelected = (String [])request.getAttribute("selectedItemList"); 
     float totalPrice = (float) request.getAttribute("totalPrice");
   for(int i=0;i<listofItemsSelected.length;i++){

 %>
     
  <tr>

   <td>
       <div class="food-card">
           <div class = "food-card-prop">
                <h3>Item selected:  <%=listofItemsSelected[i]%></h3>           
   </td>

  </tr>
  <br>
<%
 
   
    }
%>

        <h3>Total Price: <%=totalPrice%></h3>
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
         

    </body>
</html>
