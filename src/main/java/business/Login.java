package business;

import helper.Food;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.UserCRUD;
import persistence.ManagerCRUD;


/**
 *
 * @author student
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String requestedUser=(String) request.getParameter("username");
        String passOfRequestedUser=(String) request.getParameter("password");
        FoodItems foodObj = new FoodItems();
        //foodObj.addFoodItems();
        ArrayList<Food>foodItemsList = foodObj.getFoodItems();
        
        //System.out.println("First item in the list: "+foodItemsList.get(0));
        
//        for (Food f : foodItemsList){
//            
//                    System.out.println(f.toString());
//        }

        
        UserCRUD u = new UserCRUD();
        ManagerCRUD m = new ManagerCRUD();
        
      String username= u.AuthenticateUser(requestedUser,passOfRequestedUser);
      String managername= m.AuthenticateUser(requestedUser,passOfRequestedUser);

      
      if (username!= "INVALID"){
        if (requestedUser.equals(username)){
                  request.getSession().setAttribute("uname", username);
              request.setAttribute("foodItems", foodItemsList);
              RequestDispatcher rd= request.getRequestDispatcher("main_menu.jsp");
              rd.forward(request, response);


          }


          else{         
           RequestDispatcher rd= request.getRequestDispatcher("login_fail.jsp");
               request.getSession().setAttribute("uname", username);
                rd.forward(request, response); 
          }
      }
      else{
        if (requestedUser.equals(managername)){
                    request.getSession().setAttribute("uname", username);
                RequestDispatcher rd= request.getRequestDispatcher("Manager_after_login.jsp");
                rd.forward(request, response);


            }


            else{         
             RequestDispatcher rd= request.getRequestDispatcher("login_fail.jsp");
                 request.getSession().setAttribute("uname", username);
                  rd.forward(request, response); 
            }
      }

    }


}