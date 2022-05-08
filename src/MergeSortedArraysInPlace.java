//You are given two integer arrays, nums1 and nums2, sorted in non-decreasing order, and two integers, m and n,
//representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array
//sorted in non-decreasing order. You should not return a new array, but instead manipulate all required elements
//inside of the array nums1. To accommodate for this, nums1 has a length of m + n, where the first m elements
//denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
//Ex: Input: nums1 = [1, 2, 3, 0, 0, 0], m = 3, nums2 = [2, 5, 6], n = 3
//Output: nums1 = [1, 2, 2, 3, 5, 6]

import java.util.Arrays;

public class MergeSortedArraysInPlace {

    public static int[] Solution(int[] nums1, int m, int[] nums2, int n){

        int insertIdx = (m + n) - 1;
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;

        while(nums1Pointer >= 0 && nums2Pointer >= 0){
            if(nums1[nums1Pointer] >= nums2[nums2Pointer]){
                nums1[insertIdx] = nums1[nums1Pointer];
                nums1Pointer--;
            }
            else{
                nums1[insertIdx] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            insertIdx--;
        }

        while(nums1Pointer >= 0){
            nums1[insertIdx] = nums1[nums1Pointer];
            nums1Pointer--;
            insertIdx--;
        }

        while(nums2Pointer >= 0){
            nums1[insertIdx] = nums2[nums2Pointer];
            nums2Pointer--;
            insertIdx--;
        }

        return nums1;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] mergedArr = Solution(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(mergedArr));
    }

}
