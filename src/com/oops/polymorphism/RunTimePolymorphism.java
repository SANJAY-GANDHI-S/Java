package com.oops.polymorphism;

// 2. Runtime Polymorphism (Method Overriding)
//      Same method name with the same parameters in different classes.

// final Keyword:-
//  1.Final Variable: A final variable becomes a constant. Once assigned, its value cannot be changed.
//  2.Final Method: A final method cannot be overridden by a child class.
//  3.Final Class: A final class cannot be inherited.

public class RunTimePolymorphism {

    public static void main(String[] args) {
        // Method overriding will not happen.
        Animal animal = new Animal();
        animal.sound("Animal", "Animal");                 // Animal makes sound

        // Method overriding will not happen.
        Dog dog = new Dog();
        dog.sound("Dog", "Dog");                    // Dog barks

        // Method overriding will happen.
        // Because the object is a subclass, but the reference type is the superclass.
        Animal animal1 = new Dog();
        animal1.sound("Animal", "Dog");                // Dog barks
    }

}

class Animal {

    //final int lifespan; // Error:- Field 'lifespan' might not have been initialized
    final int lifespan = 50;

    void sound(String refClass, String objClass) {
        System.out.println( refClass + " + " + objClass + ": Animal makes sound");
    }

    // A final method cannot be overridden.
    final void type() {
        System.out.println("Animal Type");
    }

    static void isPet() {
        System.out.println("Animal can be a pet.");
    }
}

class Dog extends Animal {

    void sound(String refClass, String objClass) {
        //super.lifespan = 20; //Error:- Cannot assign a value to final variable 'lifespan'
        System.out.println(refClass + " + " + objClass + ": Dog barks");
    }

    // Error:- 'type()' cannot override 'type()' in 'com.oops.polymorphism.Animal'; overridden method is final
    //void type() {
    //    System.out.println("Type is Dog");
    //}

    // Error:- Instance method 'isPet()' in 'Dog' cannot override static method 'isPet()' in 'Animal'
    //void isPet() {
    //    System.out.println("Yes, It is");
    //}
}
