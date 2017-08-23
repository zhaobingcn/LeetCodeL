package com.company.com_360;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/8/23.
 */
public class Queue {


    public static void main(String[] args) {
        ArrayList<Integer[]> result = new ArrayList<>();

        Integer[] queue = new Integer[20];

        toQueue(10, 10, result, queue);

        for(int i=0; i<result.size(); i++){
            System.out.println();
            for(int j=0; j<20; j++){
                System.out.print(result.get(i).clone()[j]);
            }
        }

    }

    /**
     *
     * @param man
     * @param famle
     * @param allAQueues
     * @param queue
     * 主要思路，从头开始的话看前面是什么安排，主要有三种情况，当当前剩余的man == famle，证明前面符合，但是当前拍下一个的只能是man
     * 因为如果排famle的话，当前队列中famle大于man显然是不对的
     * 当当前的man大于famle,并且当前的famle大于0就有两种情况，既可以放man又可以放famle，因为都可以满足提议
     * 当当前的man>famle并且当前的famle == 0时，证明此时famle已经都排列好了，剩下的全部都是man就可以了
     * 当man和famle都为0证明已经排好了一个队列
     */

    static  void toQueue(int man, int famle, ArrayList<Integer[]> allAQueues, Integer queue[]){

        if(man == 0 && famle == 0){
            allAQueues.add(queue.clone());
            return;
        }

        if(man == famle){
            queue[20 - man - famle] = 0;
            toQueue(man, famle-1, allAQueues, queue);
        }else if(man > famle && famle > 0){
            queue[20 - man - famle] = 1;
            toQueue(man-1, famle, allAQueues, queue);

            queue[20 - man -famle] = 0;
            toQueue(man, famle-1 , allAQueues, queue);
        }else {
            queue[20 - man - famle] = 1;
            toQueue(man-1, famle, allAQueues, queue);
        }


    }
}
