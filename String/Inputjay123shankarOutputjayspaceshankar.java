package Coding.String;

public class Inputjay123shankarOutputjayspaceshankar {
    public static void main(String[] args) {
        //input String s= "jay123shankar" output -> "jay shankar"
        StringBuilder sb = new StringBuilder();
        String s ="jay123shankar2244input";
        boolean digitFound = false;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                digitFound = true;
            }else{
                if(digitFound){
                    sb.append(' ');
                    digitFound = false;
                }
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
