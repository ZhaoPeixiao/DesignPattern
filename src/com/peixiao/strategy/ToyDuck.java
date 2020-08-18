package com.peixiao.strategy;

/**
 * @Author: Peixiao Zhao
 */
public class ToyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is a toy duck");
    }

    @Override
    public void quack() {
        System.out.println("Toy duck cannot quack");
    }

    @Override
    public void swim() {
        System.out.println("Toy duck cannot swim");
    }

    @Override
    public void fly() {
        System.out.println("Toy duck cannot fly");
    }
}
