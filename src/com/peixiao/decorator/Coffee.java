package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
