package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("myMinFloatValue=>"+myMinFloatValue);
        System.out.println("myMaxFloatValue=>"+myMaxFloatValue);

        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("myMinDoubleValue=>"+myMinDoubleValue);
        System.out.println("myMaxDoubleValue=>"+myMaxDoubleValue);

//        int myIntValue=5;
//        float myFloatValue=(float)5.25;///this cast is treating a double as a float
//        double myDoubleValue=5.25;

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5d/3f;
        double myDoubleValueSecond=5.00/3.00;//////double precision type is recommended because this is faster  ////USE DOUBLE
        System.out.println("myIntValue=>"+myIntValue);      //myIntValue=>2   int doesn't handle remainder
        System.out.println("myFloatValue=>"+myFloatValue);///myFloatValue=>1.6666666
        System.out.println("myDoubleValue=>"+myDoubleValue);///myDoubleValue=>1.6666666666666667
        System.out.println("myDoubleValueSecond=>"+myDoubleValueSecond); //myDoubleValueSecond=>1.6666666666666667

        double numberOfPounds=200d;
        double convertedKilogram=numberOfPounds*0.45359237d;
        System.out.println("numberOfPounds=>"+numberOfPounds);
        System.out.println("convertedKilogram=>"+convertedKilogram);

        double pi=3.1415927d;
        double anotherNumber=3_000_000.4_567_890d;
        System.out.println("pi=>"+pi);
        System.out.println("anotherNumber==>"+anotherNumber);



    }
}
