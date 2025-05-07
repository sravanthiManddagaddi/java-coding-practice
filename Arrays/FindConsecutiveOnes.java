package Coding.Arrays;

public class FindConsecutiveOnes {
    public static void main(String[] args) {
        int[] num = {1,1,0,0,1,0,1,1,1,1,1,0,1,1,1,1};
        System.out.println(findOnes(num));
    }
    public static int findOnes(int[] num){
        int max = 0;
        int count =0;
        for(int i=0;i< num.length;i++){
            while((i<num.length) && (num[i]==1)){
                count++;
                i++;
            }
            if(max<count){
                max = count;
            }
            count =0;
        }
        return max;
    }
}
