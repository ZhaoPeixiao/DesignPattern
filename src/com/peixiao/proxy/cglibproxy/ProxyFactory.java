package com.peixiao.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Peixiao Zhao
 */
public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象, 是target 对象的代理对象
    public Object getProxyInstance(){
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象， 即代理对象
        return enhancer.create();
    }

    // 重写 intercept 方法， 会调用目标对象的相关方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib Proxy starts");
        Object returnVal =  method.invoke(target, objects);
        System.out.println("Cglib Proxy submits");
        return returnVal;
    }
}
