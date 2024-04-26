package com.mycompany.exceptionhandlingexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsExce {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }

}
class Test{
    public static void main(String[]args) throws FileNotFoundException 
    {
       ThrowsExce  te = new ThrowsExce();
       try{
       te.readFile();
    }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
       }
       try{
          te.saveFile();
       }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
           
       }
       
        System.out.println("hello");
    }
}
    

