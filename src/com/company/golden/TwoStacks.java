package com.company.golden;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhzy on 2017/5/15.
 */
public class TwoStacks {

    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,10,23,33,45,45,45,3,35,3,54,3,35,45,23,54,35565,4545,64,545,46,4,453,456,4,5,3454,5,6,6};
        System.out.println(twoStacksSort(numbers));
    }

    public static ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here

        Stack<Integer> sortedStack = new Stack<Integer>();

        Stack<Integer> noSortedStack = new Stack<Integer>();
        for(int i=numbers.length-1; i>=0; i--){
            noSortedStack.add(numbers[i]);
        }

        int temp;
        while(!noSortedStack.isEmpty()){
            temp = noSortedStack.pop();
            while(!sortedStack.isEmpty() && temp < sortedStack.peek()){
                noSortedStack.add(sortedStack.pop());
            }
            sortedStack.add(temp);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while(!sortedStack.isEmpty()){
            result.add(sortedStack.pop());
        }
        return result;
    }
}
