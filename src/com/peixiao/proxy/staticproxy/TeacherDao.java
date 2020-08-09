package com.peixiao.proxy.staticproxy;

/**
 * @Author: Peixiao Zhao
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {

        System.out.println("Teacher is teaching");
    }
}
