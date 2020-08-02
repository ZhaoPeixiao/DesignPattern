package com.peixiao.factory.factorymethod.pizzastore.order;


import com.peixiao.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.peixiao.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.peixiao.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author: Peixiao Zhao
 */
public class BJOrderPizza extends OrderPizza {

    Pizza pizza = null;
    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
