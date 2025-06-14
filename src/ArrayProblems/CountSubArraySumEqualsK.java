package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumEqualsK {
//    Problem Statement: Given an array of integers and an integer k, return the
//    total number of subarrays whose sum equals k.
//
//    A subarray is a contiguous non-empty sequence of elements within an array.

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
            for(int j=0; j<i; j++){
                if(prefixSum[i]-prefixSum[j] == k){
                    count++;
                }
            }
        }


        return count;
    }
}
