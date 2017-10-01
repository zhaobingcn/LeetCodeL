package com.company.easy;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zhzy on 2017/3/27.
 */

/**
 * 专门这是一个栈用来存放最小值，最小值栈顶即为当前栈的最小值，如果最小值有重复都要加入，删除的话
 * 如果栈顶元素与最小值栈栈顶元素一样，则两个栈都删除栈顶
 */
public class min_stack_155 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MinStack mystack = new MinStack();
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            mystack.push(in.nextInt());
        }
        mystack.pop();
        System.out.println(mystack.getMax() + "," + mystack.getMin());
    }

    static class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minstack;
        Stack<Integer> maxstack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();
            maxstack = new Stack<>();
        }

        public void push(int x) {
            if(minstack.isEmpty()){
                minstack.push(x);
            }else{
                if(x <= getMin()){
                    minstack.push(x);
                }
            }
            if(maxstack.isEmpty()){
                maxstack.push(x);
            }else {
                if(x >= getMax()){
                    maxstack.push(x);
                }
            }
            stack.push(x);

        }

        public void pop() {
            if(!stack.isEmpty()){
                if(stack.peek() == getMin()){
                    minstack.pop();
                    stack.pop();
                }else if (stack.peek() == getMax()){
                    maxstack.pop();
                    stack.pop();

                }else{
                    stack.pop();
                }
            }else{
                return;
            }

        }

        public int top() {
            if(stack.isEmpty()){
                return 0;
            }else{
                return stack.peek();
            }
        }

        public int getMin() {
            if(!minstack.isEmpty()){
                return minstack.peek();
            }else {
                return 0;
            }
        }
        public int getMax(){
            if(!maxstack.isEmpty()){
                return maxstack.peek();
            }else {
                return 0;
            }
        }
    }
}
