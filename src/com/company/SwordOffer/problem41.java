package com.company.SwordOffer;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/5/12.
 */
public class problem41 {

    public static void main(String[] args){
        System.out.println(FindContinuousSequence(15));
    }

    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(sum < 3){
            return result;
        }
        int small = 1;
        int big = 2;

        int middle = (sum+1) / 2;
        int currentSum = small + big;
        while(small < middle){
            if(currentSum == sum){
                ArrayList<Integer> aresult = new ArrayList<>();
                for(int i=small; i<=big; i++){
                    aresult.add(i);
                }
                result.add(aresult);
                big++;
                currentSum += big;
            }else if(currentSum < sum){
                big ++;
                currentSum += big;
            }else{
                currentSum -= small;
                small ++;
            }
        }
        return result;
    }
}
