package com.oops.interfaceclass;

public class Car implements Engine, Brake{
    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void accelerator() {
        System.out.println("Accelerator the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void brake() {
        System.out.println("Apply the brake");
    }
}
