package com.peixiao.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: Peixiao Zhao
 */

// 将其做成抽象类
public abstract class Pizza {
    protected String name;  // 名字

    // 准备原材料，不同的pizza原材料不同，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " is baking");
    }

    public void cut() {
        System.out.println(name + " is cutting");
    }

    public void box() {
        System.out.println(name + " is boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
