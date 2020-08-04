package com.peixiao.build;

/**
 * @Author: Peixiao Zhao
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBacis() {
        System.out.println("building basic for common house");
    }

    @Override
    public void buildWall() {
        System.out.println("building wall for common house");
    }

    @Override
    public void roofed() {
        System.out.println("roofed for common house");
    }
}
