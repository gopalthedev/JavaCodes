package BinarySearch;

public class SplitArray {
//    Problem Statement: Given an integer array ‘A’ of size ‘N’ and an integer
//    ‘K'. Split the array ‘A’ into ‘K’ non-empty subarrays such that the largest sum
//    of any subarray is minimized. Your task is to return the minimized largest sum of the split.
//    A subarray is a contiguous part of the array.

    public int splitArray(int[] arr, int k) {
        int n = arr.length;

        if(k > n){
            return -1;
        }

        int start = Integer.MIN_VALUE;
        int end = 0;

        for(int num : arr){
            start = Math.max(start, num);
            end += num;
        }



        while(start <= end){
            int mid = start + (end-start)/2;

            int countOfArray = calSubArrays(arr, mid);
            if(countOfArray <= k){

                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }

    public int calSubArrays(int[] arr, int maxSum){
        int count = 1;
        int sum = 0;
        for(int num : arr){
            if(sum + num > maxSum){
                count++;
                sum = num;
            }else{
                sum += num;
            }
        }
        System.out.println("For " + maxSum + " count : " + count);
        return count;
    }


}
