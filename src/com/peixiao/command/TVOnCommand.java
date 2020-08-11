package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */
public class TVOnCommand implements Command{
    // 聚合LightReceiver
    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void excute() {
        // 调用接收者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tvReceiver.off();
    }
}
