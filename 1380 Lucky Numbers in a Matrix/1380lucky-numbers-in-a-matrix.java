import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int colindex = 0;

            // Find min element in the row and its column index
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colindex = j;
                }
            }

            // Check if min is max in its column
            boolean ismax = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colindex] > min) {
                    ismax = false;
                    break;
                }
            }

            if (ismax) {
                lucky.add(min);
            }
        }

        return lucky;
    }
}
