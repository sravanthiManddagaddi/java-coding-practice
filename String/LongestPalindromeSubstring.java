package Coding.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babacd"));
//        System.out.println(longestPalindrome("cbbd"));
//        System.out.println(longestPalindrome("b 3$b"));
//        System.out.println(longestPalindrome(" "));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("ac"));
    }
    public static String longestPalindrome(String s) {
        if(s.isEmpty()) return null;
        if(s.isBlank()) return s;
        if(s.length() == 1) return s;
        LinkedHashMap<String,Integer> palindromeSubstring = new LinkedHashMap<>();
//        HashMap<String,Integer> palindromeSubstring = new HashMap<>();

        int maxLen = 0;
        for(int i =0; i<s.length();i++){
            for (int j =i+1; j<=s.length();j++){
                String subString = s.substring(i,j);
                if(isPalindrome(subString)){
                    palindromeSubstring.put(subString,subString.length());
                    if(subString.length() > maxLen){
                        maxLen = subString.length();
                    }
                }
            }
        }
        for(String x:palindromeSubstring.keySet()){
            if(maxLen == palindromeSubstring.get(x)){
//                System.out.println(x);
                return x;
            }
        }
     return null;
    }
    public static boolean isPalindrome(String s){
        String regEx = "[^a-zA-Z0-9]";
        String newString = s.replaceAll(regEx,"").toLowerCase();
        StringBuilder original = new StringBuilder();
        original.append(newString);
        String reverseString = original.reverse().toString();
        if(newString.equals(reverseString)){
            return true;
        }
        return false;
    }
}
