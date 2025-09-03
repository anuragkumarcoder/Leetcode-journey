import java.util.*;

public class Solution {
    public static String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        generate(n, "", result);

        if (k > result.size()) return "";
        return result.get(k - 1);
    }

    public static void generate(int n, String curr, List<String> result) {
        // Base case: string reached length n
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        // Try 'a', 'b', 'c' one by one using normal for loop
        for (int i = 0; i < 3; i++) {
            char c = (char) ('a' + i); // generates 'a', 'b', 'c'

            // skip if same as last character
            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == c) {
                continue;
            }

            // Recursive step: append char and go deeper
            generate(n, curr + c, result);
        }
    }

    // Test the program
    public static void main(String[] args) {
        int n = 3, k = 9;
        System.out.println(getHappyString(n, k)); // Output: cab
    }
}
