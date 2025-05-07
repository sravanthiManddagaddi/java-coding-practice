package com.sravs;

import java.util.*;

public class NumEqualDigitCountAndValue {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    private static boolean digitCount(String num) {
        Map<String,Integer> dgc = new HashMap<String,Integer>();
        Map<String,Integer> dv = new HashMap<String,Integer>();
        Set<String> uq = new HashSet<String>();
        for(int i =0; i<num.length();i++){
            dv.put(String.valueOf(i), (num.charAt(i)-'0'));
            uq.add(String.valueOf(num.charAt(i)));
        }
        for(String st : uq){
            int count = 0;
            for(int i =0; i<num.length();i++){
                if(st.equals(String.valueOf(num.charAt(i)))){
                    count++;
                }
            }
            dgc.put(st,count);
        }

        for(String ks : dv.keySet()){
            if(dgc.containsKey(ks)){
                if(!dv.get(ks).equals(dgc.get(ks))){
                    return false;
                }
            }
            else if(dv.get(ks) != 0){
                return false;
            }
        }
        return true;
    }

}

