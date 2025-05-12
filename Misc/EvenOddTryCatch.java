package Coding.Misc;

import java.io.File;
import java.io.IOException;

public class EvenOddTryCatch {
    public static void main(String[] args) {
        int n =18;
        tryNumber(n);
        tryNumber(7);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException|ArithmeticException e)
        {
            System.out.println("exception raised  " + e);
        }
        System.out.println("rest of the app");
    }
    public static void tryNumber(int n){
        try{
            checkEvenOdd(n);
            System.out.println(n +" is even number");
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void checkEvenOdd(int n){
        if(n%2!=0){
            throw new IllegalArgumentException(n + " is odd number");
        }
    }

}
