package com.oops.inheritance;

// Inheritance:-
//      A class (called the child/subclass) can inherit from another class (called the parent/superclass).

public class SingleInheritance {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.display(); // Inherited Method
//        child.show(); // Method

        Parent parent = new Parent();
        parent.display(); // Method
        // parent.show(); // Cannot access 'show' method in 'Parent'

        // You can assign a subclass object to a superclass reference,
        // but not a superclass object to a subclass reference.
        // Child child1 = new Parent();
    }
}

// Single Inheritance:-
//      One class inherits from another

//    Parent
//      |
//    Child

class Parent {
    int a = 10;

    public Parent() {
        System.out.println("This is Parent constructor");
    }

    public Parent(String name) {
        System.out.println("This is Parent constructor with parameter :- user : " + name);
    }

    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    int a = 20;

    public Child() {
        // The super() keyword should come at the first line of the code.
        super("Sanjay"); // call the parent class constructor with parameter
        super.display(); // calls parent method
    }

    public Child(int a) {
        // The this() keyword should come at the first line of the code.
        this(); // // call the current class constructor with parameter
        this.a = a;
    }

    void show() {
        System.out.println("This is child class");
        this.showNum(); // calling current class method
    }

     void showNum() {
         System.out.println(a); // 20
         this.a = 15;
         System.out.println(a); // 15
         System.out.println(super.a); // 10
     }
}
