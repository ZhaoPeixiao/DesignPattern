package com.peixiao.factory.absfactory.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("给制作LDCheesePizza准备原材料");
    }
}
