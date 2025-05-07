package Coding.Misc;

import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charList = new HashMap<>();
        Set<Character> valuesSet = new HashSet<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (charList.containsKey(ch1)) {
                if (charList.get(ch1) != ch2) {
                    return false;
                }

            } else if (valuesSet.contains(ch2)) {
                return false;
            } else {
                charList.put(ch1, ch2);
                valuesSet.add(ch2);
            }
        }
        return true;
    }
}
