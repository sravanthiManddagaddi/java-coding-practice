package Coding.Arrays;

import java.util.Arrays;

public class FirstAndLastIndexNumInArray {
    public static void main(String[] args) {
        int[] num ={0,1,3,8,8,9,8,9};
        int target =9;
        System.out.println(Arrays.toString(findIndex(num, target)));
    }
    public static int[] findIndex(int[] num, int target){
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0;i<num.length;i++){
            if((num[i]==target)&&(firstIndex==-1)){
                firstIndex = i;
            }
            if((num[i]==target)&&(firstIndex!=-1)){
                lastIndex = i;
            }
        }
        return new int[]{firstIndex,lastIndex};
    }
}
