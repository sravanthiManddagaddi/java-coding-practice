package Coding.Random;

public class Permutations {
    public static void printPermutations(String prefix, String input) {
        if (input.length() == 0) {
            System.out.println(prefix);
            return;
        }
        int i=0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == '?') {
                break;
            }
        }
        if (i == input.length()) {
            printPermutations(prefix, "");
        } else {
            printPermutations(prefix + input.substring(0, i) + "0", input.substring(i+1));
            printPermutations(prefix + input.substring(0, i) + "1", input.substring(i+1));
        }
    }

    public static void main(String[] args) {
        String TEST_STRING = "1010?10?1?";
        printPermutations("", TEST_STRING);
    }
}
