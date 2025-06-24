package BinarySearch;

public class MinimumInRotatedArray {
//    Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
//    For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//            [4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
//    [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//    Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//    You must write an algorithm that runs in O(log n) time.


    public int getMinimum(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[start] <= arr[mid] && arr[mid] <= arr[end]){
                ans = Math.min(ans, arr[start]);
                break;
            }
            else if(arr[start] <= arr[mid]){
                ans = Math.min(ans, arr[start]);
                start = mid+1;
            }
            else if(arr[mid] <= arr[end]){
                ans = Math.min(ans, arr[mid]);
                end = mid-1;
            }
        }

        return ans;
    }
}
