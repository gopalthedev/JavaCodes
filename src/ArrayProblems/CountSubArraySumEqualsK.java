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
        if(n == 1 && nums[0] == k){
            return 1;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;
    }

}
