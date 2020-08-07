package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Drink {

    public String des;  // miaoshu
    private float price = 0.0f;

    public String getDes() {
        return des + "  " + price;
    }

    public float getPrice() {
        return price;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用的抽象方法
    public abstract float cost();

}
