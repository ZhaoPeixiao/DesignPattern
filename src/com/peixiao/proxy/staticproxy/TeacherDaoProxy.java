package com.peixiao.proxy.staticproxy;

/**
 * @Author: Peixiao Zhao
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target;     // 目标对象,通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始代理......");
        target.teach();
        System.out.println("提交...........");
    }
}
