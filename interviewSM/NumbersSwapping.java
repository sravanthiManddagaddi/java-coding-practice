package Coding.interviewSM;

public class NumbersSwapping {
    public static void main(String[] args) {
        int a=7;
        int b =11;
        swap(a,b);
    }
    public static void swap(int a, int b)
    {
       a = a+b;
       b = a-b;
       a= a-b;
        System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);
    }
}
