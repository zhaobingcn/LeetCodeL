package com.Algorthms;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/10/3.
 * 这里使用了未经优化的并查集
 * 还可以使用优化后的并查集
 */
public class UnionFind {

    int count;
    int id[];

    public UnionFind(int N){
        count = N;
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }
    public int getCount() {
        return count;
    }

    public int find(int x){
        return id[x];
    }

    public void union(int p, int q){
        int pId = find(p);
        int qId = find(q);

        for(int i=0; i<id.length; i++){
            if(find(i) == qId){
                id[i] = pId;
            }
        }
        count --;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public int findCircleNum(int[][] M){
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(M[i][j] == 1){
                    if(!connected(i, j)){
                        uf.union(i, j);
                    }
                }
            }
        }
        return uf.getCount();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a[][] = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        UnionFind unionFind = new UnionFind(N);
        int res = unionFind.findCircleNum(a);

        System.out.println(res);


    }

}
