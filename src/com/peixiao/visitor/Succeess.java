package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */
public class Succeess extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("Man gave success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman gave success");
    }
}
