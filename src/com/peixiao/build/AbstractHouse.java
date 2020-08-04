package com.peixiao.build;

/**
 * @Author: Peixiao Zhao
 */
public abstract class AbstractHouse {

    public abstract void buildBacis();

    public abstract void buildWall();

    public abstract void roofed();

    public void build(){
        buildBacis();
        buildWall();
        roofed();
    }
}
