package Coding.String;

public class PowerFunctionRecursive {
    public static void main(String[] args) {
        int x = 2;
        int power = 3;
        System.out.println(findPower(x,power));
    }
    public static int findPower(int x, int power){
        if(power == 0){
            return 1;
        }
        return x * findPower(x,power-1);
    }
}
