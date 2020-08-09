package com.peixiao.proxy.cglibproxy;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        // 创建目标对象
        TeacherDao target = new TeacherDao();

        // 获取代理对象，并且将目标对象传递给代理对象
        ProxyFactory factory = new ProxyFactory(target);
        TeacherDao instance = (TeacherDao) factory.getProxyInstance();

        // 执行代理对象的方法，触发intercept 方法，从而实现对目标对象的调用
        instance.teach();
        instance.sayHello("Tom");
        String name = instance.getName();
    }
}
