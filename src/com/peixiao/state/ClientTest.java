package com.peixiao.state;

/**
 * @Author: Peixiao Zhao
 */
public class ClientTest {

    public static void main(String[] args) {

        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i < 50; i ++){
            System.out.println("--------第" + i + "次抽奖--------");
            activity.debuctMoney();

            activity.raffle();
        }

    }
}
