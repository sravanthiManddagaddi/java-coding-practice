package Coding.Misc;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammticNumber {
    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("88"));
        System.out.println(isStrobogrammatic("692"));
    }
    public static boolean isStrobogrammatic(String num) {
    Map<Character, String> pair = new HashMap<>();
    pair.put('1',"1");
    pair.put('8',"8");
    pair.put('5',"5");
    pair.put('0',"0");
    pair.put('6',"9");
    pair.put('9',"6");
    StringBuilder newString = new StringBuilder();
    for(int i=0; i<num.length();i++){
        Character ch = num.charAt(i);
        if(!pair.containsKey(ch)){
            return false;
        }
        newString.append(pair.get(ch));
    }
    if (newString.reverse().toString().equals(num)){
        return true;
    }
    return false;
    }
}
