package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar='D';   ///char can only store a single character;
        char myUnicodeChar='\u0044';  ///this is a unicode convention
        System.out.println("myChar=>"+myChar);  //myChar=>D
        System.out.println("myUnicodeChar=>"+myUnicodeChar); //myUnicodeChar=>D
        char myCopyrightChar='\u00A9';
        System.out.println("myCopyrightChar=>"+myCopyrightChar);//myCopyrightChar=>©

        /////boolean/////
        boolean myTrueBooleanValue=true;
        boolean myFalseBooleanValue=false;

        boolean isCustomerOverTwentyOne=true;   //best way to name boolean///




    }
}
