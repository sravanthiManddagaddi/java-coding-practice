package Coding.String;


public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr ={2, 5, 8, 12, 16, 23, 38, 56};
        int target = 24;
        int left =0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        System.out.println(binarySearchRecursive(arr,left,right,target));
    }
    public static int binarySearchRecursive(int[] arr, int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]<target){
            return binarySearchRecursive(arr,mid+1,right,target);
        }else return binarySearchRecursive(arr,left,mid-1,target);
    }
}
