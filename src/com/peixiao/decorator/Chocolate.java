package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
