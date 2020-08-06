package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class Huawei implements Brand{
    @Override
    public void boost() {
        System.out.println("HONOR MY WORLD");
    }

    @Override
    public void shutdown() {
        System.out.println("Huawei, Shutdown");
    }

    @Override
    public void call() {
        System.out.println("Huawei is calling");
    }
}
