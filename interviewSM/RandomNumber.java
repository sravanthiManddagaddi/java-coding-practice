package Coding.interviewSM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RandomNumber {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy-HHmmss");
        System.out.println(dateTime.format(formatter));
        for(int i=1;i<=5;i++) {
            System.out.println(System.nanoTime());
        }
    }
}
