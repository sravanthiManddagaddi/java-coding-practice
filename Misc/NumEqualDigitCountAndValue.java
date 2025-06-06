package Coding.Misc;

import java.util.*;

public class NumEqualDigitCountAndValue {
    public static void main(String[] args) {
        /*
        You are given a 0-indexed string num of length n consisting of digits.
        Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num,
        otherwise return false.
        Example 1:

        Input: num = "1210"
        Output: true
        Explanation:
        num[0] = '1'. The digit 0 occurs once in num.
        num[1] = '2'. The digit 1 occurs twice in num.
        num[2] = '1'. The digit 2 occurs once in num.
        num[3] = '0'. The digit 3 occurs zero times in num.
        The condition holds true for every index in "1210", so return true.
        Example 2:

        Input: num = "030"
        Output: false
        Explanation:
        num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
        num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
        num[2] = '0'. The digit 2 occurs zero times in num.
        The indices 0 and 1 both violate the condition, so return false.
         */

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

