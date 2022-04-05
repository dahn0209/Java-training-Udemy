package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue=1000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer Min Value="+myMinIntValue);
        System.out.println("Integer Max Value="+myMaxIntValue);
        System.out.println("Busted Max Val="+(myMaxIntValue+1));////this becomes an overflow
        System.out.println("Busted Min Val="+(myMinIntValue-1));////this becomes an underflow

        int myMaxIntTest= 2_147_483_647;////this is too large///
///////byte////
// A Byte occupies 8 bits. A bit is not directly represented in a primitive type-we have a boolean which
//  is not really the same thing that we will discuss in a future video. So a Byte occupies 8 bits.
//We say that a byte has a width of 8.
        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Min Val="+myMinByteValue);
        System.out.println("Byte Max Val="+myMaxByteValue);
        ///short/////
// A short can store a large range of numbers and occupies 16 bits and has a width of 16.
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Min Val="+myMinShortValue);
        System.out.println("Short Max Val="+myMaxShortValue);
///long///
// //you need a captial L after the value in long to indicate it's a long///
        long myLongValue=100L;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Min Val="+myMinLongValue);
        System.out.println("Long Max Val="+myMaxLongValue);
        long bigLongLiteralValue= 2_147_483_647_234L;      ////capital L at end///
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue=32767;

        int myTotal=(myMinIntValue/2);
////casting//////(byte)(myMinByteValue/2)////
        byte myNewByteValue=(byte)(myMinByteValue/2);
        short myNewShortValue=(short)(myMinShortValue/2);

///Primitive Type Challenge/////
        byte byteValue=10;
        short shortValue=20;
        int intValue=50;
        long longTotal=50000L+10L*(byteValue+shortValue+intValue);/////No casting
        System.out.println("result=>"+longTotal);
        short shortTotal=(short)(1000+10*(byteValue+shortValue+intValue));////casting
        System.out.println("shortTotal=>"+shortTotal);






    }
}
