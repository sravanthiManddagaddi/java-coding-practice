package Coding.interview;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        Integer[] array={1,2,13,32,14,1,-12,12,65,687,43,56,45,21,867,90,32,76,32,56};
//        Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));
        List<Integer> set = new ArrayList<>();
        for (Integer number: array){
            if(!set.contains(number)){
                set.add(number);
            }
        }

        for (Integer number: set){
            int count = 0;
            for (Integer otherNumber : array){
                if (number == otherNumber){
                    count++;
                }
            }
            if(count>1){
                System.out.println(number+", "+count+" times");
            }
        }
    }
}
