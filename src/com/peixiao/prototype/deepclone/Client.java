package com.peixiao.prototype.deepclone;

/**
 * @Author: Peixiao Zhao
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "tom";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("son", "boy");

        // 方式1 深拷贝
//        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.clone();
//        System.out.println(deepPrototype.toString());
//        System.out.println(deepPrototype1.toString());

        // 方式2 深拷贝
        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println(deepPrototype.toString());
        System.out.println(deepPrototype1.toString());
    }
}
