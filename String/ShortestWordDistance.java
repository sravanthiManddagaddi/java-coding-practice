package Coding.String;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestDistance(wordsDict,word1,word2) );
        System.out.println(shortestDistance(wordsDict,"makes","coding") );
    }
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        List<Integer> word1Indexes = new ArrayList<>();
        List<Integer> word2Indexes = new ArrayList<>();
        for(int i=0; i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                word1Indexes.add(i);
            }
            if(wordsDict[i].equals(word2)){
                word2Indexes.add(i);
            }
        }
        int min =wordsDict.length;
        int temp = 0;
        for(Integer w1:word1Indexes){
        for(Integer w2:word2Indexes){
            if(w2 >= w1){
                temp = w2-w1;
            }else temp = w1-w2;
           if(temp< min){
               min = temp;
           }
        }
    }
        return min;
    }
}
