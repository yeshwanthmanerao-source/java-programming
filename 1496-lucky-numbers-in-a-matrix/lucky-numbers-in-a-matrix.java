import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            int colIndex = 0;

            // Find minimum element in the row
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check whether it is maximum in its column
            boolean lucky = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                result.add(min);
            }
        }

        return result;
    }
}