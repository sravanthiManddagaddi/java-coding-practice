package Coding.interviewSM;

public class Remainder {
    public static void main(String[] args) {
        int a= 26;
        int b=18;
        int res1;
        res1 = remainder1(a,b);
        System.out.println(res1);
        int res2 = remainder2(a,b);
        System.out.println(res2);

    }

    public static int remainder1(int a, int b) {
//        double c;
//        c= a/b;
//        int r = (int) c;
//        int val = (a-(r*b));
//        return val;
        return (a-((a/b)*b));

    }
    public static int remainder2(int a, int b) {
        while(a>=b){
            a= a-b;
        }
        return a;
    }
}
