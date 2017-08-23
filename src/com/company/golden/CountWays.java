package com.company.golden;

/**
 * Created by zhzy on 2017/8/21.
 */
public class CountWays {
    public int countWays(int n) {
        // write code here
        int a[] = new int[100001];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;

        for(int i=3; i<n; i++){
            a[i] = ((a[i-1] + a[i-2])%1000000007 + a[i-3]%1000000007)%1000000007;
        }
        return a[n-1];
    }
}
