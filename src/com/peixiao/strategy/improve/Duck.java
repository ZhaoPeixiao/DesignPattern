package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void quack(){
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim(){
        System.out.println("Duck can swim");
    }

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public abstract void display();
}
