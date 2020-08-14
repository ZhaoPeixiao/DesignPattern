package com.peixiao.observer.improve;


import java.util.ArrayList;

/**
 * @Author: Peixiao Zhao
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
//        currentConditions.update(getTemperature(), getPressure(), getHumidity());
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
