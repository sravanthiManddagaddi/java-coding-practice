package Coding.Misc;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x =-121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        if(x <0){
            return false;
        }
        int rev = 0;
        int temp = x;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        return rev == x;
    }
}
