package Coding.interview;

public class FizzBuzz {
    public static void main(String[] args) {
        fizbuzz(100);
    }

    private static void fizbuzz(int limit) {
        for(int i=0; i<limit;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
