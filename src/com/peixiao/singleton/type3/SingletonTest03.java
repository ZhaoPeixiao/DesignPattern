package com.peixiao.singleton.type3;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1, 线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

// 懒汉式（线程不安全）
// 优点：lazy loading， 但是只能在单线程下使用
// 如果在多线程下，如果有一个线程进入到if判断语句中且成立，还未来得及向下执行
// 另一个线程也进入if语句中，便会产生多个实例，所以在多线程下不可使用。
// 在实际开发中，不要使用这种方法.

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    // 提供一个静态的公有方法，当使用到该方法时 才创建instance
    // 即懒汉式

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
