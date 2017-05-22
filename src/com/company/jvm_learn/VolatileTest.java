package com.company.jvm_learn;

/**
 * Created by zhzy on 2017/5/22.
 *
 * volatile变量自增测试
 */
public class VolatileTest {


    public  static volatile int race = 0;

    public static void increase(){
        ++ race;
    }

    private static final int THREAD_COUNT=20;

    public  static void main(String[] args){
        Thread[] threads = new Thread[THREAD_COUNT];

        for(int i=0; i<THREAD_COUNT; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0; j<1000000; j++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() < 1){
            Thread.yield();
        }

        System.out.println(race);
    }


}
