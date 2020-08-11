package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */
public class TVOffCommand implements Command{
    // 聚合LightReceiver
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void excute() {
        // 调用接收者的方法
        tvReceiver.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tvReceiver.on();
    }
}
