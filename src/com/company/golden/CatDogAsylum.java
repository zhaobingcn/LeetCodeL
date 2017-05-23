package com.company.golden;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by zhzy on 2017/5/23.
 */
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<animal> dogs = new ArrayDeque<>();
        Queue<animal> cats = new ArrayDeque<>();

        for(int i=0; i<ope.length; i++){
            if(ope[i][0] == 1){
                if(ope[i][1] > 0){
                    dogs.add(new animal(ope[i][1], i));
                }else{
                    cats.add(new animal(ope[i][1], i));
                }
            }else if(ope[i][0] == 2){
                if(ope[i][1] == 0){
                    if(!dogs.isEmpty() && !cats.isEmpty()){
                        if(dogs.peek().seq > cats.peek().seq){
                            result.add(cats.poll().ani);
                        }else {
                            result.add(dogs.poll().ani);
                        }
                    }else if(!dogs.isEmpty()){
                        result.add(dogs.poll().ani);
                    }else if(!cats.isEmpty()){
                        result.add(cats.poll().ani);
                    }
                }else if(ope[i][1] == -1){
                    if(!cats.isEmpty()){
                        result.add(cats.poll().ani);
                    }
                }else if(ope[i][1] == 1){
                    if(!dogs.isEmpty()){
                        result.add(dogs.poll().ani);
                    }
                }
            }
        }
        return result;

    }
    class animal{
        int ani;
        int seq;
        public animal(int ani, int seq){
            this.ani = ani;
            this.seq = seq;
        }
    }
}
