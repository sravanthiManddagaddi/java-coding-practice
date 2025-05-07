package Coding.String;

public class InputitestaOutputatseti {
    public static void main(String[] args) {
        //input String s = "itest!a" output -> "atset!i
        String s ="itest!a";
        char[] arr = s.toCharArray();
        int i =0;
        int j = arr.length-1;
       while(i<j){
           if(!Character.isLetter(arr[i])){
               i++;
           }
           if(!Character.isLetter(arr[j])){
               j--;
           }
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
        System.out.println(String.valueOf(arr));
    }
}
