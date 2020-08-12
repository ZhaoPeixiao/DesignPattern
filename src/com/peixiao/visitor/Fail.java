package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("Man gave fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman gave fail");
    }
}
