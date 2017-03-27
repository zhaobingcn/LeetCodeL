package com.company.hard;

/**
 * Created by zhzy on 2017/3/27.
 */
public class median_of_two_seq_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lena = nums1.length;
        int lenb = nums2.length;
        int len = lena + lenb;
        if(len % 2 != 0){
            return findKth(nums1, 0, lena-1, nums2, 0, lenb-1, len/2+1);
        }else{
            return (findKth(nums1, 0, lena-1, nums2, 0, lenb-1, len/2) +
                    findKth(nums1, 0, lena-1, nums2, 0, lenb-1, len/2+1))/2.0;
        }
    }


    public double findKth(int nums1[], int astart, int aend, int nums2[], int bstart, int bend, int k){
        int lena = aend - astart +1;
        int lenb = bend - bstart +1;
        if(lena > lenb){
            return findKth(nums2, bstart, bend, nums1, astart, aend, k);
        }
        if(lena == 0){
            return nums2[bstart + k - 1];
        }
        if(k == 1){
            return Math.min(nums1[astart], nums2[bstart]);
        }


        int pa = Math.min(k/2, lena), pb = k-pa;
        if(nums1[astart + pa - 1] > nums2[bstart + pb -1]){
            return findKth(nums1, astart, aend, nums2, bstart + pb, bend, k-pb);
        }else if(nums1[astart + pa -1] == nums2[bstart + pb - 1]){
            return nums1[astart + pa -1];
        }else{
            return findKth(nums1, astart + pa, aend, nums2, bstart, bend, k-pa);
        }
    }
}
