package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class XiaoMi implements Brand{
    @Override
    public void boost() {
        System.out.println("Xiaomi, Just for fans");
    }

    @Override
    public void shutdown() {
        System.out.println("XiaoMi, Shutdown");
    }

    @Override
    public void call() {
        System.out.println("Hi Xiao Ai!");
    }
}
