package Coding.Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16,100,14,23, 38, 56, 72, 91 };
        Arrays.sort(arr);
        int target = 14;
        System.out.println(binarySearchRecursive(arr,target,0,arr.length-1));
    }
    public static int binarySearchRecursive(int[] arr, int target, int low, int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearchRecursive(arr, target, low,mid-1);
        }else return binarySearchRecursive(arr, target, mid+1,high);
    }

}
