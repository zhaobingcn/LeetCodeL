package com.Algorthms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/22.
 */
//public class Main {
//    public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> L) {
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int num = scanner.nextInt();
//        int array[] = new int[num];
//
//        for(int i=0; i<num; i++){
//            array[i] = scanner.nextInt();
//        }
//
//        int K = scanner.nextInt();
//
//        for()
//
//
//}

public class Main {
    public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> L) {
        if (L.size() > 0) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            for(int i=0; i<L.size(); i++){
                ArrayList<Integer> aresult = new ArrayList<>();
                for(int j=0; j+i<L.size(); j++){
                    aresult.add(L.get(j+i));
                }
                result.add(aresult);
            }
            return result;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<Integer>();

        for(int i=0; i<num; i++){
            L.add(scanner.nextInt());
        }

        int K = scanner.nextInt();

        ArrayList<ArrayList<Integer>> result = getSubset(L);

        int max = 0;
        for(int i=0; i<result.size(); i++){
            int sum = 0;
            int size = result.get(i).size();
            for(int j=0; j<size; j++){
                sum = result.get(i).get(j) + sum;
            }
            if(sum % K == 0){
                if(size > max){
                    max = size;
                }
            }
        }

        System.out.println(max);
    }
}