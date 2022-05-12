import java.util.Arrays;

public class ContainsDuplicateWithSort {

    public static boolean containsDuplicate(int[] nums){

        Arrays.sort(nums);

        for(int x = 1; x < nums.length; x++){
            if(nums[x] == nums[x -1]) return true;
        }

        return false;
    }

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);
    }
}
