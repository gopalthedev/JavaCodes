package ArrayProblems;

import java.util.*;

public class FourSum {
//    Problem Statement: Given an array of N integers, your task is to find unique quads that add up
//    to give a target value. In short, you need to return an array of all the unique
//    quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                Set<Integer> set = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int rem = target - sum;
                    if(set.contains(rem)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[k]);
                        temp.add(nums[j]);
                        temp.add(rem );
                        Collections.sort(temp);
                        resultSet.add(temp);
                    }
                    set.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(resultSet);
    }

    public List<List<Integer>> quadrapal(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
         for(int i=0; i<n; i++){
             if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;

                while(k < l){
                    long sum = nums[i];
                    sum+= nums[j];
                    sum+= nums[k];
                    sum+= nums[l];

                    if(sum < target) k++;
                    else if(sum > target) l--;
                    else{
                        result.add(List.of(nums[i] , nums[j] , nums[k], nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1])k++;
                        while(k < l && nums[j] == nums[l+1])l--;
                    }
                }
            }
        }
        return result;
    }
}
