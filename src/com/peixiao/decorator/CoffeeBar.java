package com.peixiao.decorator;

/**
 * @Author: Peixiao Zhao
 */
public class CoffeeBar {

    public static void main(String[] args) {

        // 1. order long black
        Drink order = new LongBlack();
        System.out.println("Cost 1: " + order.cost());
        System.out.println("Des 1: " + order.getDes());

        // 2. add milk
        order = new Milk(order);
        System.out.println("Cost 2: " + order.cost());
        System.out.println("Des 2: " + order.getDes());

        // 3. add chocolate
        order = new Chocolate(order);
        System.out.println("Cost 3: " + order.cost());
        System.out.println("Des 3: " + order.getDes());

        // 4. add milk again
        order = new Milk(order);
        System.out.println("Cost 4: " + order.cost());
        System.out.println("Des 4: " + order.getDes());

        System.out.println("========================");

        Drink order2 = new DeCaf();
        System.out.println("Cost 1: " + order2.cost());
        System.out.println("Des 1: " + order2.getDes());

        order2 = new Soy(order2);
        System.out.println("Cost 2: " + order2.cost());
        System.out.println("Des 2: " + order2.getDes());
    }
}
