package Coding.Misc;

import java.sql.SQLOutput;
import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        //String s1 = "this apple is sweet";
       // String s2 = "this apple is sour";
        String s1 = "apple apple";
        String s2 = "banana";
        String s3 = s1+ " " + s2;
        List<String> wordsList = Arrays.asList(s3.split(" "));
        System.out.println(wordsList);
        Set<String> uniqueWords = new HashSet<>(wordsList);
        System.out.println(uniqueWords);
        List<String> result = new ArrayList<String>();
        for(String e1: uniqueWords){
            int count =0;
            for(String e2: wordsList){
                if(e1.equals(e2)){
                    count++;
                }
            }
            if (count ==1){
                result.add(e1);
            }
        }
        System.out.println(result);
        String[] r = result.toArray(new String[0]);

    }
}
