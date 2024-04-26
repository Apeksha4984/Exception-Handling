package com.mycompany.exceptionhandlingexample;
// customize exception class
class YoungerAge extends RuntimeException {

    YoungerAge(String msg) {
        super(msg);
    }
}

public class ThrowExce {

    public static void main(String[] args) {
        int age = 24;
        if (age < 18) {
            throw new YoungerAge("you are not eligible for vote");

        } else {
            System.out.println("you are  eligible for vote");
        }
    }

}
