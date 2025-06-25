package BinarySearch;

public class PeakElement {
//    Problem Statement: Given an array of length N. Peak element is defined as the element
//    greater than both of its neighbors. Formally, if 'arr[i]' is the peak element,
//    'arr[i - 1]' < 'arr[i]' and 'arr[i + 1]' < 'arr[i]'. Find the index(0-based) of a
//    peak element in the array. If there are multiple peak numbers, return the index of any peak number.
//
//    Note: For the first element, the previous element should be considered as negative infinity as
//    well as for the last element, the next element should be considered as negative infinity.


    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n == 1)return 0;
        int ans = -1;
        int start = 1;
        int end = n-2;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                ans = mid;
                break;
            }
            else if(arr[mid] > arr[mid-1] || arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid] > arr[mid+1] || arr[mid] < arr[mid-1]){
                end = mid-1;
            }
        }

        if(arr[0] > arr[1] && ans == -1) return 0;
        if(arr[n-1] > arr[n-2] && ans == -1) return n-1;

        return ans;
    }

}
