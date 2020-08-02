package com.peixiao.factory.simplefactory.pizzastore.order;

import com.peixiao.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.peixiao.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Peixiao Zhao
 */
public class OrderPizza {

    // 构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType; // 订购pizza类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("GreekPizza");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("CheesePizza");
//            } else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("PepperPizza");
//            } else{
//                break;
//            }
//            // 输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }


    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;     // 设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
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
