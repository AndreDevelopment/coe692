/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author student
 */
public class ConnectionFD {
    
        public static Connection getCon(){
        
           Connection con = null;
           
           try{
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FOODDELIVERY?autoReconnect=true&useSSL=false", "root", "student");
           System.out.println("Connection established.");
           
           }catch (Exception e){
           
           System.out.println("Got an error: "+e);
           }
            return con;
          }
    
}