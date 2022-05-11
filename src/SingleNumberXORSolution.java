//Given a non-empty array of integers nums, every element appears twice except for one. Find the number that does not,
// and return it. You must implement a solution with a linear runtime complexity and use only constant extra space.
//Ex: Input: nums = [2, 2, 1] Output: 1

//The bitwise operator allows us to return 0 if an element is repeated (i.e. X^X), and return the element itself if
//the element is not repeated - X^Y^X = Y. This means that all repeated numbers that have the bitwise operator applied
//to them will cancel each other out, and we will be left with the one number that is not repeated.

public class SingleNumberXORSolution {

    public static int singleNumber(int[] nums){

        int remainingNum = 0;

        for(int num : nums){
            remainingNum ^= num;
        }

        return remainingNum;
    }

    public static void main(String[] args){

        int[] nums = {4, 1, 2, 1, 2};
        int nonDuplicateNum = singleNumber(nums);
        System.out.println(nonDuplicateNum);

    }
}
