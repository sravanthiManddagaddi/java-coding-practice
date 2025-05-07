package Coding.interviewSM;

public class Fibonacci {
    public static void main(String[] args) {
//        int i =1;
//        int j=0;
//        int val;
//        for (int c=1; c<=10;c++){
//            System.out.println(i);
//            val=i+j;
//            j=i;
//            i=val;
//        }
        int i =0;
        int j=1;
        int val;
        for (int c=1; c<=10;c++){
            System.out.println(j);
            val=i+j;
            i=j;
            j=val;
        }
    }
}
