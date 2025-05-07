package Coding.String;

public class IndexOfFirstOccuranceString {
    public static void main(String[] args) {
        String needle = "d";
        String haystack = "abc";
        System.out.println(strStr1(haystack, needle));
        System.out.println(countOccurrenceSubstring("World Hello World World! World","World"));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        int len = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            int lastIndex = i+len;
            if (lastIndex <= haystack.length()) {
                if (haystack.substring(i, lastIndex).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static int strStr1(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
       return haystack.indexOf(needle);
    }
    //Count occurrence of a substring in a String "Hello World World!
    public static int countOccurrenceSubstring(String str, String subString){
        int index = 0;
        int count =0;
        while((index=str.indexOf(subString,index))!=-1){
            count++;
            index  = index+subString.length();
        }
        return count;
    }
}