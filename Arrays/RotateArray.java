package Coding.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,5,6,7};
        int k =7;
        k = k%n1.length;
        System.out.println(k);
        reverse(n1,0,n1.length-1);
        reverse(n1,0,k-1);
        reverse(n1,k,n1.length-1);
        System.out.println(Arrays.toString(n1));
    }
    public static int[] reverse(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
        return nums;
    }

}
