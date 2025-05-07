public class EvenOddTryCatch {
    public static void main(String[] args) {
        int n =18;
        tryNumber(n);
        tryNumber(7);
    }
    public static void tryNumber(int n){
        try{
            checkEvenOdd(n);
            System.out.println(n +" is even number");
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void checkEvenOdd(int n){
        if(n%2!=0){
            throw new IllegalArgumentException(n + " is odd number");
        }
    }

}
