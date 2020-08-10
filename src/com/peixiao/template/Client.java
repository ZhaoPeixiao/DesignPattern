package com.peixiao.template;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("Red Bean SoyaMilk");

        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println();
        System.out.println("Peanut SoyaMilk");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
