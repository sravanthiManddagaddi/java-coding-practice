package Coding.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
//        System.out.println(removeDuplicates(nums));
//        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(remDupl(nums));
        System.out.println(remDupl(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
//        List<Integer> numList1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i : nums) {
            numList.add(i);
        }
        Set<Integer> setNums = new HashSet<>(numList);
        for (Integer sn : setNums) {
            int duplicateCount = 0;
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) == sn) {
                    duplicateCount++;
                    if (duplicateCount > 1) {
                        numList.remove(i);
                        i--;
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i >= numList.size()){
                nums[i] = -1;
            }else nums[i] = numList.get(i);
        }
        System.out.println(numList);
            return setNums.size();
        }
        public static int remDupl(int[] nums){
            if (nums.length == 0) return 0;
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            for(int k=i+1;k<nums.length;k++){
                nums[k] = -1;
            }
            System.out.println(Arrays.toString(nums));
            return i+1;
        }
    }
