package com.peixiao.factory.absfactory.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("给制作BJPepperPizza准备原材料");
    }
}
