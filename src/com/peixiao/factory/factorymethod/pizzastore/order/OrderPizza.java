package com.peixiao.factory.factorymethod.pizzastore.order;

import com.peixiao.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Peixiao Zhao
 */
public abstract class OrderPizza {

    // 定义一个抽象方法， createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购pizza类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);     // 抽象方法，由工厂子类完成
            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }


    // 获取客户希望订购的pizza种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input piazza type: ");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
