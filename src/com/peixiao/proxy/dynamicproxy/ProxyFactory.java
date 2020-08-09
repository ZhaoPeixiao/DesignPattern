package com.peixiao.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Peixiao Zhao
 */
public class ProxyFactory {

    // 维护一个目标对象 Obeject
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){

        // 说明
//        public static Object newProxyInstance(ClassLoader loader,
//                Class<?>[] interfaces,
//                InvocationHandler h)
        // 1. ClassLoader 指定当前目标使用的类加载器，获取加载器的方法的方法固定
        // 2. interfaces  目标对象实现的接口类型，使用泛型方法确认类型
        // 3. InvocationHandler 事件处理，执行目标对象的方法时，会去触发事件处理器
        //                      会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        // 通过反射机制 调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return returnVal;
                    }

                });
    }
}