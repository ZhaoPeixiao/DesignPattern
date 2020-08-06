package com.peixiao.bridge;

/**
 * @Author: Peixiao Zhao
 */
public class ChildrenPhone extends Phone{
    public ChildrenPhone(Brand brand) {
        super(brand);
    }

    public void boost(){
        super.boost();
        System.out.println("ChildrenPhone");
    }

    public void shutdown(){
        super.shutdown();
        System.out.println("ChildrenPhone");
    }

    public void call(){
        super.call();
        System.out.println("ChildrenPhone");
    }
}
