package com.oops.encapsulation;

// Encapsulation:-
//      Encapsulation in Java is the process of wrapping data (variables) and code (methods) together into a single unit,
//      usually a class, and restricting direct access to the data.

// Simple Meaning:- We hide the internal details of a class and allow access through public methods like getters and setters.

public class Encapsulation {
    public static void main(String[] args) {
        Women women = new Women();

        women.setAge(23);
        System.out.println(women.getAge());
    }
}

class Women {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
