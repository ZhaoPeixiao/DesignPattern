package com.peixiao.factory.absfactory.pizzastore.order;

import com.peixiao.factory.absfactory.pizzastore.pizza.*;

/**
 * @Author: Peixiao Zhao
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("---使用抽象工厂模式----");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
