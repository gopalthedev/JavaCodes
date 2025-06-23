package BinarySearch;

public class SearchInRotatedSortedArray {
//    There is an integer array nums sorted in ascending order (with distinct values).
//
//    Prior to being passed to your function, nums is possibly rotated at an unknown pivot
//    index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ...,
//    nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might
//    be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//    Given the array nums after the possible rotation and an integer target, return the index of
//    target if it is in nums, or -1 if it is not in nums.
//
//    You must write an algorithm with O(log n) runtime complexity.

    public int binarySearch(int[]arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int bp = 0;
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(nums[i]> nums[i+1]){
                bp = i;
                break;
            }
        }


        int ans = binarySearch(nums, 0, bp, target);
        int ans2 = binarySearch(nums, bp+1, n-1, target);

        if(ans == -1 && ans2 == -1)return -1;
        if(ans == -1) return ans2;
        return ans;
    }
}
