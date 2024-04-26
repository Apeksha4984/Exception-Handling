package com.mycompany.exceptionhandlingexample;

public class FinallyBlock {

    public static void main(String[] args) {
        try //risky code
        {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } 
        catch (Exception e)
        {
       //handling code
            System.out.println(e);
        } 
        finally 
        {// cleanup code

            System.out.println("i am in finally block");
        }
    }

}
