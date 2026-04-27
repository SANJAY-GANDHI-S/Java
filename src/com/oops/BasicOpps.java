package com.oops;

// Class:-
//  A class is like a blueprint or template used to create objects.

// Object:-
//  An object is an instance of a class.

// Constructor:-
//  A constructor is a special method in a class that is automatically called when an object is created

// Garbage Collection:-
//  Garbage Collection (GC) in Java is the process of automatically deleting unused objects from memory.

public class BasicOpps {
    public static void main(String[] args) {
        // Create Object for Student Class
        Student student = new Student();
        //  Student → class
        //  student → reference variable
        //  new Student() → creates object
        //  Whole line → creates an object and stores its reference

        student.rNo = 556;
        student.name = "Sanjay Gandhi S";
        student.marks = 413;

        System.out.println(student.name);

        // final keyword:-
        //  The final keyword in Java is used to restrict changes. Once something is marked final, it cannot be modified.

        final int num = 10;
        // num = 12;  // Cannot assign a value to final variable 'num'

        final Student s = new Student();
        s.name = "Sanjay";

        //when a non primitive is final, you cannot reassign it.
        // s = new Student(); // when a non primitive is final, you cannot reassign it.
    }
}

class Student {
    int rNo;
    String name;
    int marks;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    // this:-
    //  this keyword is a reference variable that points to the current object

    // this():-
    //  this() keyword is a calling one constructor to another constructor.

    Student  (Student other) {
        this.name = other.name;
        this.rNo = other.rNo;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, int marks) {
        this.rNo = rno;
        this.name = name;
        this.marks = marks;
    }
}
