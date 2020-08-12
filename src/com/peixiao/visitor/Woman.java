package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
