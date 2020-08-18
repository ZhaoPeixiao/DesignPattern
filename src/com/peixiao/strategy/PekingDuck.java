package com.peixiao.strategy;

/**
 * @Author: Peixiao Zhao
 */
public class PekingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is a Peking duck");
    }

    @Override
    public void fly() {
        System.out.println("Peking duck cannot fly");
    }
}
