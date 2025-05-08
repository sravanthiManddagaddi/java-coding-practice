package Coding.String;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        StringBuilder a = new StringBuilder();
        String s ="this is my world";
        String[] words = s.split(" ");
        System.out.println(reverseSentence(words,b, words.length-1));
        String str ="Selenium";
        System.out.println(reverseSingleWord(str,a,str.length()-1 ));
    }
    public static String reverseSentence(String[] words,StringBuilder b,int len){
        if (len <0){
            return b.toString();
        }else{
            b.append(words[len] + " ");
            return reverseSentence(words,b,len-1);
        }
    }
    public static String reverseSingleWord(String word,StringBuilder b,int len){
        if (len <0){
            return b.toString();
        }else{
            b.append(word.charAt(len));
            return reverseSingleWord(word,b,len-1);
        }
    }
}
