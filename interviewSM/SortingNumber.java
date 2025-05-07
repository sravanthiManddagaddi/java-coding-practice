package Coding.interviewSM;

import java.util.Arrays;
import java.util.Collections;

public class SortingNumber {
        public static int sum(int[] arr){
            int total = 0;
            for (int v:arr){
                total = total + v;
            }
            return total;
        }
        public static void asceSort(int[] arr){
            int temp;
//        int[] newArr = new int[arr.length];
            for(int i=0; i<arr.length;i++){
                temp = arr[i];
                for(int j=i+1;j<arr.length;j++){
                    if(temp>arr[j]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                    }
                }
            }
            for(int v: arr){
                System.out.println(v);
            }
        }
        public static void descSort(int[] arr){
            int temp;
            for(int i=0; i<arr.length;i++){
                temp = arr[i];
                for(int j=i+1;j<arr.length;j++){
                    if(temp<arr[j]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                    }
                }
            }
            for(int v: arr){
                System.out.println(v);
            }
        }
        public static void simpleASort(int[] arr){
            Arrays.sort(arr);
            System.out.println("-----Ascending Sort using Arrays class-----");
            for(int v:arr){
                System.out.println(v);
            }
        }
        public static void simpleDSort(Integer[] arr){
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("-----Descending Sort using Arrays class-----");
            System.out.println(Arrays.toString(arr));
        }
        public static int findMin(int[] arr){
            int min = arr[0];
            for (int v : arr) {
                if (v < min) {
                    min = v;
                }
            }
            return min;
        }

        public static void main(String[] args) {
            int[] number = {2,3,5,6,7,8};
            int value = sum(number);
            System.out.println("The total value is: "+value);
            int[] num = {3,9,1,8,4,8,5};
            Integer[] num1 = {3,9,1,8,4,8,5};
            System.out.println("-----Ascending order-----");
            asceSort(num);
            System.out.println("-----Descending order-----");
            descSort(num);
            simpleASort(num);
            simpleDSort(num1);
            System.out.println("The mininum number is "+findMin(num));


        }
    }

