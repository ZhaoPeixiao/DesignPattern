package com.peixiao.template.improve;

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

        System.out.println();
        System.out.println("Pure SoyaMilk");
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
