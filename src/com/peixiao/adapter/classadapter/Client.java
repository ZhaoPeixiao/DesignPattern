package com.peixiao.adapter.classadapter;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("==类适配器模式==");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }


    // 因为java是单继承机制，所以类适配器必须要继承src类，因此dst必须是接口
    // src类的方法在Adapter中会暴露
    // 由于继承了src，可以重写src方法，增加了Adapter灵活性
}
