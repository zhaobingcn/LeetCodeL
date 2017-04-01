package com.company.Hiho;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/1.
 */
public class xiaoHo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++){
            a[i] = input.nextInt();
        }
        int newSeq[] = seq(N, a);
        for(int i=0; i<newSeq.length; i++){
            System.out.print(newSeq[i] + " ");
        }

    }

    static int[] seq(int len, int allSeq[]){
        int flag=0;
        for(int i=len-1; i>=1; i--){
            if(allSeq[i-1] < allSeq[i]){
                continue;
            }else{
                flag = i-1;
            }
        }
        int newSeq[] = new int[flag+1];
        for(int i=0; i<=flag; i++){
            newSeq[i] = allSeq[i];
        }
        return newSeq;
    }


}
