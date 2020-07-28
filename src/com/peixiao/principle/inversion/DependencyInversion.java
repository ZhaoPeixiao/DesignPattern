package com.peixiao.principle.inversion;

/**
 * @Author: Peixiao Zhao
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


class Email{
    public String getInfo(){
        return "电子邮件信息: Hello World!";
    }
}
// 完成Person接收消息的功能
// 方式1完成
// 1. 简单，比较容易想到
// 2. 如果我们获取的对象是微信，短袖等，则需要新增类，同时Person类要增加相应的接收方法
// 3. 解决方法： 引入一个抽象的接口 IReceiver 表示接受者，这样Person类与接口发生依赖
//    因为Email，WeChat都属于接收的范围，各自实现 IReceiver 接口就可以，实现依赖倒转原则

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}