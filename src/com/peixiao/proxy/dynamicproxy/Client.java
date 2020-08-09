package com.peixiao.proxy.dynamicproxy;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        // 创建一个目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标对象创建代理对象
        // 可以转成 ITeacherDao
        ProxyFactory factory = new ProxyFactory(target);
        ITeacherDao instance = (ITeacherDao) factory.getProxyInstance();

        // class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(instance.getClass());

        // 通过代理对象调用目标对象的方法
        instance.teach();
//        instance.finish();
        instance.sayHello("Tom");
    }
}
