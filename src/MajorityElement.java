import java.util.Hashtable;

public class MajorityElement {

    public static int majorityElement(int[] nums){

        Hashtable<Integer, Integer> numCounter = new Hashtable<>();
        int majorityPoint = nums.length / 2;
        int majorityElem = 0;

        for(int num : nums){

            int count = numCounter.containsKey(num) ? numCounter.get(num) : 0;
            numCounter.put(num, count + 1);

            if(numCounter.get(num) > majorityPoint){
                majorityElem = num;
            }
        }

        return majorityElem;
    }

    public static void main(String[] args){

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElem = majorityElement(nums);
        System.out.println(majorityElem);
    }
}
