package Coding.interviewSM;

import java.util.HashMap;

public class FizzBuzzSM {
    public static void main(String[] args) {
        int limit =100;
        fizzBuzz(limit);
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities.values());
//        int x =5;
//        System.out.println(++x);
//        System.out.println(x);
    }
   public static void fizzBuzz(int limit){
        for (int i=1;i<=limit;i++){
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0)
            {
                System.out.println("Fizz");
                continue;
            }
            if(i%5==0)
            {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
   }
}
