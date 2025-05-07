package Coding.String;

public class StringDifferenceChecker {
    public static boolean isKDifference(String s1, String s2, int k) {
        // If strings are of different lengths, return false
        if (s1.length() != s2.length()) {
            return false;
        }

        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                diffCount++;
                if (Math.abs(c1 - c2) != k) {
                    return false;
                }
            }

            // More than one mismatch means return false
            if (diffCount > 1) {
                return false;
            }
        }

        return diffCount == 1;
    }

    public static void main(String[] args) {
        /*You're trying to compare two strings (s1 and s2) and
        return true if exactly one character is different between them,
        and the difference in the character values is equal to k.*/
        String s1 = "abcd";
        String s2 = "abce";
        int k = 1;

        System.out.println(isKDifference(s1, s2, k));  // Output: true
        System.out.println(isKDifference("abcd", "abcg", k)); // Output: false difference is more than k
        System.out.println(isKDifference("abcd", "abdg", k)); // Output: false more than 2 char is different

    }
}

