
package com.mycompany.exceptionhandlingexample;

public class ClassNotFoundException {
    public static void main(String []args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
            System.out.println("apeksha");
        }
    }
    

