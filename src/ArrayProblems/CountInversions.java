package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class CountInversions {
//    Given an array of integers arr[]. Find the Inversion Count in the array.
//    Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
//
//    Inversion Count: For an array, inversion count indicates how far (or close) the
//    array is from being sorted. If the array is already sorted then the inversion count is 0.
//    If an array is sorted in the reverse order then the inversion count is the maximum.

    public int merge(int[]arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid+1;
        int cnt = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                cnt += (mid-i+1);
                j++;
            }
        }

        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }

        while(j <= high){
            temp.add(arr[j]);
            j++;
        }

        for(int i1 = low; i1<= high; i1++){
            arr[i1] = temp.get(i1-low);
        }
        return cnt;
    }
    public int mergeSort(int[] arr, int low, int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }
    public int inversionCount(int[] arr){
        int ans = mergeSort(arr, 0, arr.length-1);
        return ans;
    }
}
