package BinarySearch;

public class Search2DI {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int start =0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int first = matrix[mid][0];
            int last = matrix[mid][m-1];

            if(first <= target && target <= last){
                int low = 0;
                int high = m-1;
                while(low <= high){
                    int mid2 = low + (high-low)/2;
                    if(matrix[mid][mid2] == target){
                        return true;
                    }else if(target < matrix[mid][mid2]){
                        high = mid2-1;
                    }else{
                        low = mid2+1;
                    }
                }
                return false;
            }else if(target > last){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
