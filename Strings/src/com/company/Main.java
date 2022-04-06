package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //double
        //char
        //boolean
        String myString="This is a string";
        System.out.println("myString is equal to "+myString);  //myString is equal to This is a string
        myString = myString +", and this is more.";
        System.out.println("myString is equal to "+myString);  //myString is equal to This is a string, and this is more.
        myString = myString +" \u00A9 2019";
        System.out.println("myString is equal to "+myString);  //myString is equal to This is a string, and this is more. © 2019.
        String numberString="250.55";
        numberString=numberString+"49.95";
        System.out.println(numberString); //250.5549.95
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("lastString is equal to "+lastString); //lastString is equal to 1050
        double doubleNumber=120.47d;
        lastString=lastString+doubleNumber;
        System.out.println("lastString is equal to "+lastString); //lastString is equal to 1050120.47
//        So in the case of this code, lastString doesn't get appended the value "120.47"
//        instead a new String is created which consists of the previous value of lastString plus a text representation
//        of the double value 120.47
//        -The net result is the same, lastString has the right values, however, a new String got created and the old one got discarded.




    }
}
