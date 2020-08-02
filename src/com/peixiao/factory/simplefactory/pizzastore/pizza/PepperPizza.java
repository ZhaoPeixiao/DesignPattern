package com.peixiao.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作PepperPizza准备原材料");
    }
}
