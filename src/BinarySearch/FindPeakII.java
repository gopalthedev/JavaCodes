package BinarySearch;

public class FindPeakII {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int start = 0;
        int end = m-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int row = findMaxEle(mat, mid);
            int num = mat[row][mid];
            int left = mid > 0 ? mat[row][mid-1] : -1;
            int right = mid < m-1? mat[row][mid+1] : -1;

            if(num> left && num > right){
                return new int[]{row, mid};
            }
            else if(left > num){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return new int[]{-1, -1};
    }


    public int findMaxEle(int[][] mat, int col){
        int n = mat.length;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<n; i++){
            if(mat[i][col] > max){
                index = i;
                max = mat[i][col];
            }
        }
        return index;
    }
}
