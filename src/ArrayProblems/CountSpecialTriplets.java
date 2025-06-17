package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class CountSpecialTriplets {
//Problem Statement
//    You are given an integer array nums.
//    A special triplet is defined as a triplet of indices (i, j, k) such that:
//    0 <= i < j < k < n, where n = nums.length
//    nums[i] == nums[j] * 2
//    nums[k] == nums[j] * 2
//    Return the total number of special triplets in the array.
//    Since the answer may be large, return it modulo 109 + 7.

    int mod = 1000000007;

    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> mapWhole = new HashMap<>();
        Map<Integer, Integer> mapCurr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mapWhole.put(nums[i], mapWhole.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (mapCurr.containsKey(2 * num) && mapWhole.containsKey(2 * num)) {
                if (num == 0) {
                    int left = mapCurr.get(2 * num);
                    int right = mapWhole.get(2 * num) - mapCurr.get(2 * num) - 1;
                    int total = left * right;
                    ans = (ans+total)%mod;
                } else {
                    int left = mapCurr.get(2 * num);
                    int right = mapWhole.get(2 * num) - mapCurr.get(2 * num);
                    int total = left * right;
                    ans = (ans+total)%mod;
                }

            }

            mapCurr.put(num, mapCurr.getOrDefault(num, 0) + 1);
        }
        return ans%mod;
    }
}
