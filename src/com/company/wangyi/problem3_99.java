package com.company.wangyi;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/9/9.
 */
public class problem3_99 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String a = scanner.nextLine();

        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> second = new ArrayList<>();
        StringBuffer sum = new StringBuffer();

        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = false;
        for(int i=0; i<a.length(); i++){

            if(a.charAt(i) == '+'){
                flag1 = false;
                flag2 = true;
            }

            if(a.charAt(i) == '='){
                flag2 = false;
                flag3 = true;
            }

            if(flag1){
                first.add(a.charAt(i));
            }

            if(flag2 && a.charAt(i) != '+'){
                second.add(a.charAt(i));
            }

            if(flag3 && a.charAt(i) != '='){
                sum.append(a.charAt(i));
            }
        }

//        System.out.print(first + " " + second+ " " +sum.toString());

        long numSum = Integer.valueOf(sum.toString());

        int len1 = first.size();
        int len2 = second.size();

        HashMap<Character, Integer> rresult = new HashMap<>();

        for(int i=0; i<=9; i++){
            for(int j=0; j<=9 && j!=i; j++){

                int result = 0;
                for(int firstLength=0; firstLength<len1; firstLength++){
                    int sum1=0;
                    sum1 = (int)first.get(firstLength) - 48;
                    if(first.get(firstLength) == 'A'){
                        sum1 = i;
                    }else if(first.get(firstLength) == 'B') {
                        sum1 = j;
                    }
                    result = result + sum1 * (int)Math.pow(10, (len1-firstLength-1));
                }

                for(int seCondLength=0; seCondLength<len2; seCondLength++){
                    int sum1=0;
                    sum1 = (int)second.get(seCondLength) - 48;
                    if(second.get(seCondLength) == 'A'){
                        sum1 = i;
                    }else if(second.get(seCondLength) == 'B') {
                        sum1 = j;
                    }
                    result = result + sum1 * (int)Math.pow(10, (len2-seCondLength-1));
                }

//                System.out.println(result);
                if(result == numSum){
                    rresult.put('A', i);
                    rresult.put('B', j);
                }

            }
        }



        for(Map.Entry<Character, Integer> kk: rresult.entrySet()){
            System.out.println(kk.getKey() + " " + kk.getValue());
        }


    }

}
