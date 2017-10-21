package com.java_interview.design_pattern.Adapter.impl;

import com.java_interview.design_pattern.Adapter.Duck;
import com.java_interview.design_pattern.Adapter.Turkey;

/**
 * Created by zhzy on 2017/10/20.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }
    public void fly(){
        for(int i=0; i<5; i++){
            turkey.fly();
        }
    }

}
