package Coding.String;

public class SumOfDigitsRecursive {
    public static void main(String[] args) {
        String s = "1234";
        int n = 1234;
        System.out.println(findSum(s));
        System.out.println(findSum(n));
        System.out.println(findCountDigits(n));
    }
    public static int findSum(String s){
        if(s.isEmpty()){
            return 0;
        }
        return Character.getNumericValue(s.charAt(0)) + findSum(s.substring(1));
    }
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + findSum(n/10);
    }
    public static int findCountDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+ findCountDigits(n/10);
    }
}
