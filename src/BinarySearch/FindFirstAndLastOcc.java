package BinarySearch;

public class FindFirstAndLastOcc {
//    Given an array of integers nums sorted in non-decreasing order,
//    find the starting and ending position of a given target value.
//
//    If target is not found in the array, return [-1, -1].
//
//    You must write an algorithm with O(log n) runtime complexity.

    public void findFirst(int[] arr, int start, int end, int[] ans, int target){
        if(start > end) return;

        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            ans[0] = Math.min(ans[0], mid);
            ans[1] = Math.max(ans[1], mid);
            findFirst(arr, start, mid-1, ans, target);
            findFirst(arr, mid+1, end, ans, target);

        }else if(arr[mid] > target){
            findFirst(arr, start, mid-1, ans, target);
        }else{
            findFirst(arr, mid+1, end, ans, target);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        findFirst(nums, 0, n-1, ans, target);
        if(ans[0] == Integer.MAX_VALUE){
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
}
