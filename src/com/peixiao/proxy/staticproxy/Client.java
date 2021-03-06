package com.peixiao.proxy.staticproxy;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        // 创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        // 创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通过代理对象， 调用到被代理对象的方法
        teacherDaoProxy.teach();

        // 在不修改目标对象功能的前提下，能通过代理对象对目标功能扩展
        // 因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类
        // 一旦接口增加方法，目标对象与代理对象都要维护
    }
}
