package Coding.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{"run", "race", "nur", "cera"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char str[] = strs[i].toCharArray();
            // sort string
            Arrays.sort(str);
            String s = String.valueOf(str);
            if (map.get(s) != null) {
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
            } else {
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for (Map.Entry<String, List<String>> en : map.entrySet()) {
            res.add(en.getValue());
        }
        return res;
    }
}
