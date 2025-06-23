package BinarySearch;

public class ImplementUpperBound {
//    Problem Statement: Given a sorted array of N integers and an integer x,
//    write a program to find the upper bound of x.
//
//    The upper bound algorithm finds the first or the smallest index in a sorted array
//    where the value at that index is greater than the given key i.e. x.
//    The upper bound is the smallest index, ind, where arr[ind] > x.
//     But if any such index is not found, the upper bound algorithm
//    returns n i.e. size of the given array. The main difference between the lower and upper bound is in the condition. For the lower bound the condition was arr[ind] >= x and here, in the case of the upper bound, it is arr[ind] > x.

    public int upperBound(int[] arr, int x){
        int start = 0;
        int end = arr.length;
        int ind = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] <= x){
                start = mid+1;
            }
            else{
                end = mid-1;
                ind = Math.min(mid, ind);
            }
        }
        return ind;
    }
}
