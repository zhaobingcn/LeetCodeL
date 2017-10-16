package com.company.ali;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/26.
 */
public class problem4 {

    public static void main(String[] args){

        int n;
        int m;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        double offset = 0.0;

        Arrays.co

        double before =  (m+n-2)*1.0 / (m+n);
        double after = before * 2;

        offset = after * 1;

        for(int i=1; i<100; i++){
            offset = offset + Math.pow(before, i)* after * (i+1);
        }


        int len = m+n;

        double[][] mat = new double[len+1][len+1];

        mat[m+n-1][1] = offset;

        for(int i=m+n-2; i>=1 ; i--){
            int j = m+n - i;
            if(j >0){
                if(j - 1 >0 && i+1 <m+n)
                    mat[i][j] += after * mat[i+1][j-1];
                if(j-2 >0 && i+2 <m+n)
                    mat[i][j] += before * mat[i+2][j-2];
//                if(i - 2 >0)
//                    mat[i][j] += before * mat[i][j];
            }
        }

        System.out.printf("%.1f\n",mat[n][m]);
    }

}


//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.nextLine();
//
//        int k = Integer.parseInt(sc.nextLine());
//        sc.close();
//
//        Map<Character, Integer> aa = new HashMap<Character, Integer>();
//
//        for (char ch : s.toCharArray()) {
//            aa.put(ch, aa.containsKey(ch) ? aa.get(ch) + 1 : 1);
//        }
//        int[] counts = new int[aa.size() + 1];
//        int i = 1;
//        for (Integer count : aa.values()) {
//            counts[i] = count;
//            i++;
//        }
//        counts[0] = 0;
//        Arrays.sort(counts);
//
//        int ll = counts.length - 1;
//        int qq = ll - 1;
//        while (qq >= 0) {
//            while (counts[qq] == counts[qq + 1]) qq--;
//            int tmp = (ll - qq) * (counts[qq + 1] - counts[qq]);
//            if (tmp <= k) {
//                k -= tmp;
//                qq--;
//            } else {
//                break;
//            }
//        }
//        qq++;
//        int jjj = counts[qq];
//        if (k > 0) {
//            int tmp = k / (ll - qq + 1);
//            k = k % (ll - qq + 1);
//            jjj -= tmp;
//        }
//
//        int ans = 0;
//        for (i = 1; i <= ll; i++) {
//            if (i < qq) {
//                ans += counts[i] * counts[i];
//            } else {
//                if (k > 0) {
//                    ans += (jjj - 1) * (jjj - 1);
//                    k--;
//                } else {
//                    ans += jjj * jjj;
//                }
//            }
//        }
//
//        System.out.println(ans);
//    }
//
//}