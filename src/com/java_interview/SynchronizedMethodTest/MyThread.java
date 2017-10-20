package com.java_interview.SynchronizedMethodTest;

/**
 * Created by zhzy on 2017/10/19.
 */
public class MyThread extends Thread {

    public static void main(String[] args) {

        Counter counter = new Counter();
        MyThread a = new MyThread(counter);
        MyThread b = new MyThread(counter);
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(counter.a);
    }

    protected Counter counter = null;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0; i<10000; i++){
            counter.add(1);
        }
    }
}
