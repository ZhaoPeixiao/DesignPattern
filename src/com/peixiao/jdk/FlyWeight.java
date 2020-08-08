package com.peixiao.jdk;

/**
 * @Author: Peixiao Zhao
 */
public class FlyWeight {

    public static void main(String[] args) {
        // -128 --- 127之间 取静态数组(池)的量
        // 超出该范围，使用new方法
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y));    // 大小 true
        System.out.println(x == y);         // false
        System.out.println(x == z);         // true
        System.out.println(w == x);         // false
        System.out.println(w == y);         // false
        System.out.println("--------------------");
        Integer a = Integer.valueOf(200);
        Integer b = Integer.valueOf(200);

        System.out.println(a.equals(b));    // true
        System.out.println(a == b);         // false
    }
}
