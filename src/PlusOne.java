/*You are given a large integer represented as an integer arrays digits, where each digit[x] is the xth digit of the
* integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer
* does not contain any leading zeros. Increment the large integer by one and return the resulting array of digits
* Ex 1: Input: digits = [1, 2, 3] Output: [1, 2, 4]
* Ex 2: Input: digits = [4, 3, 2, 1] Output: [4, 3, 2, 2]
* Ex 3: Input digits = [9] Output: [1, 0]
* */

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits){

        for(int x = digits.length - 1; x >= 0; x--){

            if(digits[x] < 9){
                digits[x] ++;
                return digits;
            }

            digits[x] = 0;
        }

        int[] resizeForMaxCase = new int[digits.length + 1];
        resizeForMaxCase[0] = 1;

        return resizeForMaxCase;

    }

    public static void main(String[] args){
        int[][] testCases = {
            {1, 2, 3},
            {4, 3, 2, 1},
            {9, 9, 9, 9},
            {1, 5, 9, 2},
            {1, 5, 3, 9, 9}
        };

        for(int x = 0; x < testCases.length; x++){
            int[] incrementedNum = plusOne(testCases[x]);
            System.out.println(Arrays.toString(incrementedNum));
        }

    }
}
