package com.peixiao.singleton.type8;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("枚举方式");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}


// 借助JDK1.5添加的枚举来实现单例模式，不仅能避免多线程同步问题，而且还能
// 防止反序列化重新创建新的对象
// 是Effective Java作者提倡的方式
// 推荐使用

enum Singleton {
    INSTANCE;   // 属性
    public void sayOK(){
        System.out.println("OK");
    }
}


