package ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {
//    Given an array arr containing both positive and negative integers, the task is
//    to compute the length of the largest subarray that has a sum of 0.

    public int maxLength(int[] nums){
        int n = nums.length;
        int[] preSum = new int[n];
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(i == 0){
                preSum[i] =  nums[i];
            }else{
                preSum[i] = nums[i] + preSum[i-1];
            }
            if(preSum[i] == 0){
                maxLength = Math.max(maxLength, i+1);
            }

            if(map.containsKey(preSum[i])){
                maxLength = Math.max(maxLength, i-map.get(preSum[i]));
            }

            if(!map.containsKey(preSum[i])){
                map.put(preSum[i], i);
            }

        }
        return maxLength;
    }
}
