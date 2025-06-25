package BinarySearch;

public class SquareRootInLogN {
//    Problem Statement: You are given a positive integer n. Your task is to find
//    and return its square root. If ‘n’ is not a perfect square, then return the floor value of 'sqrt(n)'.
//    Note: The question explicitly states that if the given number, n, is not a perfect square,
//    our objective is to find the maximum number, x, such that x squared is less than or equal to n (x*x <= n).
//    In other words, we need to determine the floor value of the square root of n.



    public int sqrt(int n){
        if(n == 0) return 0;

        int start = 1;
        int end = n;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid <= n){
                ans = Math.max(ans, mid);
                start = mid+1;
            }else if(mid*mid > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
