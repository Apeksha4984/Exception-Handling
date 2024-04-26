
package com.mycompany.exceptionhandlingexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionCloseDemo {
    
    public static void main (String[]args)
    {
        Connection con =null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            
        }
        catch(Exception ex){
            
        }
        finally{
            
            try{
                rs.close();
                
            }
            catch(SQLException e)
            {
                
            }
            try{
                ps.close();
            }
            catch(SQLException e){
                
            }
            try{
                con.close();
            }
            catch(SQLException e){
                
            }
        }
    }
    
}
