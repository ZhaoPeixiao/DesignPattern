package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */
public class LightOnCommand implements Command{

    // 聚合LightReceiver
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        // 调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        lightReceiver.off();
    }
}
