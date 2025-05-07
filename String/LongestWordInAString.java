package Coding.String;

import java.util.*;
import java.util.stream.Collectors;

public class LongestWordInAString {
    public static void main(String[] args) {
        String str ="Java is great for automation";
        String[] list = str.split(" ");
        List<String> strList = new ArrayList<String>(Arrays.asList(list));
        Arrays.sort(list,Comparator.comparingInt(String::length).reversed());
        List<String> sortedList = strList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(Arrays.toString(list));
        String maxElement = Arrays.stream(list).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(strList.stream().max(Comparator.comparingInt(String::length)).orElse(""));
        System.out.println("---------");
        System.out.println(maxElement);
    }
}
