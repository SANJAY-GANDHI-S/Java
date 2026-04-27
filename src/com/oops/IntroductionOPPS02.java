package com.oops;

// Package:-
//  A package in Java is a collection of related classes and interfaces.
//     * package keyword → used to create package
//     * import keyword → used to use package
//     * Default package → if you don’t specify any

public class IntroductionOPPS02 {
    static int a = 10;
    static int b;

    static {
        System.out.println("Static block executed");
        b = a * 10;
    }

    {
        System.out.println("Non-Static block executed");
    }

    public static void main(String[] args) {
        IntroductionOPPS02 i2 = new IntroductionOPPS02();
        System.out.println(a);
        System.out.println(b);

        IntroductionOPPS02.b += 3;

        IntroductionOPPS02 ic2 = new IntroductionOPPS02();
        System.out.println(b);

        InnerClass a1 = new InnerClass("Sanjay");
        InnerClass a2 = new InnerClass("Gandhi");

        System.out.println(a1.name);
        System.out.println(a2.name);

        Singleton singleton = Singleton.getInstance();
    }

    static class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }
}

// Singleton:-
//  A Singleton class in Java is a class that allows only one object (instance) to be created and
// provides a global access point to that object.

class Singleton {

    // Step 1: Create a static instance
    private static Singleton instance = new Singleton();

    // Step 2: Make constructor private
    private Singleton() {
        System.out.println("Instance created");
    }

    // Step 3: Provide public method to access instance
    public static Singleton getInstance() {
        return instance;
    }
}
