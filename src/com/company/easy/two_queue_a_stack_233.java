package com.company.easy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by zhzy on 2017/3/27.
 */

/**
 * 两个队列实现一个栈，记录住当前栈顶在哪个队列中，
 * 每次新加入一个数据的时候看代表当前栈顶的队列是否为空，为空的话直接加入，否则删除该队列栈顶并添加到另一个队列中，然后添加该数据到栈顶队列
 * 删除栈顶数据时需要将栈顶队列和输入数据对换，让另一个队列只剩一个数据，这个队列变为栈顶队列
 */
public class two_queue_a_stack_233 {
    public class MyStack {

        Queue<Integer> qa;
        Queue<Integer> qb;
        int nowStackTop = 1;
        /** Initialize your data structure here. */
        public MyStack() {
            qa = new ArrayDeque<>();
            qb = new ArrayDeque<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            if(nowStackTop == 1){
                if(qa.isEmpty()){
                    qa.add(x);
                }else{
                    qb.add(qa.remove());
                    qa.add(x);
                }
            }else{
                if(qb.isEmpty()){
                    qb.add(x);
                }else{
                    qa.add(qb.remove());
                    qb.add(x);
                }
            }

        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int popNum = 0;
            if(nowStackTop ==1){
                if(!qa.isEmpty()){
                    popNum = qa.remove();
                    while (qb.size()>1){
                        qa.add(qb.remove());
                    }
                    nowStackTop = 2;
                }
            }else{
                if(!qb.isEmpty()){
                    popNum = qb.remove();
                    while (qa.size()>1){
                        qb.add(qa.remove());
                    }
                    nowStackTop = 1;
                }
            }
            return popNum;
        }

        /** Get the top element. */
        public int top() {
            if(nowStackTop ==1){
                if(!qa.isEmpty()){
                    return qa.peek();
                }
            }else{
                if(!qb.isEmpty()){
                    return qb.peek();
                }
            }
            return 0;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if(qa.isEmpty() && qb.isEmpty()){
                return true;
            }
            return false;
        }
    }
}
