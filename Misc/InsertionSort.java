package Coding.Misc;

import java.util.Arrays;

public class InsertionSort {
    private static int[] insertionSort(int arr[]){
        for(int i=1; i< arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && (arr[j] > current)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,32,12,-1,0,1,2,3,12,0};
        int res[] = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
