package com.peixiao.factory.absfactory.pizzastore.order;

import com.peixiao.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Peixiao Zhao
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }


    private void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;

        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }
            else{
                System.out.println("failure!");
                break;
            }
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
