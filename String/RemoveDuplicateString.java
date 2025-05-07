package Coding.String;

import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "naveen";
        List<String> strList = new ArrayList<String>(Arrays.asList(s.toLowerCase().split("")));
        List<String> result = new ArrayList<String>(Arrays.asList(s.toLowerCase().split("")));
        Set<String> set = new LinkedHashSet<>(strList);
        System.out.println(result);
        for(String str : strList){
            if((Collections.frequency(result,str)) > 1){
                result.remove(str);
            }
        }
        System.out.println(String.join("",result));
        System.out.println(String.join("",set));
    }
}
