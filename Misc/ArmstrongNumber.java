package Coding.Misc;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(143));
    }
    public static boolean isArmstrong(int num){
        int temp = num;
        double result = 0;
        while(temp!=0){
            int a = temp%10;
            result = result + Math.pow(a,3);
            temp = temp/10;
        }
        if (result == num)
            return true;
        else return false;

    }
}
