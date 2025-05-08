package Coding.Misc;

import java.util.*;

public class LeastNumber {
    private static int findLeast(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : arr){
           map.put(i,map.getOrDefault(i,0)+1);
            }
        ArrayList<Integer> occurrences = new ArrayList<Integer>(map.values());
        Collections.sort(occurrences);
        int eleRemoved = 0;
        for(int i=0; i<occurrences.size();i++){
            eleRemoved = eleRemoved+occurrences.get(i);
            if(eleRemoved > k){
                return occurrences.size()-i;
            }
        }
        return 0;
}

    public static void main(String[] args) {
//        int[] a={4,3,1,1,3,3,2};
        int[] a={5,5,4};
//        int k =3;
        int k =1;
        int num = findLeast(a,k);
        System.out.println(num);
        }
    }
