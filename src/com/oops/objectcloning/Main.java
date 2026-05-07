package com.oops.objectcloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sanjay = new Human("Sanjay", 23);

        Human twin = (Human) sanjay.clone();

        System.out.println(twin.toString());
    }
}
