package com.javaprograms;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)
    System.out.println(nums1.length);
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) // 3> 6  , 3>5 ,122356
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];   // ,5,6
        }
    }

    public  static  void main(String[] args){
        int[] nums1= new int[]{1,2,3,0,0,0};
        int[] nums2= new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int i=0;i<3+3;i++){
            System.out.print(nums1[i]);
        }
    }
}
