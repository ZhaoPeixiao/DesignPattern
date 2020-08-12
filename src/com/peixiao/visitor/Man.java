package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */

// 这里使用到了双分派.
// 在客户端程序中，将具体状态作为参数传递到Man中
// 然后Man这个类，调用了做为参数的具体方法getManResult,同时将自己this作为参数
// 传递进去，完成第二次的分派
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
