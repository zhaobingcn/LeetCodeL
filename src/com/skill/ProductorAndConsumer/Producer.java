package com.skill.ProductorAndConsumer;

/**
 * Created by zhzy on 2017/8/28.
 */
public class Producer implements Runnable{
    BlockQueue queue;

    public Producer(BlockQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                queue.product("test" + String.valueOf(i));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
