package Coding.String;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("a "));
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome1("race a car"));
        System.out.println(isPalindrome1(" "));
        System.out.println(isPalindrome1("a "));
    }
    public static boolean isPalindrome(String s){
    String regEx = "[^a-zA-Z0-9]";
    String newString = s.replaceAll(regEx,"").toLowerCase();
        int len = newString.length();
        boolean matchBoolean = false;
        if(newString.isEmpty()){
            return true;
        }
        if(len == 1){
            return true;
        }else {
            for(int i = 0 ; i<len/2;i++){
                if(newString.charAt(i) == newString.charAt(len-(i+1))){
                    matchBoolean = true;
                }else {
                    matchBoolean = false;
                    break;
                }
                }

            }
        return matchBoolean;
        }
        public static boolean isPalindrome1(String s){
            String regEx = "[^a-zA-Z0-9]";
            String newString = s.replaceAll(regEx,"").toLowerCase();
            StringBuilder original = new StringBuilder();
            original.append(newString);
            String reverseString = original.reverse().toString();
            if(newString.equals(reverseString)){
                return true;
            }
            return false;
        }
    }

