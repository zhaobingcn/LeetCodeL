package com.skill.ProductorAndConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhzy on 2017/8/28.
 */
public class BlockQueue {

    private static Object signal = new Object();
    List thingsList = new ArrayList();
    boolean bFull = false;
    public void consume() throws Exception{
        synchronized (signal){
            if(bFull == false){
                try {
                    signal.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            bFull = false;
            System.out.println("consume");
            signal.notify();
        }

        if(thingsList.size() > 0){
            thingsList.remove(thingsList.size() - 1);
        }
    }

    public void product(String string) throws Exception{
        synchronized (signal){
            if(bFull == false){
                bFull = true;
                System.out.println("product");
                thingsList.add(string);
                signal.notify();
            }
            signal.wait();
        }
    }

    public static void main(String[] args) {
        BlockQueue blockQueue = new BlockQueue();

        Thread thread1 = new Thread(new Consumer(blockQueue));
        Thread thread2 = new Thread(new Producer(blockQueue));

        thread1.start();
        thread2.start();
    }

}
