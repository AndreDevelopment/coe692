/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author student
 */
public class ManagerCRUD {
    
     String authenticatedUserName = null;
    String authenticatedPassword = null;

    
    public String AuthenticateUser(String checkUsername, String checkPassword){
        
        try {

            Connection con = ConnectionFD.getCon();
            
             String q = "SELECT * FROM MANAGERS";
            
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            String tempUsername = rs.getString("managename");
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
