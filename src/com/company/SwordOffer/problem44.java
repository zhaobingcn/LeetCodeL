package com.company.SwordOffer;

import java.util.Arrays;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem44 {

    public static void main(String[] args){
        int[] numbers = {0,3,2,4,6};
        System.out.println(isContinuous(numbers));
    }

    public static boolean isContinuous(int [] numbers) {
        if(numbers.length == 0){
            return false;
        }

        Arrays.sort(numbers);
        int len = numbers.length;
        int countOfZero = 0;
        int countOfGap = 0;
        for(int i=0; i<len ;i++){
            if(numbers[i] == 0){
                countOfZero ++;
            }
        }

        int start = countOfZero;
        for(int i=start; i<len-1; i++){
            if(numbers[i] +1 != numbers[i+1]){
                if(numbers[i] == numbers[i+1]){
                    return false;
                }
                countOfGap += numbers[i+1] - numbers[i] - 1;
            }
        }
        return countOfZero >= countOfGap? true:false;
    }

}
