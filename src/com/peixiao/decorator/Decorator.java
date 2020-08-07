package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public class Decorator extends Drink{
    private Drink drink;
    @Override
    public float cost() {
        return this.getPrice() + drink.cost();
    }

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        return this.des + " " + this.getPrice() + " && " + drink.getDes();
    }

}
