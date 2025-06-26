package BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
//    Problem Statement: You are given an array 'arr' of size 'n' which denotes the position of stalls.
//    You are also given an integer 'k' which denotes the number of aggressive cows.
//    You are given the task of assigning stalls to 'k' cows such that the minimum distance between
//    any two of them is the maximum possible.
//    Find the maximum possible minimum distance.

    public int getMinDist(int[] stall, int k){
        int n = stall.length;
        Arrays.sort(stall);
        int start = 1;
        int end = stall[n-1] - stall[0];
        int minDist = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(calCows(stall, mid, k)){
                minDist = Math.max(minDist, mid);
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return minDist;
    }

    public boolean calCows(int[] stall, int minDist, int k){
        int n = stall.length;
        int cntCow = 1;
        int last = stall[0];
        for(int i=1; i<n; i++){
            if(stall[i] - last >= minDist){
                cntCow++;
                last = stall[i];
            }
            if(cntCow > k){
                return true;
            }
        }
        return false;
    }

}
