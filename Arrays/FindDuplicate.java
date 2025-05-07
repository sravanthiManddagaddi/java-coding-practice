package Coding.Arrays;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] num = {1,2,3,2,4,5,8,3,3,7};
        int count =1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: num){
            if(map.containsKey(n)){
                map.put(n,(map.get(n)+1));
            }else map.put(n,count);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println("The number: "+key+" is duplicate and is repeated "+map.get(key)+" times");
            }
        }
    }
}
