package BinarySearch;

public class KthMissing {
//    Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//    Return the kth positive integer that is missing from this array.

    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int missing_nums = arr[mid] - (mid+1);
            if(missing_nums < k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return k+end+1;
    }
}
