package Coding.String;

import java.util.*;

public class LenOfLongestSubStringNoDuplicates {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstringSlidingWindow("abcabcbb"));
//        System.out.println(lengthOfLongestSubstringSlidingWindow("bbbbb"));
//        System.out.println(lengthOfLongestSubstringSlidingWindow("pwwkew"));
//        System.out.println(lengthOfLongestSubstring(" "));
//        System.out.println(lengthOfLongestSubstring(""));
//        System.out.println(lengthOfLongestSubstringSlidingWindow("abc"));
//        System.out.println(lengthOfLongestSubstringSlidingWindow("au"));
        System.out.println(lengthOfLongestSubstringSlidingWindow("navenxc"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        if (s.isBlank()) {
            return 1;
        }
        if (s.length() == 1) {
            return 1;
        }

        int maxLen = 0;
        int tempLen = 0;
        String tempString = null;
        String ss = null;
        Set<Character> checkDuplicates = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            checkDuplicates.removeAll(checkDuplicates);
            checkDuplicates.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
//                tempString = s.substring(i, j+1);
                if (!checkDuplicates.contains(s.charAt(j))) {
                    tempString = s.substring(i, j + 1);
                    checkDuplicates.add(s.charAt(j));
                } else {
                    tempString = s.substring(i, j);
                    break;
                }
            }
            tempLen = tempString.length();
            if (tempLen > maxLen) {
                maxLen = tempLen;
                ss = tempString;

            }
        }
        System.out.println(ss);
        return maxLen;

    }

    public static int lengthOfLongestSubstringSlidingWindow(String s) {
    int start =0;
    int maxlength = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int end =0 ; end<s.length();end++){
          if(map.containsKey(s.charAt(end))){
              start = Math.max(start,map.get(s.charAt(end))+1);
          }
          map.put(s.charAt(end),end);
          maxlength = Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}
