package com.company.easy;

import java.util.Stack;

/**
 * Created by zhzy on 2017/3/27.
 */

/**
 * 专门这是一个栈用来存放最小值，最小值栈顶即为当前栈的最小值，如果最小值有重复都要加入，删除的话
 * 如果栈顶元素与最小值栈栈顶元素一样，则两个栈都删除栈顶
 */
public class min_stack_155 {
    public class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minstack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();
        }

        public void push(int x) {
            if(minstack.isEmpty()){
                minstack.push(x);
                stack.push(x);
            }else{
                if(x <= getMin()){
                    minstack.push(x);
                    stack.push(x);
                }else{
                    stack.push(x);
                }
            }

        }

        public void pop() {
            if(!stack.isEmpty()){
                if(stack.peek() == getMin()){
                    minstack.pop();
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
    }
}
