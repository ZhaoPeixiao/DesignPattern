package com.peixiao.singleton.type7;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}


// 静态内部类完成
// 使用类装载的机制来保证初始化实例只有一个线程
// 静态内部类在Singleton类被装载的时候不会立即被初始化，而是在需要实例化的时候
// 调用getInstance的时候才会装载SingletonInstance类，从而完成Singleton的实例化
// 类的静态属性只会在第一次加载类的时候初始化，所以在这里 JVM 帮助我们保证了线程的安全
// 在类进行初始化的时候，别的线程是无法进入的
// 避免了线程不安全，利用静态内部类的特点实现延迟加载，效率高
// 推荐使用
class Singleton{

    private Singleton(){

    }

    // 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE  = new Singleton();
    }

    // 提供一个静态公有方法，直接返回SingletonInstance.INSTANCE

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
