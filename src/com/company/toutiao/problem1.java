package com.company.toutiao;

/**
 * Created by zhzy on 2017/4/18.
 */
import java.util.Arrays;
import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1)
            return;
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        int m=sc.nextInt();
        if(m<1)
            return;
        int[]b=new int[m];
        int[]aa=new int[m];
        for(j=0;j<m;j++){
            int nn=sc.nextInt();
            b[j]=nn;
            aa[j]=nn;

        }

        int[]c=new int[n>m?n:m];

        Arrays.sort(a);
        Arrays.sort(b);

        i=0;
        j=0;
        int k=0;
        while(i<n&&j<m){
            if(a[i]==b[j]){
                c[k++]=a[i];
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }

        }

        for(i=0;i<m;i++){
            for(j=0;j<k;j++)
                if(aa[i]==c[j])
                    System.out.print(aa[i]+" ");
        }
    }
}
