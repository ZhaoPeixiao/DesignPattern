package com.peixiao.singleton.type4;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2, 线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 懒汉式（线程安全，同步方法）
//      解决了线程安全问题
//      效率太低了， 每个线程在获取类的实例的时候都需要同步，而其实这个方法
//      执行一次实例化就够了，后面想获得直接 return 就可以，方法同步效率太低

//      在实际开发中，可用但效率低，不推荐
class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    // 提供一个静态的公有方法，当使用到该方法时 才创建instance
    // 加入同步处理代码，解决线程安全问题
    // 即懒汉式

    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
