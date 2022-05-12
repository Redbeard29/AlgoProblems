//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
//such that nums[i] == nums[j] and abs(i - j) <= k. In other words, a duplicate will only be considered valid if
//if the two numbers are within k indices of one another.
//Ex: Input: nums = [1, 2, 3, 1], k = 3 Output: true
//Ex 2: Input: nums = [1, 0, 1, 1], k = 1 Output: true
//Ex 3: Input: nums = [1, 2, 3, 1, 2, 3], k = 2 Output: false

import java.util.HashMap;

public class ContainsDuplicateWithConstraint {

    public static boolean containsNearbyDuplicate(int[] nums, int k){

        HashMap<Integer, Integer> numTracker = new HashMap<>();

        for(int x = 0; x < nums.length; x++){

            if(numTracker.containsKey(nums[x])){
                if(x - numTracker.get(nums[x]) <= k) return true;
            }

            numTracker.put(nums[x], x);
        }

        return false;
    }

    public static void main(String[] args){
        int[][] testCases = {
            {1, 2, 3, 1},
            {1, 0, 1, 1},
            {1, 2, 3, 1, 2, 3}
        };

        int[] constraints = {3, 1, 2};

        for(int x = 0; x < testCases.length; x++){
            boolean containsValidDuplicate = containsNearbyDuplicate(testCases[x], constraints[x]);
            System.out.println(containsValidDuplicate);
        }
    }

}
