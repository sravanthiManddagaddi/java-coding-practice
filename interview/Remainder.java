package Coding.interview;

public class Remainder {
    public static void main(String[] args) {
        int a=30;
        int b = 11;
        // %
        int res = remainder2(a,b);
        System.out.println(res);
        res = remainder1(a,b);
        System.out.println(res);
    }

    private static int remainder2(int a, int b) {
        return a -((a/b)*b);
    }

    private static int remainder1(int a, int b) {
        while (a>=b){
            a=a-b;
        }
        return a;
    }
}
