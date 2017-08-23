package com.company.toutiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/22.
 */
public class problem_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        for(int i=0; i<n; i++){
            points[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o2.x - o1.x;
            }
        });

        ArrayList<Point> arrayPoint = new ArrayList<>();

        int maxY = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(points[i].y > maxY){
                maxY = points[i].y;
                arrayPoint.add(points[i]);
            }
        }

        for(int i=arrayPoint.size()-1; i>=0; i--){
            System.out.println(arrayPoint.get(i).x + " " +arrayPoint.get(i).y);
        }
    }

    static  class Point{
        public int x;
        public int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
