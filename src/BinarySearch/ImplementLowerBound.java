package BinarySearch;

public class ImplementLowerBound {
//    Problem Statement: Given a sorted array of N integers and an integer x,
//    write a program to find the lower bound of x.

//    The lower bound algorithm finds the first or the smallest index in a sorted array
//    where the value at that index is greater than or equal to a given key i.e. x.
//
//    The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such
//    index is not found, the lower bound algorithm returns n i.e. size of the given array.


    public int lowerBound(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int ind = arr.length;

        while(start <= end){
            int mid = start+ ((end-start)/2);

            if(arr[mid] >= x){
                end = mid-1;
                ind = Math.min(ind, mid);
            }else if(arr[mid] < x){

                start = mid+1;
            }
        }
        return ind;
    }


}
