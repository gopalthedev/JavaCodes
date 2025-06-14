package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutations {

    // By using Backtracking
    public void permuteUsingBacktrack(int[] nums, List<List<Integer>> result, List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }else {

            for (int num : nums) {
                if (temp.contains(num)) continue;
                temp.add(num);
                permuteUsingBacktrack(nums, result, temp);
                temp.removeLast();
            }
        }
    }

    //By using the heaps algorithm
    public void permuteUsingHeaps(int[] nums, List<List<Integer>> result, List<Integer> temp){
        int n = nums.length;
        int[] c = new int[n];

        result.add(toList(nums));

        int i=0;
        while(i < n){
            if(c[i] < i){
                if(i % 2 == 0){
                    swap(nums, 0, i);
                }else{
                    swap(nums, c[i], i);
                }

                result.add(toList(nums));
                c[i]++;
                i=0;
            }else{
                c[i] = 0;
                i++;
            }
        }

    }

    public void permuteUsingNextPermutation(int[] nums, List<List<Integer>> result, List<Integer> temp){
        int n = nums.length;
        Arrays.sort(nums);
        result.add(toList(nums));

        while(true){
            int i = n-2;
            while(i>=0 && nums[i] >= nums[i+1]) i--;

            if(i < 0) break;

            int j = n-1;

            while(nums[i] >= nums[j]) j--;

            swap(nums, i, j);
            reverse(nums, i+1);
            result.add(toList(nums));
        }
    }

    public void nextPermutaion(int[] nums){
        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);

        }
        reverse(nums, i+1);
    }

    public void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public List<Integer> toList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            list.add(num);
        }
        return list;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
