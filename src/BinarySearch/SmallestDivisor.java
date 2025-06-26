package BinarySearch;

public class SmallestDivisor {
//    Given an array of integers nums and an integer threshold, we will choose a positive integer
//    divisor, divide all the array by it, and sum the division's result. Find the smallest divisor
//    such that the result mentioned above is less than or equal to threshold.
//
//    Each result of the division is rounded to the nearest integer greater than or equal to that
//    element. (For example: 7/3 = 3 and 10/2 = 5).
//
//    The test cases are generated so that there will be an answer.


    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int num : nums) end=Math.max(num, end);
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;

            int sum = findSum(mid, nums);

            if(sum <= threshold){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    public int findSum(int div, int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += (int)Math.ceilDiv(num, div);
        }
        return sum;
    }
}
