
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author student
 */

import java.util.ArrayList;
import helper.Food;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FoodCRUD {
    
    

    

    
    public ArrayList<Food> getFoodList(){
        ArrayList<Food> foodItems = new ArrayList<Food>();
         Food food;
        try {
            
           
            
            Connection con = ConnectionFD.getCon();
             
            
             String q = "SELECT * FROM FOODITEMS;";
            
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                            
                    
                foodItems.add(new Food(
                
                        rs.getString("food_name"),
                        "resources/"+rs.getString("image_path"),
                        rs.getFloat("price"),
                        rs.getBoolean("vegetarian"),
                        rs.getBoolean("chefs_choice"),
                        rs.getInt("stock"),
                        rs.getString("group_id")
                        
                
                ));
                

            
            }//end of while
           // System.out.println("Object 1: "+foodItems.get(0).toString());
        con.close();
        
        }catch(Exception e){
        
            System.out.println("Error: "+e);
        }
        
        
        

            return foodItems;
    }
    
}