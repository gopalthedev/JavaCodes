package ArrayProblems;

public class RotateMatrixBy90 {

    public void swapRowCol(int[][] matrix, int row){
        int n = matrix.length;
        for(int i=row; i<n; i++){
            int temp = matrix[i][row];
            matrix[i][row] = matrix[row][i];
            matrix[row][i] = temp;
        }
    }

    public void swapCol(int[][] matrix){
        int n = matrix.length;
        for(int j=0; j<n/2; j++){
            for(int i=0; i<n; i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        // take transpose of matrix
        // then swap the relative columns

        int n = matrix.length;

        for(int i=0; i<n; i++){
            swapRowCol(matrix, i);
        }

        swapCol(matrix);

    }
}
