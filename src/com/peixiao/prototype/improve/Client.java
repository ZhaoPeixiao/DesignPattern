package com.peixiao.prototype.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型模式完成对象创建");
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.friend = new Sheep("jack", 2, "black");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep.toString() + sheep.friend + sheep.friend.hashCode());
        System.out.println(sheep1.toString() + sheep1.friend + sheep1.friend.hashCode());
        System.out.println(sheep2.toString() + sheep2.friend + sheep2.friend.hashCode());
        System.out.println(sheep3.toString() + sheep3.friend + sheep3.friend.hashCode());
        System.out.println(sheep4.toString() + sheep4.friend + sheep4.friend.hashCode());
    }
}
