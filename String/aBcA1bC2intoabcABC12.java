package Coding.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class aBcA1bC2intoabcABC12 {
    public static void main(String[] args) {

        String a = "aBcA1bC2"; //output abcABC12
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(int i=0; i<a.length();i++){
            if(Character.isLowerCase(a.charAt(i))){
                lowerCase.append(a.charAt(i));
            }
            if(Character.isUpperCase(a.charAt(i))){
                upperCase.append(a.charAt(i));
            }
            if(Character.isDigit(a.charAt(i))){
                digits.append(a.charAt(i));
            }
        }
        ;
        Arrays.sort(lowerCase.toString().toCharArray());
        Arrays.sort(lowerCase.toString().toCharArray());
        System.out.println(sortFunction(lowerCase.toString())+sortFunction(upperCase.toString())+sortFunction(digits.toString()));
    }
    public static String sortFunction(String s1){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        return String.valueOf(c1);
    }
}
