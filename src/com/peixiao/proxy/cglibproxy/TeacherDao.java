package com.peixiao.proxy.cglibproxy;

/**
 * @Author: Peixiao Zhao
 */
public class TeacherDao {

    public void teach(){
        System.out.println("Teacher is teaching, Cglib Proxy, No Interfaces");
    }

    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

    public String getName(){
        return "Mr.Zhao";
    }
}
