package com.peixiao.visitor;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        // success
        Succeess succeess = new Succeess();

        objectStructure.display(succeess);
    }
}
