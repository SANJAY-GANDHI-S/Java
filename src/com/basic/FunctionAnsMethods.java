package com.basic;

public class FunctionAnsMethods {
    public static void main(String[] args) {
        // Function :-
        // A function (method) in Java is a named block of code that executes when it is called,
        // optionally takes inputs (parameters), and may return a value.X

        System.out.println(addName("Sanjay", "Gandhi"));
        greetingHello();

        //creating object for FunctionAnsMethods class
        FunctionAnsMethods functionAnsMethods = new FunctionAnsMethods();
        functionAnsMethods.greeting();
        System.out.println(functionAnsMethods.sum(2,3));
    }

    // need to create object
    // without return type
    void greeting() {
        System.out.println("Hello World");
    }

    // with return type
    int sum(int a, int b) {
        return a + b;
    }

    //static keyword -> no need for creating object
    // with return type
    static String addName(String fName, String lName) {
        return fName + lName;
    }

    static void greetingHello() {
        System.out.println("Hello World!!!");
    }
}
