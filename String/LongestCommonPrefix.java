package Coding.String;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
     public static void main(String[] args) {
        String[] str = {"flower","flow","flash","float"};
         System.out.println(longestCommonPrefix(str));
         System.out.println(longestCommonPrefix1(str));
    }
    public static String longestCommonPrefix(String[] str){
        if(str.length == 1){
            return str[0];
        }
        int[] size = new int[str.length];
        int i =0;
         for(String w : str){
             w.toLowerCase();
              size[i] = w.length();
              i++;
         }
         StringBuilder stringBuffer = new StringBuilder();
        int minString = size[0];
        for(int x= 1;x<size.length;x++) {
            if (minString > size[x]) {
                minString = size[x];
            }
        }
            boolean letterFound = false;
           for(int y=0; y <minString;y++) {
               letterFound = false;
               for (int z = 0; z < str.length; z++) {
                   if (z != str.length - 1) {
                       if (str[z].toLowerCase().charAt(y) == str[z + 1].toLowerCase().charAt(y)) {
                           letterFound = true;
                       } else {
                           letterFound = false;
                           return stringBuffer.toString();
                       }
                   }
                   if (z == 0 && !letterFound) {
                       return stringBuffer.toString();
                   }
               }
               if (letterFound) {
                   stringBuffer.append(str[0].toLowerCase().charAt(y));
               }
           }
        return stringBuffer.toString();

    }
    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
//        System.out.println(Arrays.toString(strs));
//        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    }

