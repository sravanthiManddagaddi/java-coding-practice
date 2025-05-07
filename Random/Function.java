package Coding.Random;

public class Function {
    public static void sum(int x, int y){
        int result = x+y;
        System.out.println("The sum of "+x+" and "+y+" is "+result);
    }
    public static int sum2(int x, int y){
        int result = x+y;
        return result;
    }
    public static boolean isEven(int x){
        return x%2 == 0;
    }
    public static void printEven(boolean result,int x){
        if (result == true) {
            System.out.println("The number " + x + " is an even number");
        }
        else{
            System.out.println("The number " + x + " is a odd number");

        }
    }



    public static void main(String[] args) {

        sum(3,5);
        sum(123,234);
        sum(-1,-4);
        int r1 = sum2(23,345);
        int r2 = sum2(214,785);
        int r3 = sum2(-21,342);
        System.out.println("The sum of 23 and 345 is "+r1);
        System.out.println("The sum of 214 and 785 is "+r2);
        System.out.println("The sum of -21 and 342 is "+r3);
        System.out.println("-----Finding even numbers-----");
        printEven(isEven(234),234);
        printEven(isEven(12321),12321);
        printEven(isEven(-213),-213);
        printEven(isEven(3434652),3434652);
    }
}
