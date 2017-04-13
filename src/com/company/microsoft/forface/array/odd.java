package com.company.microsoft.forface.array;

/**
 * Created by zhzy on 2017/4/13.
 */
public class odd {

    public static void main(String[] args){
        int a[]= {2,6,3,7,9,8,6};
        reOrderArray(a);
    }
    public static void reOrderArray(int [] array) {

        int p1 = 0;
        int p2 = 0;

        int len = array.length;
        while(p1 <= len -1 && p1 <=len-1){
            while(p2 <len-1 && !isEven(array[p2])){
                p2++;
            }
            while(p2 < len-1 && isEven(array[p2]) && isEven(array[p2+1])){
                p2++;
            }
            p1 = p2+1;
            if(p1 == len){
                break;
            }
            int p3 = p1;
            while(p3 >=1 && isEven(array[p3-1])){
                int temp = array[p3];
                array[p3] = array[p3-1];
                array[p3-1] = temp;
                p3--;
            }
        }
    }
    static boolean isEven(int a){
        if(a %2 == 0){
            return true;
        }
        return false;
    }
}
