package com.peixiao.state;

/**
 * @Author: Peixiao Zhao
 */
public class DispenseState extends State{

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0){
            System.out.println("恭喜中奖！");
            activity.setState(activity.getNoRaffleState());
        }
        else{
            System.out.println("很遗憾，奖品发完了");
//            activity.setState(activity.getDipenseOutState());
            System.out.println("游戏结束");
            System.exit(0);
        }
    }
}
