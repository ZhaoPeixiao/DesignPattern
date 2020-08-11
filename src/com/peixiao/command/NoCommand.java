package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */

// 没有任何命令，即空执行。用于初始化。当调用空命令时，对象什么都不做即可
// 这也是一种设计模式，可以省掉对空的判断

public class NoCommand implements Command{
    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}
