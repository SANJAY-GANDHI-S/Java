package com.oops.interfaceclass;

// 1. Abstract Class
//      An abstract class is a class that cannot be instantiated
//      (you can’t create objects from it directly). It is meant to be extended by other classes.

// 2. Abstract Method
//      An abstract method is a method without a body (no implementation). Subclasses must provide the implementation.

// Key Points
//      abstract class cannot be instantiated
//      Can have both abstract and non-abstract methods
//      If a class has at least one abstract method, it must be declared abstract
//      Subclasses must implement all abstract methods

public abstract class Television implements Media{

    abstract void change();

}
