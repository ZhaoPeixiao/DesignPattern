package com.peixiao.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("给制作LDPepperPizza准备原材料");
    }
}
