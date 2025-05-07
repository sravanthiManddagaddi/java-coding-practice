package com.sravs;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int arr[]){
//        for(int i =0; i<arr.length;i++){
        boolean flag = true;
            while(flag){
             flag = false;
            for(int j =1; j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
              }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {-2,2,32,12,-1,0,1,2,3,12,0};
//        int arr[] = {0,1,5,7,14};
        int res[] = bubbleSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
