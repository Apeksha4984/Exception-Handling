
package com.mycompany.exceptionhandlingexample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileCloseDemo {
     public static  void main(String[]args)throws IOException
     {
         FileInputStream fis = null;
         try{
         fis = new FileInputStream("d:/abc.txt");
        
         }
// cleanup here
catch(IOException e)
{
    System.out.println("File not found");
}
         if(fis!=null)
         {
             fis.close();
         }
         System.out.println("file closed");
         
     }
}
    

