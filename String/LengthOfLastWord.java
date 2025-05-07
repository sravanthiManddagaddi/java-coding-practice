package Coding.String;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        List<String> ans = new ArrayList<>();
        for(String w : words){
            if(!(w.isBlank())){
                ans.add(w);
            }
        }
        return ans.get(ans.size()-1).length();
    }
}
