package com.peixiao.factory.simplefactory.pizzastore.order;

import com.peixiao.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Peixiao Zhao
 */
public class OrderPizza2 {
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2(){

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);

            // 输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }


    // 获取客户希望订购的pizza种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input piazza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
