/*
 * There are three types of variables in java: local, instance and static.
 * There are two types of data types in Java: primitive and non-primitive.
 */
package VariablesDemo;

public class VariablesTypes {

    // static variable
    static int m = 100;
    // instance variable
    int op = 200;

    void displayAge() {
        // local variable
        int n = 90;

        System.out.println("displayAge() :: Static variable: " + m);
        System.out.println("displayAge() :: Local variable: " + n);
        System.out.println("displayAge() :: Instance variable: " + op);
    }

    public static void main(String[] args) {
        // local variable
        int n = 909;

        new VariablesTypes().displayAge();

        System.out.println("main() :: Static variable: " + m);
        System.out.println("main() :: Local variable: " + n);
        System.out.println("main() :: Instance variable: " + new VariablesTypes().op);
    }

}

/*
 * There are three types of variables in Java:
 * local variable
 * instance variable
 * static variable
 */