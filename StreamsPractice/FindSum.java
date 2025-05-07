package Coding.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().reduce(0,Integer::sum);
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(sum1);
    }
}
