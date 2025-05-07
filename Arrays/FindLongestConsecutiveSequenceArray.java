package Coding.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindLongestConsecutiveSequenceArray {
    public static void main(String[] args) {
        int[] nums = {100,1,30,3,2,4};
        System.out.println(findLongestSequence(nums));
    }
    public static int findLongestSequence(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest =0;
        for(Integer s : nums){
            if(!set.contains(s-1)){
                int count =1;
                while(set.contains(s+count)){
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
    return longest;
    }
}
