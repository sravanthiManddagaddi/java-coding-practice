package Coding.Misc;

public class PrintUpto100withoutLoop {
    public static void main(String[] args) {
        printNumbers(1);
    }

    public static void printNumbers(int n){
            if(n>100){
                return;
            }
            System.out.println(n);
            printNumbers(n+1);
        }
}
