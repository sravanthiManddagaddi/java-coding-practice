package Coding.Random;

public class Loop {
    public static void main(String[] args) {
        int[] numbers ={2,76,9,90,31,76,6,88,21,12};
        for(int v: numbers){
            System.out.println(v);
        }
        System.out.println("---------- Even numbers ------------");
        for (int v : numbers) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
        System.out.println("------------Number divisble by 3-----------");
        for (int v : numbers) {
            if (v % 3 == 0) {
                System.out.println(v);
            }
        }
            System.out.println("-------Max number--------");
            int max = numbers[0];
            for (int v : numbers) {
                if (v > max) {
                    max = v;
                }
            }
            System.out.println("The maximum number in the array is " + max);
            System.out.println("-------Min number--------");
            int min = numbers[0];
            for (int v : numbers) {
                if (v < min) {
                    min = v;
                }
            }
            System.out.println("The minimum number in the array is " + min);
            System.out.println("---------- Odd numbers ------------");
            for (int v : numbers) {
                if (v % 2 != 0) {
                    System.out.println(v);
                }
            }
            int[] num = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
            int i = 0;
            for (int v : num) {
                if (v == 10) {
                    System.out.println("The index is: " + i);
                }
                i++;
            }
        }
    }

