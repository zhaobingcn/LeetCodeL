package com.java_interview.SynchronizedMethodTest;

/**
 * Created by zhzy on 2017/10/19.
 */
public class Counter {
    long a = 0;
    public synchronized void add(long value){
        this.a = a + value;
    }
}
