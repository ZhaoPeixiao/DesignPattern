package com.peixiao.principle.liskov.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 = " + a.func1(11, 3));
        System.out.println("1-8 = " + a.func1(1, 8));

        System.out.println("------------------");
        B b = new B();
        // 因为B类不在继承A类，因此调用者不会再认为func1在求减法
        // 调用完成的功能就很明确
        System.out.println("11+3 = " + b.func1(11, 3));
        System.out.println("1+8 = " + b.func1(1, 8));
        System.out.println("11+3+9 = " + b.func2(11, 3));
        System.out.println("11-3 = " +b.func3(11, 3));
    }
}


// 创建一个更加基础的基类
abstract class Base{
    // 把更加基础的方法和成员写到Base类中
    abstract int func1(int num1, int num2);
}

class A extends Base{
    @Override
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends Base{
    // 如果B需要使用A的方法，使用组合的关系
    private A a = new A();
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2){
        return func1(num1, num2) + 9;
    }

    public int func3(int num1, int num2){
        return a.func1(num1, num2);
    }
}