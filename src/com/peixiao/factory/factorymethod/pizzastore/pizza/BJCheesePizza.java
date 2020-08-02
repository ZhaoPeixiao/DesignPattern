package com.peixiao.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("给制作BJCheesePizza准备原材料");
    }
}
