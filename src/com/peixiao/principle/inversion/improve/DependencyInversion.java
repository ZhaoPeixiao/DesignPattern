package com.peixiao.principle.inversion.improve;

/**
 * @Author: Peixiao Zhao
 */
public class DependencyInversion {
    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

// 定义一个接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息: Hello World!";
    }
}

class WeChat implements IReceiver{
    public String getInfo(){
        return "微信信息: Hello World!";
    }
}

class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}