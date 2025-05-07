package Coding.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        int[] digits = {9,8,7,6,5,4,3,2,1,0};
//        int[] digits = {9,9};
        int[] digits = {9,9,1};
        int[] digits1 = {9,8,9};

        int[] result = plusOne(digits);
//        for(int n :result) {
//            System.out.println(n);
//        }
        System.out.println(Arrays.toString(result));
    }
    public static int[] plusOne(int[] digits){
            for (int i = digits.length-1; i >=0; i--) {
                if (digits[i]+1 !=10) {
                    digits[i] = digits[i]+1;
                    return digits;
                }
                digits[i] = 0;
            }
        int[] result = new int[digits.length + 1];
            result[0] = 1;
        return result;

    }
}
