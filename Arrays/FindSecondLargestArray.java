package Coding.Arrays;

public class FindSecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {8,3,9,4,6,0,2,7,9};
//        int[] arr = {1,2,3,4,5,6,6,7};
        int fMax = -1;
        int sMax = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>fMax){
                sMax = fMax;
                fMax = arr[i];
            }else if(arr[i]>sMax && fMax!=arr[i]){
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
    }
}
