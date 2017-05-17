package com.company.golden;

/**
 * Created by zhzy on 2017/5/15.
 */
public class SubMatrix {

    public static void main(String[] args){


    }

    public static void clearArray(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = 0;
        }
    }

    public static int maxSubMatrix(int[][] matrix){
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int[] partialSum = new int[colCount];
        int maxSum = 0;

        for(int rowStart = 0; rowStart<rowCount; rowStart++){
            clearArray(partialSum);
            for(int rowEnd = rowStart; rowEnd < rowCount; rowEnd++){
                for(int i=0; i<colCount; i++){
                    partialSum[i] += matrix[rowEnd][i];
                }

                int tempMaxSum = maxSubArray(partialSum, colCount);
                maxSum = Math.max(maxSum, tempMaxSum);
            }
        }
        return maxSum;
    }

    public static int maxSubArray(int array[], int N){
        int maxSum = 0;
        int runningSum = 0;

        for(int i=0; i<N; i++){
            runningSum += array[i];
            maxSum = Math.max(maxSum, runningSum);
            if(runningSum < 0){
                runningSum = 0;
            }
        }
        return maxSum;
    }
}
