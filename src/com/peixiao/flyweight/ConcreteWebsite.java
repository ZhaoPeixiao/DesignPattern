package com.peixiao.flyweight;

/**
 * @Author: Peixiao Zhao
 */
public class ConcreteWebsite extends Website{

    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("Website's type is : " + type + ", User is " + user.getName());
    }

}
