package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("Man gave wait");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman gave wait");
    }
}
