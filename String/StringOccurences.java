package Coding.String;

import java.util.*;

public class StringOccurences {
    public static void main(String[] args) {
        String str = "findduplicateelementsinarray";
        String[] arr = str.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(arr));
        Set<String> set = new HashSet<>();
        for(String s : strList){
            if(!set.add(s)){
                System.out.println("The string "+ s+" has occurred "+ Collections.frequency(strList,s)+ " times");
            }else if(Collections.frequency(strList,s)<2){
                System.out.println("The string "+ s+" has occurred only "+ Collections.frequency(strList,s)+ " time");
            }
        }
    }
}
