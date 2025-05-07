package com.sravs;

import java.util.*;

public class LeastNumber {
    private static int findLeast(int[] arr,int k){
        Map<Integer,Integer> uniquecount = new HashMap<Integer,Integer>();
        for(int i=0; i< arr.length;i++) {
            if (arr[i] != k) {
                if (uniquecount.containsKey(arr[i])) {
                    uniquecount.put(arr[i], uniquecount.get(arr[i]) + 1);
                } else uniquecount.put(arr[i], 1);

            }
        }
            ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (Integer key : uniquecount.keySet()){
            if(uniquecount.get(key) == 1){
                newarr.add(key);
            }
        }
        if(newarr.isEmpty()){
            return 0;
        }
            Collections.sort(newarr);
        return newarr.get(0);
}

    public static void main(String[] args) {
        int[] a={4,3,1,1,3,3,2};
        int k =3;
        int num = findLeast(a,k);
        System.out.println(num);
        }
    }
