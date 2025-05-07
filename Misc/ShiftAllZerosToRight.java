package Coding.Misc;

import java.util.Arrays;

public class ShiftAllZerosToRight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftOddEven(new int[]{2,1,2,3,9,5,6,7,8,1})));
        System.out.println(Arrays.toString(shiftZeros(new int[]{0,1,2,3,0,5,6,7,0,1})));


    }
    public static int[] shiftOddEven(int[] num){
        if (num.length == 1){
            return num;
        }
        int[] newArray = new int[num.length];
        int index =0;
        for(int n :num){
            if(n%2!=0){
                newArray[index] = n;
                index++;
            }
        }
        for(int n :num){
            if(n%2==0){
                newArray[index] = n;
                index++;
            }
        }
        return newArray;
    }
    public static int[] shiftZeros(int[] num){
        if (num.length == 1){
            return num;
        }
        int[] newArray = new int[num.length];
        int index =0;
        for(int n :num){
            if(n!=0){
                newArray[index] = n;
                index++;
            }
        }
        return newArray;
    }

}
