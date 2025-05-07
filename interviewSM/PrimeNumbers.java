package Coding.interviewSM;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100;
        printPrime(limit);
    }

    private static void printPrime(int limit) {
        for (int i=2;i<=limit;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        double root = Math.sqrt(num);
        for(int j=2;j<root;j++){
            if(num%j == 0){
                return false;
            }
        }
       return true;
    }

}
