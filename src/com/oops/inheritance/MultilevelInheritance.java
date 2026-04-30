package com.oops.inheritance;

// Multilevel Inheritance:-
//      A chain of inheritance

//    Parent
//      |
//    Child
//      |
//  GrandChild

public class MultilevelInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
    }
}

class Animals {
    public Animals() {
        System.out.println("Animals constructor called");
    }
}

class Cat extends Animals{
    public Cat() {
        super();
        System.out.println("Cat constructor called");
    }
}

class Lion extends Cat{
    public Lion() {
        super();
        System.out.println("Lion constructor called");
    }
}


