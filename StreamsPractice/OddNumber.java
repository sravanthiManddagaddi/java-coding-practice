package Coding.StreamsPractice;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream().filter(n -> (n % 3 == 0)).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
