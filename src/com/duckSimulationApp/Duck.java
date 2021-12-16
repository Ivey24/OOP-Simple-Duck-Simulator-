package com.duckSimulationApp;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFLy(){
        flyBehavior.fly();
    }

    public  void performQuack(){
        quackBehavior.quack();
    }

    public Duck(){
//        flyBehavior = new NotFly();
        flyBehavior = new BackwardFly();
//        flyBehavior = new ForwardFly();
        flyBehavior.fly();
    }
    public abstract void display();
}
