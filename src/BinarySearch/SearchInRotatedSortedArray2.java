package BinarySearch;

public class SearchInRotatedSortedArray2 {
//    There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
//
//    Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
//    such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
//            (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become
//        [4,5,6,6,7,0,1,2,4,4].
//
//    Given the array nums after the rotation and an integer target, return true if target is in nums, or
//    false if it is not in nums.
//
//    You must decrease the overall operation steps as much as possible.

    public boolean binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int bp=0;
        for(int i=0;i<n-1; i++){
            if(nums[i] > nums[i+1]){
                bp = i;
                break;
            }
        }

        boolean left = binarySearch(nums, 0, bp, target);
        boolean right = binarySearch(nums, bp+1, n-1, target);
        return left|right;
    }
}
