package com.company.microsoft.forface.stackqueue;

import java.util.Stack;

/**
 * Created by zhzy on 2017/4/13.
 */
public class pushA_popB {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> pushStack = new Stack<Integer>();

        int j=0;
        for(int i=0; i<pushA.length; i++){
            pushStack.add(pushA[i]);
            while(pushStack.peek() == popA[j]){
                pushStack.pop();
                j++;
            }
        }

        if(pushStack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
