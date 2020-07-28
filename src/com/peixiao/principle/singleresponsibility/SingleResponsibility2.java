package com.peixiao.principle.singleresponsibility;

/**
 * @Author: Peixiao Zhao
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.run("飞机");
    }
}

// 方案2的分析
// 1. 遵守了单一职责原则
// 2. 这样做的花销很大，即要将类分解，同时修改客户端
// 3. 改进：直接修改vehilce类，改动的代码比较少
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行....");
    }
}

class SkyVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空运行....");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里运行....");
    }
}