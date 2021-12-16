package com.duckSimulationApp;

public class NotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println(" I cannot fly ");
    }
}
