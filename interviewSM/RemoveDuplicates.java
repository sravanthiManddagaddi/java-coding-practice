package Coding.interviewSM;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr ={2,0,-32,-32,762,897,4,0,-32,897,10,2,5,0,342,87,762,2342};
//        Integer[] arr ={2,0,762,897,4,0,897,10,2,5,0,342,87,762,2342};

//        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
//        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        List<Integer> set = new ArrayList<>();
        for(Integer arrNum:arr){
            if(!set.contains(arrNum)){
                set.add(arrNum);
            }
        }
        System.out.println(set);
        for(Integer setNumber : set){
            int count =0;
            for(Integer arrNumber : arr){
               if(Objects.equals(setNumber, arrNumber)){
                    count++;
                }
            }
            if(count>1){
                System.out.println("The number "+setNumber+" is "+count+" times");
            }
        }
    }
}
