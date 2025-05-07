package Coding.String;

public class ConvertStringtoLowerCase {
    public static void main(String[] args) {
        String str ="JAVA";
        String str2="";
        for(Character c: str.toCharArray()){
            int n =(int)c+32;
            char ch = (char)n;
            str2 = str2+ch;
        }
        System.out.println(str2);
    }
}
