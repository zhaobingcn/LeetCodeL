package com.company.easy;

import java.util.Stack;

/**
 * Created by zhzy on 2017/3/27.
 */

/**
 * 两个栈实现一个队列，一个栈专门用于数据输入，一个栈专门用于数据输出，
 * 输入时直接输入即可，输出时要检查输出栈是否为空，为空的话需要要把输入栈移动过来，然后再出栈
 */
public class two_stack_a_queue_232 {
    public class MyQueue {

        Stack<Integer> sa;
        Stack<Integer> sb;
        /** Initialize your data structure here. */
        public MyQueue() {
            sa = new Stack<>();
            sb = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            sa.add(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(!empty()){
                if(!sb.isEmpty()){
                    return sb.pop();
                }else{
                    while (!sa.isEmpty()){
                        sb.add(sa.pop());
                    }
                    return sb.pop();
                }
            }else{
                return 0;
            }
        }

        /** Get the front element. */
        public int peek() {
            if(!empty()){
                if(!sb.isEmpty()){
                    return sb.peek();
                }else{
                    while (!sa.isEmpty()){
                        sb.add(sa.pop());
                    }
                    return sb.peek();
                }
            }else{
                return 0;
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(sa.empty() && sb.empty()){
                return true;
            }else {
                return false;
            }
        }
    }
}
