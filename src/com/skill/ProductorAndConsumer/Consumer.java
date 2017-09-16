package com.skill.ProductorAndConsumer;

/**
 * Created by zhzy on 2017/8/28.
 */
public class Consumer implements Runnable{

    BlockQueue queue;

    public Consumer(BlockQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                queue.consume();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
