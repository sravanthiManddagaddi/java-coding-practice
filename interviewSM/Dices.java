package Coding.interviewSM;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int noOfDices = 10;
        int[] dices = throwDice(noOfDices);
        int count = findTurnCount(dices);
        System.out.println("The number of turns :"+count);
    }

    private static int findTurnCount(int[] dices) {
        int count =0;
        for(int dice:dices){
            if(dice==1){
                count+=2;
                continue;
            }
            if(dice==6){
                continue;
            }
            count++;
        }
        return count;
    }

    private static int[] throwDice(int noOfDices) {
        int[] dice = new int[noOfDices];
        Random rand = new Random();
        for(int i=0;i<noOfDices;i++){
            dice[i] = rand.nextInt(6)+1;
            System.out.println(dice[i]);
        }
    return dice;
    }

}
