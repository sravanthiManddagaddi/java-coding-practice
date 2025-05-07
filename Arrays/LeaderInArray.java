package Coding.Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,8,6,7,1};
        for(int i=0;i<arr.length;i++){
            int j;
            for(j =i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==arr.length ){
                System.out.println("The leader is "+arr[i]);
                break;
            }
        }
    }
}
