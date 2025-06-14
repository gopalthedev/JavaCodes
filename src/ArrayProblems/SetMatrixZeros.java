package ArrayProblems;

import java.util.LinkedList;
import java.util.Queue;

public class SetMatrixZeros {
//    Problem Statement: Given a matrix if an element in the matrix is 0 then you will
//    have to set its entire column and row to 0 and then return the matrix.

    public void makeZeros(int[][] mat, int row, int col){
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0; i<n; i++){
            mat[i][col] = 0;
        }

        for(int j=0; j<m; j++){
            mat[row][j] = 0;
        }
    }

    class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Queue<Pair> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    q.add(new Pair(i, j));
                }
            }
        }

        while(!q.isEmpty()){
            Pair pair = q.poll();
            int row = pair.i;
            int col = pair.j;

            makeZeros(matrix, row, col);

        }
    }
}
