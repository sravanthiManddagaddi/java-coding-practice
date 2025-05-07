package Coding.Arrays;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] num1 ={1,2,3,5};
        int[] num2 = {9,8,7,6,5};
        int index = 0;
        int[] arr = new int[num1.length+num2.length];
        Arrays.sort(num1);
        Arrays.sort(num2);
        for(int n:num1){
            arr[index++] = n;
        }
        for(int n: num2){
            arr[index++] = n;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(merge2Arrays(num1,num2)));
        String str2 = "findduplicateelementsinarray";

    }
    public static int[] merge2Arrays(int[] n1, int[] n2){
        int i= 0, j=0, k=0;
        int[] result = new int[n1.length+n2.length];
        Arrays.sort(n1);
        Arrays.sort(n2);
        while(i<n1.length && j<n2.length){
            if(n1[i]<n2[j]){
                result[k++] = n1[i++];
            }else result[k++] = n2[j++];
        }
        while(i<n1.length){
            result[k++] = n1[i++];
        }
        while(j<n2.length){
            result[k++] = n2[j++];
        }
        return result;
    }
}
