package com.peixiao.state;

/**
 * @Author: Peixiao Zhao
 */
public class DispenseOutState extends State{

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完毕，下次再来");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完毕，下次再来");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完毕，下次再来");
    }
}
