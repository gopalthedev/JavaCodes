package BinarySearch;

public class KthElementOfSortedArrays {
//    Problem Statement: Given two sorted arrays of size m and n respectively,
//    you are tasked with finding the element that would be at the kth position of the final sorted array.

    public int findMedianOfSortedArray(int[] nums1, int[] nums2, int k){
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2){
            return findMedianOfSortedArray(nums2, nums1, k);
        }

        int n = n1+n2;
        int start = Math.max(0, k-n2);
        int end = Math.min(k, n1);


        while(start <= end){
            int mid1 = start + (end-start)/2;
            int mid2 = k -mid1;
            int l1 = mid1 > 0 ? nums1[mid1-1] : Integer.MIN_VALUE;
            int l2 = mid2 > 0 ? nums2[mid2-1] : Integer.MIN_VALUE;
            int r1 = mid1 < n1 ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n2 ? nums2[mid2] : Integer.MAX_VALUE;

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1, l2);
            }
            else if(l1 > r2){
                end = mid1-1;
            }else{
                start = mid1+1;
            }

        }
        return 0;
    }

}
