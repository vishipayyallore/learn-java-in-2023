package com.java.learning.day2;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(MessageFormat.format("Int Min Value: {0} :: Int Max Value: {1}", intMinValue, intMaxValue));

        System.out.println(MessageFormat.format("Int Min Value: {0} :: Int Max Value: {1}", (intMinValue - 1), (intMaxValue + 1)));

        // int testOverFlow = 2_147_483_648;  // It will display compile time Error
    }
}
