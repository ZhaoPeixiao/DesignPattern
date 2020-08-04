package com.peixiao.build.improve;

/**
 * @Author: Peixiao Zhao
 */
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("Build common house basic of 5m");
    }

    @Override
    public void buildWall() {
        System.out.println("Build common house wall of 10cm");
    }

    @Override
    public void roofed() {
        System.out.println("build common roof");
    }
}
