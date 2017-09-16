package com.Algorthms;

import java.util.Arrays;

/**
 * Created by zhzy on 2017/8/29.
 */
public class HeapSort {

    /**
     * 堆排序的思想
     * 如果当前节点从0开始，那么他的左孩子从是2*i+1，右孩子是2*i+2
     * 构建堆，从最后一个节点的父节点开始，调整不符合规则的节点
     * 从底向上调整节点，调整一个节点和他的孩子们直到平衡
     * 堆排序，每次堆顶和无序序列的最后一个元素交换，然后调整无序序列
     * @param seq
     * @return
     */

//    private int[] buildMaxHeap(int seq[]){
//
//        int len = seq.length;
//        for(int i=(len - 2)/2; i>=0; i--){
//            adjustDownToUp(seq, i, len);
//        }
//        return seq;
//    }
//
//    void adjustDownToUp(int[] seq, int k, int length){
//        int temp = seq[k];
//        for(int i=2*k+1; i<length; i=2*i+1){
//            if(i+1 < length && seq[i] < seq[i+1]){
//                i++;
//            }
//            if(temp > seq[i]){
//                break;
//            }else {
//                seq[k] = seq[i];
//                k=i;
//            }
//        }
//        seq[k]=temp;
//    }
//
//    int[] heapSort(int seq[]){
//        seq = buildMaxHeap(seq);
//        for(int i=seq.length-1; i>=1; i--){
//            int temp = seq[0];
//            seq[0] = seq[i];
//            seq[i] = temp;
//            adjustDownToUp(seq, 0, i);
//        }
//        return seq;
//    }
//
//    public static void main(String[] args) {
//        HeapSort heapSort = new HeapSort();
//        int seq[] = {122,87,78,45 ,7, 65, 53, 9, 32 };
//        heapSort.heapSort(seq);
//        for(int i=0; i<seq.length; i++){
//            System.out.print(seq[i] + " ");
//        }
//
//    }

    void buildMaxHeap(int seq[]){
        int len = seq.length;
        for(int i=(len-2)/2; i>=0; i--){
            adjustDownToUp(seq, i, len);
        }
    }

    void adjustDownToUp(int seq[], int k, int length){

        int temp = seq[k];
        for(int i=2*k+1; i < length; i = 2*i+1){
            if(i+1 < length && seq[i] < seq[i+1]){
                i++;
            }
            if(seq[i] < temp){
                break;
            }else {
                seq[k] = seq[i];
                k = i;
            }
            seq[k] = temp;
        }
    }

    void heapSort(int seq[]){
        buildMaxHeap(seq);
        for(int i=seq.length-1; i>=1; i--){
            int temp = seq[i];
            seq[i] = seq[0];
            seq[0] = temp;
            adjustDownToUp(seq, 0, i);
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();

        int seq[] = {122,87,78,45 ,7, 65, 53, 9, 32 };
        heapSort.heapSort(seq);

        for (int i=0; i<seq.length; i++){
            System.out.print(seq[i] + " ");
        }
    }
}
