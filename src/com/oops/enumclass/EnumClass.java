package com.oops.enumclass;

// Enum:-
//      An enum (Enumeration) is a special data type in Java used to store a fixed set of constants.

// Why Use Enum?
//      To avoid invalid values
//      Makes code readable
//      Used when values are fixed
//  Examples: Days of week, Months, Directions, Status values

// Important Points
//      Enum constants are public static final
//  Enum can have: variables, methods, constructors

public class EnumClass {
    enum Week implements Greeting{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor calling " + this);
        }


        @Override
        public void greeting() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;

        System.out.println(week);
        System.out.println(week.ordinal());

        week.greeting();
    }
}

interface Greeting {
    void greeting();
}