package Coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
//       for(int i : nums){
//           System.out.print(i);
//       }
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val){
        int i = 0;
        for(int j =0; j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        int size = i;
        while(i<nums.length){
            nums[i++] = -1;
        }
        return size;
    }
}
