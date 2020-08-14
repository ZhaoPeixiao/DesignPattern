package com.peixiao.observer.improve;

/**
 * @Author: Peixiao Zhao
 */
public class BaiduConditions implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;
    private String name;

    public BaiduConditions(String name) {
        this.name = name;
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("CurrentConditions{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", name='" + name + '\'' +
                '}');
    }
}
