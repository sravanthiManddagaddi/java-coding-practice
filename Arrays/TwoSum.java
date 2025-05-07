package Coding.Arrays;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws IOException {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] val = twoSum(nums, target);
        int[] n2 = {1, 5, 2, 2, 7, 3, 10};
//        int[] diffVal =twoDiff(n2,3);
        twoDiff(n2,3);
        System.out.println("The indices are: "+val[0]+" and "+ val[1]);
//      System.out.println("The indices are: "+diffVal[0]+" and "+ diffVal[1]);

//        URL url = new URL("https://google.com");
//        HttpURLConnection connection =(HttpURLConnection) url.openConnection();
//        connection.
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i =0; i<nums.length;i++){
            int diff = target - nums[i];
            if(mapList.containsKey(diff)){
                return new int[]{mapList.get(diff),i};
            }
            mapList.put(nums[i],i);

        }
        return null;
    }
    public static void twoDiff(int[] nums, int target){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i =0; i<nums.length;i++){
            int diff = target + nums[i];
            if(mapList.containsKey(diff)){
                System.out.println(mapList.get(diff)+","+i);
//                return new int[]{mapList.get(diff),i};
            }
            mapList.put(nums[i],i);

        }
//        return null;
    }
    public static int[] twoSum1(int[] nums, int target){
        for (int i =0; i<nums.length;i++){
            for (int j = i+1; j< nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
