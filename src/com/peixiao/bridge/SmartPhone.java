package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class SmartPhone extends Phone{

    public SmartPhone(Brand brand) {
        super(brand);
    }

    public void boost(){
        super.boost();
        System.out.println("SmartPhone");
    }

    public void shutdown(){
        super.shutdown();
        System.out.println("SmartPhone");
    }

    public void call(){
        super.call();
        System.out.println("SmartPhone");
    }
}
