package Coding.String;

public class a3b2c1TOaaabbc {
    public static void main(String[] args) {
        String s = "a2b3c1"; //output aaabbc
        String newStr ="";
        for(int i=0;i<s.length();i++){

          if(Character.isAlphabetic(s.charAt(i))){
                newStr = newStr+s.charAt(i);
            }
            if(Character.isDigit(s.charAt(i))){
                int index = Character.getNumericValue(s.charAt(i));
                for(int x=1;x<index;x++){
                    newStr = newStr+s.charAt(i-1);
                }
            }
        }
        System.out.println(newStr);
    }
}
