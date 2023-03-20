/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import helper.Food;
import business.FoodItems;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
public class SearchFunction extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchFunction</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchFunction at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        ArrayList <Food>compareList = new ArrayList<>();
        ArrayList <Food> filtered = new ArrayList<>();
           
        String foodSelected = (String) request.getParameter("myInput");
        
       FoodItems fooObj = new FoodItems();
     
       compareList = fooObj.getFoodItems();
       String item = "";
       String sadImg = "resources/sadface.png";
       
       
       
       //VEGETARIAN FILTER
       if (foodSelected.toLowerCase().equals("vegetarian") || foodSelected.toLowerCase().contains("veg")){
           for (int i =0;i<compareList.size();i++){
                if (compareList.get(i).isVegetarian()){
                    
                    filtered.add(compareList.get(i));

                }//end of if
           }//end of for
       
       }//end of if
       
       //CHEFS CHOICE FILTER
       else if (foodSelected.toLowerCase().contains("chef")){
           for (int i =0;i<compareList.size();i++){
                if (compareList.get(i).isChefsChoice()){
                    
                    filtered.add(compareList.get(i));

                }
           }
       
       }else {
       
       //FOOD FILTER
       for(int i=0; i<compareList.size();i++){
           item = compareList.get(i).getName();
           if (item.toLowerCase().contains(foodSelected.toLowerCase())){
               
               filtered.add(compareList.get(i));
               

           }
  
       }
       
       
      // System.out.println("First time in fitler: " + filtered.get(0).toString());
       
       
          
       
       }
       request.setAttribute("filterList",filtered);
       System.out.println( filtered.isEmpty() ? "List is empty": "Item at 0 is: "+filtered.get(0).toString());
       
        
//        if (searchedQuery==null){
//            System.out.println("null scenario ran");
//            RequestDispatcher rd= request.getRequestDispatcher("getSearchResult.jsp");
//            rd.forward(request, response);
//        }
        //else{
            //request.getSession().setAttribute("result", searchedQuery);
            //request.getSession().setAttribute("list", foodItemsList);

            //request.getSession().setAttribute("itemSelected", foodSelected);
            RequestDispatcher rd= request.getRequestDispatcher("search_result.jsp");
            rd.forward(request, response);
            
       // }
        
        
     
    }
}
