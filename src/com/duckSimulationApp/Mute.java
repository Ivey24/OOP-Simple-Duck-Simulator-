package com.duckSimulationApp;

public class Mute implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println(" Sorry I cannot speak!!!!!");
    }
}
