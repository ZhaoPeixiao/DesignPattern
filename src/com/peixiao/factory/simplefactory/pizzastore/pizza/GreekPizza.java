package com.peixiao.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作GreekPizza准备原材料");
    }
}
