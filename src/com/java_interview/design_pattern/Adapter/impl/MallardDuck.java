package com.java_interview.design_pattern.Adapter.impl;

import com.java_interview.design_pattern.Adapter.Duck;

/**
 * Created by zhzy on 2017/10/20.
 */
public class MallardDuck implements Duck {

    public void quack(){
        System.out.println("Quack");
    }
    public void fly(){
        System.out.println("I am flaying");
    }
}
