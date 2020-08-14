package com.peixiao.observer.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions("Test");
        weatherData.registerObserver(currentConditions);
        BaiduConditions baiduConditions = new BaiduConditions("Baidu");
        weatherData.registerObserver(baiduConditions);

        weatherData.setData(10, 100, 30);

        System.out.println("==== remove =====");
        weatherData.removeObserver(currentConditions);
        weatherData.setData(30, 150, 40);
    }
}
