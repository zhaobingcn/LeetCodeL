package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/4/30.
 */
public class problem34 {

    public static void main(String[] args){
        System.out.println(GetUglyNumber_Solution(11));
    }

    public static  int GetUglyNumber_Solution(int index) {

        if(index < 0){
            return 0;
        }
        int ugly[] = new int[index];
        ugly[0] = 1;
        int number2 = 0;
        int number3 = 0;
        int number5 = 0;

        for(int i=1; i<ugly.length; i++){
            int min = min(ugly[number2]*2, ugly[number3]*3, ugly[number5]*5);
            ugly[i] = min;
            while (ugly[number2] *2 <= min){
                number2 ++;
            }
            while (ugly[number3] *3 <= min){
                number3 ++;
            }
            while (ugly[number5] *5 <= min){
                number5 ++;
            }
        }
        return ugly[index -1];
    }

    static int min(int a, int b, int c){
        int min = (a<b)?a:b;
        return (min<c)?min:c;
    }
}
