public class MajorityElementOptimized {

    public static int majorityElement(int[] nums){

        int counter = 1;
        int currentMajority = nums[0];

        for(int x = 1; x < nums.length; x++){

            if(counter == 0) currentMajority = nums[x];
            counter = nums[x] == currentMajority ? counter + 1 : counter - 1;

        }

        return currentMajority;
    }

    public static void main(String[] args){

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElem = majorityElement(nums);
        System.out.println(majorityElem);
    }
}
