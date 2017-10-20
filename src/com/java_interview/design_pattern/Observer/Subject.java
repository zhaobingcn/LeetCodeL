package com.java_interview.design_pattern.Observer;

/**
 * Created by zhzy on 2017/10/20.
 */
public interface Subject {

    public  void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
