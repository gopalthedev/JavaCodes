package BinarySearch;

public class SingleElement {
//    Problem Statement: Given an array of N integers. Every number in
//    the array except one appears twice. Find the single number in the array.

    public int singleNonDuplicate(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }

        if(arr[0] != arr[1]){
            return arr[0];
        }

        if(arr[n-2] != arr[n-1]){
            return arr[n-1];
        }

        int start = 1;
        int end = n-2;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if((mid%2 == 0 && arr[mid] == arr[mid+1]) || (mid%2==1 && arr[mid] == arr[mid-1])){
                start = mid+1;
            }
            else if((mid%2 == 1 && arr[mid] == arr[mid+1]) || (mid%2==0 && arr[mid] == arr[mid-1])){
                end = mid-1;
            }
        }

        return -1;
    }


}
