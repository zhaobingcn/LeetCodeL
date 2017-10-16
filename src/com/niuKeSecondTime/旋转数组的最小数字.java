package com.niuKeSecondTime;

/**
 * Created by zhzy on 2017/10/15.
 */
public class 旋转数组的最小数字 {

    /**10月15号二刷
     总结：因为是非递减序列，所以，以array[start] >= array[end]为循环条件
     当end-start == 1时为截止条件
     特别是if else if的地方要注意
     */
    public int minNumberInRotateArray(int [] array) {

        int start = 0;
        int end = array.length - 1;
        int middle = start;

        while(array[start] >= array[end]){
            if(end - start == 1){
                return array[end];
            }

            middle = (start + end) / 2;
            if(array[middle] >= array[start]){
                start = middle;
            }else if(array[middle] <= array[end]){
                end = middle;
            }

        }


        return array[middle];
    }



}
