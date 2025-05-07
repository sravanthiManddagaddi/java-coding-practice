package Coding.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReplaceStringInArray {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Test1");
        al.add("Test2");
        al.add("Test3");
        al.add("Test4");
        al.add("Test5");
        int index = al.indexOf("Test2");
        al.set(index,"ReplacedString");
        System.out.println(al);
    }
}
