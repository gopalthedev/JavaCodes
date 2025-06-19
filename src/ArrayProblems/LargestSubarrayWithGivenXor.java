package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithGivenXor {
//    Given an array of integers arr[] and a number k, count the number of
//    subarrays having XOR of their elements as k.

    public long subArrayXor(int arr[], int k) {
        int n = arr.length;
        int[] preSum = new int[n];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(i==0){
                preSum[i] = arr[i];
            }else{
                preSum[i] = preSum[i-1] ^ arr[i];
            }

            if(preSum[i] == k){
                count++;
            }

            if(map.containsKey(preSum[i]^k)){
                count++;
            }

            map.put(preSum[i], map.getOrDefault(preSum[i], 0)+1);
        }

        return count;
    }
}
