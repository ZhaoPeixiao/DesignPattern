package com.peixiao.build.improve;

/**
 * @Author: Peixiao Zhao
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("Build high building basic of 30m");
    }

    @Override
    public void buildWall() {
        System.out.println("Build high building wall of 30cm");
    }

    @Override
    public void roofed() {
        System.out.println("build high building roof");
    }
}
