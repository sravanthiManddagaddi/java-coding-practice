package Coding.String;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculateNumbersInString {
    public static void main(String[] args) {
        String s = "Te10sg2a0ting123";
        char[] ch = s.toCharArray();
        int sum =0;
        for(Character c : ch){
            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        System.out.println(sequenceNumberAndSum(s));
    }
    public static int sequenceNumberAndSum(String str){
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i =0;i<str.length();i++) {
            if (Character.isDigit(str.charAt(i))) {
                int j = i;
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    j++;
                }
                arrList.add(Integer.valueOf(str.substring(i, j)));
                i = j;
            }
        }
            int sum =0;
            for(int k=0;k<arrList.size();k++){
               sum = sum+arrList.get(k);
            }
        return sum;

    }
    }

