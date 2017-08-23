package com.company.wangyi;

import java.util.*;

/**
 * Created by zhzy on 2017/8/12.
 */
public class problem3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
//        List<Integer> a_i = new LinkedList<Integer>();
//        for(int i=0; i<n; i++){
//            a_i.add(scanner.nextInt());
//        }
//
////        Stack<Integer> stack1 = new Stack<>();
////        Stack<Integer> stack2 = new Stack<>();
//        List<Integer> out = new LinkedList<>();
//        int flag = 1;
//        for(Integer num: a_i){
//            if(flag % 2 == 1){
//                out.add(0, num);
//            }else{
//                out.add(num);
//            }
//        }
////        int size = out.size();
//        if(n % 2 == 1){
//            for(int i=0; i<n-1; i++){
//                System.out.print(out.get(i) + " ");
//            }
//            System.out.print(out.get(n-1));
//        }else{
//            for(int i=n-1;i>0; i--){
//                System.out.print(out.get(i) + " ");
//            }
//            System.out.print(out.get(0));
//        }

        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0; i<n; i++){
            b.add(scanner.nextInt());
        }

        int j;
        if(n % 2 == 1 ){
            for(int i=n-1; i>=0; i = i-2){
                System.out.print(b.get(i) + " ");
            }
            for(j=1; j < n-2; j = j+2){
                System.out.print(b.get(j) + " ");
            }
            System.out.print(b.get(j));
        }else{
            for(int i=n-1; i>=0; i = i-2){
                System.out.print(b.get(i) + " ");
            }
            for(j=0; j < n-2; j = j+2){
                System.out.print(b.get(j) + " ");
            }
            System.out.print(b.get(j));
        }

    }
}
