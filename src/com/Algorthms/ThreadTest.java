package com.Algorthms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhzy on 2017/8/25.
 */
public class ThreadTest {
//    private static AtomicInteger atomicInteger =new AtomicInteger();
//
//    public static void main(String[] args) {
//        A a =new A();
//        try {
//            atomicInteger.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        a.start();
//    }
//
//    static class   A extends Thread{
//        @Override
//        public void run(){
//            atomicInteger.notify();
//            atomicInteger.lazySet(1);
//            System.out.println(atomicInteger.get());
//
//        }
//    }
public static void resetList(List<Integer> dataList){
    dataList.subList(2, 4).set(0,40);
    dataList = new ArrayList<Integer>(dataList);
    dataList.add(50);
}
    public static void setOne(List<Integer> dataList){
        dataList.set(3, 100);
    }
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10,20,30,null));
        resetList(dataList);
        setOne(dataList);
        int sum = 0;
        for(Integer v:dataList){
            sum += v;
        }
        System.out.println(sum);
    }
}
