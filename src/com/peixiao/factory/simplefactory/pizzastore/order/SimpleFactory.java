package com.peixiao.factory.simplefactory.pizzastore.order;

import com.peixiao.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: Peixiao Zhao
 */
// 简单工厂类
public class SimpleFactory {

    // 根据orderType返回对应的pizza对象
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("PepperPizza");
        }

        return pizza;
    }
}
