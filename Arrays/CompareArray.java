package Coding.Arrays;

import java.sql.SQLOutput;

public class CompareArray {
    public static void main(String[] args) {
        int[] num1 = {2,4,5,6,9};
        int[] num2 = {2,4,5,6,9};
        if(compareArrays(num1,num2)){
            System.out.println("Both the arrays are same");
        }else System.out.println("Both the arrays are not same");
    }
    public static boolean compareArrays(int[] num1, int[] num2){
        if(num1.length!=num2.length){
            return false;
        }
        for( int i=0; i<num1.length;i++){
            if(num1[i]!=num2[i]){
                return false;
            }
        }
        return true;
    }
}
