package Coding.interview;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int number = 7;
        int[] dices = throwDices(number);
        int count = countTurns(dices);
        System.out.println("Count = "+count);
    }

    private static int countTurns(int[] dices) {
        int count = 0;
        for (int dice:dices){
            if(dice==1){
                count+=2;
                continue;
            }
            if (dice==6){
                continue;
            }
            count++;
        }
        return count;
    }


    private static int[] throwDices(int number) {
        int[]dices = new int[number];
        Random random = new Random();

        for (int i=0;i<number;i++){
            dices[i] = random.nextInt(6)+1;
            System.out.println(dices[i]);
        }
        return dices;
    }

}
