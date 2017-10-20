package com.java_interview.design_pattern.Observer.impl;

/**
 * Created by zhzy on 2017/10/20.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(w);

        w.setMeasurements(23,34,23);
        w.setMeasurements(34,45,45);

    }
}
