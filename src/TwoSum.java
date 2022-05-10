import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers (nums) and an integer (target), return the indices of the two numbers such that they
    add up to the target. You may assume that each input can have a maximum of one solution, and you may not use the
    same element twice. You can return the answer in any order. If there is no valid solution, return an empty array.

    Ex 1:
    Input: nums = [2, 7, 11, 15], target = 9
    Output: [0, 1]

    Ex 2:
    Input nums = [3, 2, 4], target = 6
    Output: [1, 2]

    */

    //Hashtable solution
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> potentialMatches = new HashMap<>();
        for(int x = 0; x < nums.length; x++){
            int difference = target - nums[x];
            if(potentialMatches.containsKey(difference)){
                return new int[]{potentialMatches.get(difference), x};
            }
            else{
                potentialMatches.put(nums[x], x);
            }
        }
        return new int[0];
    }


    public static void main(String[] args){

        int [][] testCases = {
            {2, 7, 11, 15},
            {3, 2, 4},
            {3000, 5, 258, 305, 406, 35},
            {-3, 2, 56, 9, 308, 22, 23, 24, 25},
            {1, 2, 3, 4, -5, 6, 7, 8, 10, -9},
            {33, 5, 7, -32, 44, 12, 18},
            {-1, -2, -5, -87, 500}
        };
        int[] targetSums = {9, 6, 3258, 3000, 15, 1, 495};
        for(int x = 0; x < testCases.length; x++){
            int [] summingValues = twoSum(testCases[x], targetSums[x]);
            System.out.println(Arrays.toString(summingValues));
        }

    }

}
