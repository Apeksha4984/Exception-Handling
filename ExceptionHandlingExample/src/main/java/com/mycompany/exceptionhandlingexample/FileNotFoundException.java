
package com.mycompany.exceptionhandlingexample;

import java.io.FileInputStream;

public class FileNotFoundException {
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        try
        {
        
            FileInputStream fis = new FileInputStream("d:/abc.txt");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("apeksha");
            
        }
    }
    

