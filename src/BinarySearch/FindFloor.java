package BinarySearch;

public class FindFloor {
//    Given a sorted array arr[] and an integer x, find the index (0-based) of
//    the largest element in arr[] that is less than or equal to x. This element
//    is called the floor of x. If such an element does not exist, return -1.
//    Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

    public int findFloor(int[] arr, int x) {
        // write code here
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ind = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x) {
                start = mid + 1;
                ind = Math.max(ind, mid);
            } else {
                end = mid - 1;
            }
        }
        return ind;
    }

}
