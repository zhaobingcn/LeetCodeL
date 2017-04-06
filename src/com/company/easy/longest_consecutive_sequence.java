package com.company.easy;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/4.
 */
public class longest_consecutive_sequence {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for(int i=0; i<len; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(longestConsecutive(nums));
    }

    static int longestConsecutive(int nums[]){

        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            numMap.put(nums[i], false);
        }
        int longest = 0;
        for(int i=0; i<nums.length; i++){
            if(numMap.get(nums[i])){
                continue;
            }
            int length = 1;
            numMap.put(nums[i], true);
            for(int j=nums[i]-1; numMap.containsKey(j); j--){
                numMap.put(j, true);
                length++;
            }
            for(int j=nums[i]+1; numMap.containsKey(j); j++){
                numMap.put(j, true);
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
