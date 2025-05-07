package Coding.Misc;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }
    public static int romanToInt(String s){
    Map<String,Integer> romans = new HashMap<String, Integer>();
    romans.put("M",1000);
    romans.put("D",500);
    romans.put("C",100);
    romans.put("L",50);
    romans.put("X",10);
    romans.put("V",5);
    romans.put("I",1);
    int sum =0;
    int i =0;
    while(i<s.length()){
      String currentSymbol = s.substring(i,i+1);
      int currentValue = romans.get(currentSymbol);
      int nextValue = 0;
      if(i+1 < s.length()){
          String nextSymbol = s.substring(i+1,i+2);
          nextValue = romans.get(nextSymbol);
      }
      if(currentValue<nextValue){
          sum =sum + (nextValue-currentValue);
          i = i+2;
      }else{
          sum = sum + currentValue;
          i = i +1;
      }

    }
    return sum;
    }
}
