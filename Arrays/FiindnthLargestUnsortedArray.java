package Coding.Arrays;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class FiindnthLargestUnsortedArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("apple");
        linkedList.push("banana");
        System.out.println(linkedList.pop());
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("sravs".charAt(10));

        }finally {
            int[] a ={10,20};
            try {
                System.out.println(a[4]);
            }catch(Exception e){

            }finally {
                System.out.println("nested finally");
            }

            System.out.println("finally");
        }


    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
