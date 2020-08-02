package com.peixiao.factory.factorymethod.pizzastore.order;

import com.peixiao.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Author: Peixiao Zhao
 */
public class LDOrderPizza extends OrderPizza{
    Pizza pizza = null;
    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
