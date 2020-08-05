package com.peixiao.adapter.objectadapter;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("==对象适配器模式==");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220V()));
    }

}
