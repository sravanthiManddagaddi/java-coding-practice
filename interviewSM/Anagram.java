package Coding.interviewSM;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Cinema";
        String str2 = "Iceman";
        boolean res = isAnagram(str1,str2);
        System.out.println("The given strings are anagram: "+res);
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!= str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }

}
