package com.peixiao.singleton.type1;

/**
 * @Author: Peixiao Zhao
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}


// 饿汉式（静态变量）
// 优点：简单，在类装载的时候就完成实例化，避免了线程同步问题
// 缺点：在类装载的时候就完成实例化， 没有达到了lazy loading的效果。
//       如果从未使用过这个实例，就会造成内存的浪费

// 该单例模式可用，但会造成内存浪费

class Singleton {
    // 1. 构造器私有化, 外部不能new
    private Singleton(){

    }
    // 2. 在本类内部创建一个对象实例
    private final static Singleton instance = new Singleton();

    // 3. 对外提供一个公有的静态方法, 返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}