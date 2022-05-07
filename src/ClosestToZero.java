public class ClosestToZero {

    public static int closestToZero(int[] nums){

        int closestToZero = 1000000;

        for(int num : nums){
            if(Math.abs(num) < Math.abs(closestToZero)){
                closestToZero = num;
            }
            else if(Math.abs(num) == Math.abs(closestToZero)){
                closestToZero = num > closestToZero ? num : closestToZero;
            }
        }
        return closestToZero;
    }

    public static void main(String[] args){
        int[] nums = {-4, -2, 1, 4, 8};
        int closestToZero = closestToZero(nums);
        System.out.println(closestToZero);
    }

}


