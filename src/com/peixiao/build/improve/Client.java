package com.peixiao.build.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();

        System.out.println("process");

        HighBuilding highBuilding = new HighBuilding();
        houseDirector = new HouseDirector(highBuilding);
        house = houseDirector.constructHouse();

    }
}
