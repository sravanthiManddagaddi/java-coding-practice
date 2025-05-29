package Coding.Arrays;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] num = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("The max average between any 4 numbers is : "+findMaxAvg(num,k));
    }
    public static double findMaxAvg(int[] num, int k){
        double sum = 0;
       for(int i = 0 ; i<k;i++){
           sum+=num[i];
       }
       double maxAvg = sum/k;
        /*Sliding window tech starts here after adding the first k elements
        we will start a new loop from kth element to the rest of the array by adding the next element
        and subtracting the previous element*/
       for(int i = k ; i<num.length;i++){
           sum+=num[i]-num[i-k];
           maxAvg = Math.max(maxAvg,sum/k);
       }
       return maxAvg;
    }
}
