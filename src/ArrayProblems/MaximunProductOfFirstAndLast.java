package ArrayProblems;

import java.util.ArrayList;

public class MaximunProductOfFirstAndLast {
//    Problem Statement
//    You are given an integer array nums and an integer m.
//    Return the maximum product of the first and last elements of any subsequence of nums of size m.
    long maxProduct = Long.MIN_VALUE;

    public void backtrack(ArrayList<Integer> list, int[] nums, int lastIndex, int m){
        if(list.size() == m){
            long currentProduct = list.getFirst() *list.getLast();
            System.out.println(list);
            System.out.println(currentProduct);
            maxProduct = Math.max(maxProduct, currentProduct);
            return;
        }

        for(int i=lastIndex+1; i<nums.length; i++){
            list.add(nums[i]);
            backtrack(list, nums, i, m);
            list.removeLast();
        }
    }
    public long maximumProduct(int[] nums, int m) {

        backtrack(new ArrayList<>(), nums, -1, m);
        return maxProduct;
    }
}
