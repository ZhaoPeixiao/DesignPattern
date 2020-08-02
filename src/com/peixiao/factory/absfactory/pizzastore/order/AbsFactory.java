package com.peixiao.factory.absfactory.pizzastore.order;

import com.peixiao.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: Peixiao Zhao
 */

// 抽象工厂模式的抽象层(接口)
public interface AbsFactory {

    // 让下面的工厂子类具体实现
    public abstract Pizza createPizza(String orderType);
}
