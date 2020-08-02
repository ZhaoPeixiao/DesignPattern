package com.peixiao.factory.simplefactory.pizzastore.order;

/**
 * @Author: Peixiao Zhao
 */

// 相当于一个客户端，发出订购任务
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();

        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("exit");

        new OrderPizza2();
    }
}


// 比较好理解，简单易操作
// 违反了ocp原则，即对扩展开放 对修改关闭。
// 要增加新功能的时候，尽量不修改代码，或少修改代码
// 如果增加一个新的pizza，要修改的代码很多
// 如果增加新的pizzastore， 所有的pizzastore都要修改