package com.peixiao.singleton.type6;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// double-check 在多线程开发中常见，经行两次检查，保证线程安全。
// 实例化只用执行一次，后面再次访问的时候直接return
// 线程安全，延迟加载，效率较高

class Singleton{
    // volatile 防止指令重排，保证可见性
    private static volatile Singleton instance;

    private Singleton(){

    }

    // 提供一个静态公有方法，加入双重检查代码，解决线程安全问题，同时解决懒汉加载问题

    public static  Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
