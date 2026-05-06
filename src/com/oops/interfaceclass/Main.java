package com.oops.interfaceclass;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        car.accelerator();
        car.start();

        Television nokia = new Nokia();
        nokia.change();
        nokia.start();
    }
}
