package com.java_interview.design_pattern.Observer.impl;

import com.java_interview.design_pattern.Observer.DisplayElement;
import com.java_interview.design_pattern.Observer.Observer;
import com.java_interview.design_pattern.Observer.Subject;

/**
 * Created by zhzy on 2017/10/20.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and" + humidity + "% humidity");

    }
}
