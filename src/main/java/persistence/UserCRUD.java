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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserCRUD {
    String authenticatedUserName = null;
    String authenticatedPassword = null;

    
    public String AuthenticateUser(String checkUsername, String checkPassword){
        
        try {

            Connection con = ConnectionFD.getCon();
            
             String q = "SELECT * FROM USERS";
            
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            String tempUsername = rs.getString("username");
            String tempPassword = rs.getString("password");
            if(checkUsername.equals(tempUsername) && checkPassword.equals(tempPassword)){
                authenticatedUserName = tempUsername; 
                authenticatedPassword = tempPassword;
            }
             
            }
            
            if (authenticatedUserName == null || authenticatedPassword == null){
                
              authenticatedUserName = "INVALID";  
              authenticatedPassword = "INVALID";
               
              
            }
        con.close();
        
        }catch(Exception e){
        
        }
        
        return authenticatedUserName;
    
    }

 
    
}