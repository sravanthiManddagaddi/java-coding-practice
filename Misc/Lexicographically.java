package com.sravs;

public class Lexicographically {
    public static void main(String[] args) {
        String s ="0013";
        System.out.println(getSmallestString(s));
    }
    public static String getSmallestString(String s){
        char[] ch = s.toCharArray();
        for(int i =0; i<s.length()-1;i++){
            int a = ch[i]-'0';
            int b = ch[i+1]-'0';
            if(a == b){
                continue;
            }
            if((a%2==0) && (b%2==0)){
                if(a > b){
                    char temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                    break;
                 }
            }
            if((a%2!=0) && (b%2!=0)){
                if(a > b){
                    char temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                    break;
                }
            }
        }
        return new String(ch);
    }

}
