package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(2.0f);
    }
}
