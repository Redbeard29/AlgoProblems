//Given an integer array nums, return true if any value appears at least twice in the array, and return false
//if every element is distinct.

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){

        HashSet<Integer> numTracker = new HashSet<>();

        for(int num : nums){
            if(numTracker.contains(num)) return true;

            numTracker.add(num);
        }

        return false;
    }

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);
    }
}
