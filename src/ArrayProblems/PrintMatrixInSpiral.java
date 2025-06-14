package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int N = n*m;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        int count  = 0;
        int i=0;
        int j=0;

        while(count < N){
            while(count < N && j <= colEnd){
                result.add(matrix[rowStart][j]);
                j++;
                count++;

            }
            i++;
            j--;
            rowStart++;

            while(count < N && i <= rowEnd) {
                result.add(matrix[i][colEnd]);
                i++;
                count++;
            }
            i--;
            j--;
            colEnd--;

            while(count < N && j >= colStart){
                result.add(matrix[rowEnd][j]);
                j--;
                count++;
            }
            j++;
            i--;
            rowEnd--;

            while(count < N && i >= rowStart){
                result.add(matrix[i][colStart]);
                i--;
                count++;
            }
            i++;
            j++;
            colStart++;
        }

        return result;
    }

    public List<Integer> spiralOrder(int[][] matrix, int diff) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int j = colStart; j <= colEnd; j++) {
                result.add(matrix[rowStart][j]);
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {  // Check if there's a row left
                // Traverse left
                for (int j = colEnd; j >= colStart; j--) {
                    result.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {  // Check if there's a column left
                // Traverse up
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }
}
