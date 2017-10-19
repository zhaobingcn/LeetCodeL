package com.company.mobai;

/**
 * Created by zhzy on 2017/10/19.
 */
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[m];

        for(int i=0; i<m; i++) {
            a[i] = in.nextInt();
        }

        float[][] res = new float[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                res[i][j] = in.nextFloat();
            }
        }
        double le = 0;

        for(int i=0; i<m; i++) {
            if(a[i]==0) {
                continue;
            }

            double[] lpro = new double[a[i]+1];

            lpro[a[i]] = 1;

            for(int j=0; j<n; j++) {
                lpro[0] = lpro[0] + lpro[1]*res[j][i];
                for(int k = 1; k<a[i]; k++) {
                    lpro[k] = lpro[k]*(1-res[j][i]) + lpro[k+1]*res[j][i];
                }

                lpro[a[i]] = lpro[a[i]] * (1-res[j][i]);

            }
            for(int j=1; j<=a[i]; j++) {
                le += lpro[j] * j;
            }
        }
        System.out.println(((Math.round((n - le)*10)/10.0)));

        in.close();
    }
}