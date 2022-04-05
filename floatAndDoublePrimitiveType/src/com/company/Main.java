package com.company;

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

        int myIntValue=5;
        float myFloatValue=(float)5.25;///this cast is treating a double as a float
        double myDoubleValue=5.25;

    }
}
