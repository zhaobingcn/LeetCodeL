package com.java_interview.design_pattern.Observer.impl;

import com.java_interview.design_pattern.Observer.Observer;
import com.java_interview.design_pattern.Observer.Subject;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/10/20.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public  void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
