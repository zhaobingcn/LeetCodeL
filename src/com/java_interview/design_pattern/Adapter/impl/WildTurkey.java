package com.java_interview.design_pattern.Adapter.impl;

import com.java_interview.design_pattern.Adapter.Turkey;

/**
 * Created by zhzy on 2017/10/20.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
