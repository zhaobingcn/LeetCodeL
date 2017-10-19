package com.skill.ProductorAndConsumer;

import java.util.PriorityQueue;

/**
 * Created by zhzy on 2017/10/19.
 */
public class NewBlockingQueue {

    int queueSize = 10;
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        NewBlockingQueue blockingQueue = new NewBlockingQueue();
        Producer producer = blockingQueue.new Producer();
        Consumer consumer = blockingQueue.new Consumer();
        producer.start();
        consumer.start();



    }

    class Producer extends Thread{

        public void run(){
            produce();
        }

        void produce(){

            while (true){
                synchronized (queue){
                    try {
                        while(queue.size() == queueSize){
                            System.out.println("当前队列已满，等待消费者消费");
                            queue.wait();
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        queue.notify();
                    }

                    queue.offer(1);
                    queue.notify();
                    System.out.println("生产了一个元素，队列剩余存储空间" + (queueSize - queue.size() )+ "个");
                }
            }
        }
    }

    class Consumer extends Thread{

        public void run(){
            consume();
        }

        void consume(){

            while(true){
                synchronized(queue){
                    try {
                        while (queue.size() == 0){
                            System.out.println("当前队列已空，等待生产者生产");
                            queue.wait();
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        queue.notify();
                    }
                    queue.poll();
                    queue.notify();
                    System.out.println("消费了一个元素，队列中剩余的元素是"+ queue.size() + "个");

                }
            }
        }

    }



}
