//Given a non-empty array of integers nums, every element appears twice except for one. Find the number that does not,
// and return it. You must implement a solution with a linear runtime complexity and use only constant extra space.
//Ex: Input: nums = [2, 2, 1] Output: 1

import java.util.HashSet;

public class SingleNumber {

    public static int singleNumber(int[] nums){

        HashSet<Integer> numTracker = new HashSet<>();

        for(int num : nums){
            if(numTracker.contains(num)){
                numTracker.remove(num);
            }
            else{
                numTracker.add(num);
            }
        }

        return numTracker.iterator().next();
    }


    public static void main(String[] args){

        int[] nums = {4, 1, 2, 1, 2};
        int nonDuplicateNum = singleNumber(nums);
        System.out.println(nonDuplicateNum);

    }

}
