package BinarySearch;

public class NumberOfOcc {

    //    Problem Statement: You are given a sorted array containing N integers and a
//        number X, you have to find the occurrences of X in the given array.


    public int binarySearch(int[] arr, int start, int end, int target){
        if(start > end) return 0;
        int mid = start + (end - start)/2;
        int count = 0;
        if(arr[mid] == target){
            count++;
            count += binarySearch(arr, start, mid-1, target);
            count += binarySearch(arr, mid+1, end, target);
        }else if(arr[mid] < target){
            count += binarySearch(arr, mid+1, end, target);
        }else{
            count += binarySearch(arr, start, mid-1, target);
        }

        return count;
    }
    public  int countFreq(int[] arr, int target) {
        int n = arr.length;
        int ans = binarySearch(arr, 0, n-1, target);
        return ans;
    }
}
