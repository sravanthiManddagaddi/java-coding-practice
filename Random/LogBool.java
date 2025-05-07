package Coding.Random;

public class LogBool {
    public static void main(String[] args) {
        int a = 100;
        int x = 12;
        int d = 12;
        int c = 122;
        boolean zz1 = (a == d); // False
        boolean zz2 = (x == d); // True
        boolean zz3 = (c >= a);    //  True
        boolean zz4 = (x >= d); //  True
        boolean zz5 = ((d == c) || (x == d)); //True
        boolean zz6 = ((c > x) && (d >= x)); //True
        boolean zz7 = ((a > x) || (a > c));  //True
        boolean zz8 = ((a == c) && (d == c)); //False
        boolean zz9 = ((c == c) && (a >= a)); //True
        boolean zz0 = ((c > c) || (a <= a));  //True
        boolean zz10 = ((x > a) && (c == d)); //False
        boolean zz11 = ((c > a) && (x > d));  //False
        System.out.println("zz1 = " + zz1);
        System.out.println("zz2 = " + zz2);
        System.out.println("zz3 = " + zz3);
        System.out.println("zz4 = " + zz4);
        System.out.println("zz5 = " + zz5);
        System.out.println("zz6 = " + zz6);
        System.out.println("zz7 = " + zz7);
        System.out.println("zz8 = " + zz8);
        System.out.println("zz9 = " + zz9);
        System.out.println("zz0 = " + zz0);
        System.out.println("zz10 = " + zz10);
        System.out.println("zz11 = " + zz11);
        int age = 13;
        if (age > 0 && age <= 2) {
            System.out.println("For infants the ticket is free. Your age: " + age);
        } else if (age > 2 && age <= 12) {
            System.out.println("For child the ticket is 50% off. Your age: " + age);
        } else if (age > 12 && age <= 65) {
            System.out.println("No discounts for adults. Your age: " + age);
        } else if (age == 0) {
            System.out.println("Enter a valid age");
        } else
            System.out.println("For seniors the ticket is 80% off. Your age: " + age);

        
            }
    }
