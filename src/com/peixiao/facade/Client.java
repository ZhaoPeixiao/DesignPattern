package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
    }
}
