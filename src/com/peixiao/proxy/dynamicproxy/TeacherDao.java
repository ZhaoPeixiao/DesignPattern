package com.peixiao.proxy.dynamicproxy;

/**
 * @Author: Peixiao Zhao
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public void finish() {
        System.out.println("Teacher is finishing");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }
}
