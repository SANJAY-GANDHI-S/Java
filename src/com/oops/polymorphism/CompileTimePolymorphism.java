package com.oops.polymorphism;

// Polymorphism:-
//      Polymorphism in Java means one interface, many forms. It allows the same method name or reference to
//      behave differently depending on the object.

// Types of Polymorphism in Java:-
//      1. Compile-time Polymorphism (Method Overloading)
//      2. Runtime Polymorphism (Method Overriding)

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        System.out.println(mo.sum());                   // -1
        System.out.println(mo.sum(2, 3));         // 5
        System.out.println(mo.sum(2, 3, 5));   // 10
    }

}

// 1. Compile-time Polymorphism (Method Overloading)
//          Same method name with different parameters in the same class.

class MathOperation {

    int sum() {
        return -1;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
