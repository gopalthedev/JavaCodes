package ArrayProblems;

import java.util.*;

public class ThreeSum {
//    Given an integer array nums, return all the triplets [nums[i], nums[j],
//    nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//    Notice that the solution set must not contain duplicate triplets.

    //Approach 1.
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n; i++){
            Set<Integer> freqSet = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int key = -1*(nums[i]+nums[j]);
                if(freqSet.contains(key)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(key);
                    Collections.sort(temp);
                    set.add(temp);
                }
                freqSet.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }

    //Approach 2.
    public List<List<Integer>> triplets(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;

            if(i != 0 && nums[i] == nums[i-1]) continue;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k++;
                }
            }
        }
       return result;
    }

}
