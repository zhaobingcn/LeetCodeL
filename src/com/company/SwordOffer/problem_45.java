package com.company.SwordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem_45 {

    public static void main(String[] args){

    }
    public int LastRemaining_Solution(int n, int m) {
        List<Integer> circle = new ArrayList<>();
        for(int i=0; i<n; i++){
            circle.add(i);
        }

        int curIndex = m-1;
        while(circle.size() > 1){
            circle.remove(curIndex);
            curIndex = (curIndex + m) % circle.size();
        }
        return circle.get(0);
    }
}
