package Coding.Misc;

import java.util.HashMap;
import java.util.Map;

public class FindChessboradColor {
    public static void main(String[] args) {
        String s = "a1";
        System.out.println(squareIsWhite(s));

    }
    public static boolean squareIsWhite(String coordinates){
        Map<String,Integer> alphaNum = new HashMap<String, Integer>();
        alphaNum.put("a",1);
        alphaNum.put("b",2);
        alphaNum.put("c",3);
        alphaNum.put("d",4);
        alphaNum.put("e",5);
        alphaNum.put("f",6);
        alphaNum.put("g",7);
        alphaNum.put("h",8);
        char[] ch = coordinates.toCharArray();
        int num = alphaNum.get(String.valueOf(ch[0])) + (int)ch[1];
        return num % 2 != 0;
    }
}
