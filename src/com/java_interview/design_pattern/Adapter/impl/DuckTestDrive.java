package com.java_interview.design_pattern.Adapter.impl;

import com.java_interview.design_pattern.Adapter.Duck;

/**
 * Created by zhzy on 2017/10/20.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");

        turkey.gobble();
        turkey.fly();

        System.out.println("\nthe duck says");
        testDuck(mallardDuck);

        System.out.println("\nthe turkeyAdapter says");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
