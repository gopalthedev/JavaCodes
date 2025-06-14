package ArrayProblems;

import java.util.Arrays;

public class LongestConsecutiveSequence {
//    Problem Statement: You are given an array of ‘N’ integers.
//    You need to find the length of the longest sequence which contains the consecutive elements
    // if same numbers are there then consider them as one entity.

    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int curr = 1;
        int maxi = Integer.MIN_VALUE;
        int i=1;

        while(i < n){
            if(arr[i-1] +1 == arr[i]){
                curr++;
            }
            else if(arr[i-1] == arr[i]){
                i++;
                continue;
            }
            else{
                curr = 1;
            }
            maxi = Math.max(maxi, curr);
            i++;
        }
        return maxi;
    }

}
