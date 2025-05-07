package Coding.interview;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Players";
        String s2 = "Parsley";
        boolean res = isAnagram(s1,s2);
        System.out.println(res);

    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        String l1 = s1.toLowerCase();
        String l2 = s2.toLowerCase();

        char[]c1 = l1.toCharArray();
        char[]c2 = l2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i=0;i<c2.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}
