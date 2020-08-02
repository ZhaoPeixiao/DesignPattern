package com.peixiao.factory.absfactory.pizzastore.order;

import com.peixiao.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.peixiao.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.peixiao.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: Peixiao Zhao
 */

// 这是一个工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("---使用抽象工厂模式----");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
