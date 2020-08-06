package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class Apple implements Brand{
    @Override
    public void boost() {
        System.out.println("Hello!");
    }

    @Override
    public void shutdown() {
        System.out.println("Apple Shutdown");
    }

    @Override
    public void call() {
        System.out.println("Hi Siri");
    }
}
