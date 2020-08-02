package com.peixiao.factory.absfactory.pizzastore.order;

/**
 * @Author: Peixiao Zhao
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
