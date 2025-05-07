package Coding.Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 6, 5, 8, 9, 5, 0, 4};
        int temp;
        int mid = arr.length/2;
        int index = 0;

        for (int i = arr.length - 1; i >=mid ; i--) {
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
