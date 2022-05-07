import java.util.Arrays;

public class MergeSortedArraysInPlace {

    public static int[] Solution(int[] nums1, int m, int[] nums2, int n){

        return nums1;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 3, 5};
        int[] mergedArr = Solution(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(mergedArr));
    }

}
