package Coding.Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
//        int[] arr = {4,2,5,1,0,7,8,6};
//        for(int i=0; i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        String[] arr ={"Selenium","Priyanka","Swaranjali","Testing"};
        String temp;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if((arr[i].compareTo(arr[j]))>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
