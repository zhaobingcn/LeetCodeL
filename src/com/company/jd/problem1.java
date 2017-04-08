package com.company.jd;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/7.
 */
public class problem1 {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double poss[] = new double[num];
        for(int i=0; i<num; i++){
            poss[i] = scanner.nextInt()*1.0 /100 ;
        }
        int need = (int)Math.ceil(num*0.6);
        System.out.println("need" + need);

        Integer[] a = new Integer[num];

        for(int i=0; i<num; i++){
            a[i] = i;
        }

        CombineAlgorithm ca = new CombineAlgorithm(a,need);
        Object[][] c = ca.getResutl();

        int d[][] = new int[c.length][need];
        for(int i=0; i<c.length; i++){
            for(int j=0; j<need; j++){
                d[i][j] = (int)c[i][j];
            }
        }


        double all = 0.0;
        double sum = 0.0;

        for(int i=0; i<c.length; i++){
            sum = 1.0;
            for(int j=0; j<need; j++){
                sum *= poss[(int)c[i][j]];
            }

            for(int k=0; k<num; k++){
                if(contains(d[i], a[i])){
                    continue;
                }
                sum *= (1.0-poss[a[k]]);
            }
            all = all+sum;
        }

        System.out.println(all);
    }

    static boolean contains(int a[], int b){
        for(int i=0; i<a.length; i++){
            if(b == a[i]){
                return true;
            }
        }
        return false;
    }
}

class CombineAlgorithm {

    private Object[] src;
    private int m;
    private int n;
    private int objLineIndex;
    public Object[][] obj;
    public CombineAlgorithm(Object[] src, int getNum) throws Exception {

        if (src == null)


        if (src.length < getNum)

        throw new Exception("要取的数据比原数组个数还 大 .");

        this.src = src;

        m = src.length;

        n = getNum;

        objLineIndex = 0;

        obj = new Object[combination(m,n)][n];

        Object[] tmp = new Object[n];

        combine(src, 0, 0, n, tmp);

    }


    public int combination(int m, int n) {

        if (m < n)

        return 0; // 如果总数小于取出的数，直接返回0

        int k = 1;

        int j = 1;
        for (int i = n; i >= 1; i--) {

            k = k * m;

            j = j * n;

            m--;

            n--;

        }

        return k / j;

    }


    private void combine(Object src[], int srcIndex, int i, int n, Object[] tmp) {

        int j;

        for (j = srcIndex; j < src.length - (n - 1); j++ ) {

            tmp[i] = src[j];

            if (n == 1) {

                System.arraycopy(tmp, 0, obj[objLineIndex], 0, tmp.length);

                objLineIndex ++;

            } else {

                n--;

                i++;

                combine(src, j+1, i, n, tmp);

                n++;

                i--;

            }

        }
    }

    public Object[][] getResutl() {
        return obj;
    }
}



