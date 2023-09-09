/*
 * There are three types of variables in Java:
 * local variable
 * instance variable
 * static variable
 */

package VariablesDemo;

public class VariablesTypes {

    int addTwoNumbers(int a, int b) {
        System.out.println("Input values received are A: " + a + " and B: " + b);
        return a + b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = new VariablesTypes().addTwoNumbers(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }

}
