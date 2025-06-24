package BinarySearch;

public class FindRotation {
//    Problem Statement: Given an integer array arr of size N, sorted in ascending order
//    (with distinct values). Now the array is rotated between 1 to N times which
//    is unknown. Find how many times the array has been rotated.

    public int findRotation(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int indexOfMin = -1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[start] <= arr[mid] && arr[mid] <= arr[end]){
                if(arr[start] <= min){
                    min = arr[start];
                    indexOfMin = start;
                    break;
                }
                break;
            }
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= min) {
                    min = arr[start];
                    indexOfMin = start;
                }
                start = mid + 1;
            }else if(arr[mid] <= arr[end]){
                if(arr[mid] <= min){
                    min = arr[mid];
                    indexOfMin = mid;
                }
                end = mid-1;
            }
        }
        System.out.println(min);
        return (n-indexOfMin) % n;
    }

}
