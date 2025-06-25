package BinarySearch;

public class NthRoot {
//    Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root
//    of a number M is defined as a number X when raised to the power N equals M.
//    If the 'nth root is not an integer, return -1.

        public int getNthRoot(int n, int m){
            int ans = -1;
            int start = 1;
            int end = m;

            while(start <= end){
                int mid = start + (end-start)/2;
                double root = Math.pow(mid, n);
                if(root == (double)m){
                    ans = mid;
                    break;
                }
                else if(root > m){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return ans;
        }
}
