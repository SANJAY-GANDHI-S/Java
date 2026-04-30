package com.oops.inheritance;

// Multiple Inheritance (via interfaces only) –
//      Java does not support multiple inheritance with classes to avoid ambiguity

//  Parent      Parent //
//    |            |         We can’t extend more than one class in Java because when you create an object of a child class and
//    --------------         use the super() keyword to access a parent constructor, the child class wouldn’t know which parent
//          |                class constructor to call. That’s why multiple inheritance is not supported with classes in Java.
//        Child              However, it can be achieved using interfaces (with the implements keyword).

public class MultipleInheritance {
}
