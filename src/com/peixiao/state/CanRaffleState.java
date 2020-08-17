package com.peixiao.state;

import java.util.Random;

/**
 * @Author: Peixiao Zhao
 */
public class CanRaffleState extends State{

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除过积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍候");
        Random r = new Random();
        int num = r.nextInt(10);
        if (num == 0) {
            System.out.println("中奖了！！");
            activity.setState(activity.getDispenseState());
            return true;
        }
        else{
            System.out.println("很遗憾没有中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
