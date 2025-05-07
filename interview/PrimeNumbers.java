package Coding.interview;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(1000000);
    }

    private static void printPrimeNumbers(int limit) {
        for (int i=2;i<=limit;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        double root = Math.sqrt(number);
        for (int i = 2;i<=root;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
