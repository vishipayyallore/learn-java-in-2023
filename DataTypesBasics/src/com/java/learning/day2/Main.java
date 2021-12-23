package com.java.learning.day2;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {

        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(MessageFormat.format("Int Min Value: {0} :: Int Max Value: {1}", intMinValue, intMaxValue));
        System.out.println(MessageFormat.format("Overflow :: Int Min Value: {0} :: Int Max Value: {1}", (intMinValue - 1), (intMaxValue + 1)));
        // int testOverFlow = 2_147_483_648;  // It will display compile time Error

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println(MessageFormat.format("Byte Min Value: {0} :: Byte Max Value: {1}", byteMinValue, byteMaxValue));
        System.out.println(MessageFormat.format("Overflow :: Byte Min Value: {0} :: Byte Max Value: {1}", (byte)(byteMinValue - 1), (byte)(byteMaxValue + 1)));
        // byteMinValue = -129; // It will display compile time Error

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println(MessageFormat.format("Short Min Value: {0} :: Short Max Value: {1}", shortMinValue, shortMaxValue));
        System.out.println(MessageFormat.format("Overflow :: Short Min Value: {0} :: Short Max Value: {1}", (short)(shortMinValue - 1), (short)(shortMaxValue + 1)));
        // shortMinValue = -32769;  // It will display compile time Error

    }
}
